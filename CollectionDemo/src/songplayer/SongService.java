package songplayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongService {

	public void start() {
		// getSongList from songlist.txt file
		List<Song> songs = getSongs();
		List<String> songTitles = new ArrayList<>();
		for (Song song : songs) {
			songTitles.add(song.getTitle());
		}
		// Display song list
		System.out.println("---------Before Sorting------------");
		for (String songTitle : songTitles) {
			System.out.println(songTitle);
		}
		// Sort songs in alphabetical order
		Collections.sort(songTitles);
		// Display song list
		System.out.println("---------After Sorting------------");
		for (String songTitle : songTitles) {
			System.out.println(songTitle);
		}

	}

	private List<Song> getSongs() {
		List<Song> songList = new ArrayList<>();
		try {
			File file = new File("songlist.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split("/");
				Song song = new Song();
				song.setTitle(tokens[0]);
				song.setSinger(tokens[1]);
				song.setRating(Integer.parseInt(tokens[2]));
				song.setYear(tokens[3]);
				songList.add(song);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return songList;
	}

}
