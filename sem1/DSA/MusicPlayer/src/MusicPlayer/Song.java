/**
 * 
 */
package MusicPlayer;

/**
 * @author 41225
 *
 */
public class Song implements Comparable<Song> {
	String title;
	int duration;
	public Song(String title, int duration) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	public int getDuration() {
		return duration;
	}
	@Override
	public int compareTo(Song s2) {
		return title.compareToIgnoreCase(s2.getTitle());
	}
}
