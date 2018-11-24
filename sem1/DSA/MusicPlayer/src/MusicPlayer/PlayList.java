/**
 * 
 */
package MusicPlayer;
import java.util.*;
/**
 * @author 41225
 *
 */
public class PlayList {
	ArrayList<Song> SongList;
	public PlayList() {
		// TODO Auto-generated constructor stub
		SongList = new ArrayList<Song>();
	}
	public void addSong(String title, int seconds) {
		Song song = new Song(title, seconds);
		SongList.add(song);
		return;
	}
	
	public void displayList() {
		int i = 1;
		for (Song temp : SongList) {
			System.out.println(i + ". " + temp.getTitle() + " - " + 
					temp.getDuration()/60 + ":" + temp.getDuration()%60);
			i++;
		}
		return;
	}
	public void deleteSong(int index) {
		if ((index < 1) || (index > SongList.size())) {
			System.out.println("Invalid index");
			return;
		}
		SongList.remove(index - 1);
		return;
	}
	public void findSong(String title) {
		int i = 1;
		for (Song temp : SongList) {
			if (temp.getTitle().equalsIgnoreCase(title)) {
				System.out.println("Found song " + title + " at index " + i);
				return;
			}
			i++;
		}
		System.out.println("Not found");
		return;
	}
	public void sortList() {
		Collections.sort(SongList);
		return;
	}
	public void getSongAt(int index) {
		if ((index < 1) || (index > SongList.size())) {
			System.out.println("Invalid index");
			return;
		}
		System.out.println(SongList.get(index - 1).getTitle() + ":" +
				SongList.get(index - 1).getDuration());
		return;
	}
}
	
