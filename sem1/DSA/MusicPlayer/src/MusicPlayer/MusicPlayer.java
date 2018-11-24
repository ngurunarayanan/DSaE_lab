package MusicPlayer;
import java.util.*;

public class MusicPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loop = 1;
		int choice = 0;
		Scanner in = new Scanner(System.in);
		PlayList list = new PlayList();
		while (loop == 1) {
			System.out.println("Enter Choice:");
			System.out.println("1. add song");
			System.out.println("2. delete song by index");
			System.out.println("3. Find song by name");
			System.out.println("4. Next/previous");
			System.out.println("5. Sort list");
			System.out.println("6. display list");
			choice = in.nextInt();
			in.nextLine();
			switch (choice) {
			case 1: {
				String title;
				int duration;
				System.out.println("Enter Song title");
				title = in.nextLine();
				System.out.println("Enter duration in seconds");
				duration = in.nextInt();
				list.addSong(title,duration);
				break;
			}
			case 2: {
				int index;
				System.out.println("Enter index");
				index = in.nextInt();
				list.deleteSong(index);
				break;
			}
			case 3: {
				String title;
				System.out.println("Enter title to search");
				title = in.nextLine();
				list.findSong(title);
				break;
			}
			case 4: {
				int cur_index;
				int opt = 0;
				System.out.println("Enter start index");
				cur_index = in.nextInt();
				System.out.println("1. Next");
				System.out.println("2. Previous");
				opt = in.nextInt();
				if (opt == 1) {
					list.getSongAt(cur_index + 1);
				} else if (opt == 2) {
					list.getSongAt(cur_index - 1);
				} else {
					System.out.println("Invalid option");
				}
				break;
			}
			case 5: {
				list.sortList();
				break;
			}
			case 6: {
				list.displayList();
				break;
			}
			default:
				System.out.println("Invalid Choice.");
			}
			System.out.println("Enter 1 to continue;");
			loop = in.nextInt();
			
		}
		in.close();
	}

}
