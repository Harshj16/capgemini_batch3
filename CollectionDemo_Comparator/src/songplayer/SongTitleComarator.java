package songplayer;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SongTitleComarator implements Comparator<Song> {

	@Override
	public int compare(Song s1, Song s2) {
		
		return s1.getTitle().compareTo(s2.getTitle());
	}

	

}
