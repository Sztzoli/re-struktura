package week05.d05.senior;

public class Song {
    /*
    Készítsünk egy Song osztályt, melynek az alábbi mezői vannak:

String name
long lengthInSeconds
String artist
A Song konstruktorában ellenőrizd, hogy a name és az artist üres-e!
Dobj kivételt, ha igen! Ellenőrizd továbbá a lengthInSeconds-ot is,
hogy nagyobb legyen, mint 0! Készítsünk egy Playlist osztályt, melynek van egy konstruktora,
amiben Song-ok listáját fogadja el! Írjunk egy metódust findByLengthGreaterThan néven, mely egy int-et vár
 paraméterként mins néven. Azoknak a Song-oknak a listáját adjuk vissza, melyek hosszabbak percben (!), mint a Song lengthInSeconds mezője.

Bónusz feladat: Implementáljuk megfelelően a toString metódust a Song és a Playlist osztályban, hogy a Playliset-et kiirva a konzolra olvasható eredményt kapjunk!
     */

    private String name;
    private long lengthInSeconds;
    private String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        checkParams(name, artist, lengthInSeconds);
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }

    private void checkParams(String name, String artist, long lengthInSeconds) {
        if (isEmpty(name) || isEmpty(artist)) {
            throw new IllegalArgumentException();
        }
        if (lengthInSeconds<=0) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isEmpty(String str) {
        return str==null || str.isBlank();
    }

    public String getName() {
        return name;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", lengthInSeconds=" + lengthInSeconds +
                ", artist='" + artist + '\'' +
                '}';
    }
}
