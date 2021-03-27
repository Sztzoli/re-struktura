package erettsegi.o2005.matuka;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatukaDao {

    private JdbcTemplate jdbcTemplate;

    public MatukaDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public List<Dog> selectByDalmata() {
        String sql = "SELECT `id`, `breed`, `sex`, `age`, `name` from `dogs` WHERE `breed` = 'dalmata'";
        return jdbcTemplate.query(sql, MatukaDao::mapRowForDog);
    }

    public List<String> selectByXIIDistrict() {
        String sql = "SELECT dogs.name,missing_dogs.time FROM `dogs` LEFT JOIN `missing_dogs` ON `dogs`.id = `missing_dogs`.id WHERE `place`='XIII. kerület'";
        return jdbcTemplate.query(sql, getStringRowMapperNameAndTime());
    }


    public List<String> selectAfterTime() {
        String sql = "SELECT dogs.name,missing_dogs.time FROM `dogs` LEFT JOIN `missing_dogs` ON `dogs`.id = `missing_dogs`.id WHERE `time` > '2004-12-31'";
        return jdbcTemplate.query(sql, getStringRowMapperNameAndTime());
    }

    public String selectLostDogOldestCase() {
        String sql = """
                SELECT dogs.name,missing_dogs.time
                  FROM `dogs` LEFT JOIN `missing_dogs`\s
                  ON `dogs`.id = `missing_dogs`.id\s
                  WHERE dogs.sex = 'kan'
                  ORDER BY missing_dogs.time
                  LIMIT 1""";
       List<String> result = jdbcTemplate.query(sql, getStringRowMapperNameAndTime());
       return result.get(0);
    }

    public Map<String, Integer> statisticsForDogWithoutMixedBreed() {
        String sql = "SELECT dogs.breed, COUNT(dogs.breed) \n" +
                " FROM dogs\n" +
                " WHERE dogs.breed\n" +
                " NOT LIKE '%keverék%'\n" +
                " GROUP BY dogs.breed";
        return jdbcTemplate.query(sql, resultSet -> {
            HashMap<String , Integer> result = new HashMap<>();
            while (resultSet.next()) {
                result.put(resultSet.getString(1),resultSet.getInt(2));
            }
            return result;
        });
    }

    private RowMapper<String> getStringRowMapperNameAndTime() {
        return (rs, i) ->
                "name: " + rs.getString("dogs.name")
                        + ";time: " + rs.getTimestamp("missing_dogs.time").toLocalDateTime();
    }

    private static Dog mapRowForDog(ResultSet rs, int i) throws SQLException {
        return new Dog(
                rs.getLong("id"),
                rs.getString("breed"),
                rs.getString("sex"),
                rs.getString("age"),
                rs.getString("name")
        );
    }
}
