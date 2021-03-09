package week05.d05.senior;

import java.util.List;
import java.util.stream.Collectors;

public class Playlist {

    List<Song> songs;

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    List<Song> findByLengthGreaterThan(int mins) {
        return songs.stream()
                .filter(song -> song.getLengthInSeconds()>mins)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "songs=" + songs +
                '}';
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist(
                List.of(
                        new Song("a",100,"a"),
                        new Song("b",150,"b"),
                        new Song("c",200,"c")
                )
        );
        System.out.println(playlist.findByLengthGreaterThan(100));
        System.out.println(playlist);
    }
}
