import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Album album = new Album("Test Album", "Artist");

        album.addSong("Song 1", 3.5);
        album.addSong("Song 2", 4.0);
        album.addSong("Song 3", 5.0);
        album.addSong("Song 4", 4.5);

        LinkedList<Song> playList = new LinkedList<>();

        album.addToPlayList("Song 1", playList);
        album.addToPlayList("Song 3", playList);
        album.addToPlayList("Wrong Song", playList);

        album.addToPlayList(2, playList);
        album.addToPlayList(10, playList);

        System.out.println("\nPlaylist:");

        for (Song song : playList) {
            System.out.println(song.getTitle());
        }
    }
}