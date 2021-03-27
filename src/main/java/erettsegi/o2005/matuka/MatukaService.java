package erettsegi.o2005.matuka;

public class MatukaService {

    private MatukaDao matukaDao;

    public MatukaService(MatukaDao matukaDao) {
        this.matukaDao = matukaDao;
    }

    public void listByDalmata() {
        matukaDao.selectByDalmata().stream()
                .map(Dog::toStringByBreed)
                .forEach(System.out::println);
    }

    public void listByXIII () {
        matukaDao.selectByXIIDistrict()
                .forEach(System.out::println);
    }

    public void listByTime() {
        matukaDao.selectAfterTime()
                .forEach(System.out::println);
    }

    public void listByOldestCase() {
        System.out.println(matukaDao.selectLostDogOldestCase());
    }

    public void statisticsForDog() {
        matukaDao.statisticsForDogWithoutMixedBreed()
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
