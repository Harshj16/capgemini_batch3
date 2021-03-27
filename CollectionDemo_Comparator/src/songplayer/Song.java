package songplayer;

public class Song {
	
	private String title;
	private String singer;
	private int rating;
	private String year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", singer=" + singer + ", rating=" + rating + ", year=" + year + "]";
	}
	

}
