package songplayer;

import java.util.Comparator;

public class SongSingerComarator implements Comparator<Song> {

	@Override
	public int compare(Song s1, Song s2) {
		
		return s1.getSinger().compareTo(s2.getSinger());
	}



}
