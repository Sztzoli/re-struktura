package erettsegi.o2005.matuka;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

public class Matuka {


    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/matuka?useUnicode=true");
            dataSource.setUser("matuka");
            dataSource.setPassword("matuka");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        Flyway flyway = Flyway.configure()
                .locations("filesystem:src/main/resources/erettsegi/o2005/matuka")
                .dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        MatukaService service = new MatukaService(new MatukaDao(dataSource));

        service.listByDalmata();
        service.listByXIII();
        service.listByTime();
        service.listByOldestCase();
        service.statisticsForDog();
    }
}
