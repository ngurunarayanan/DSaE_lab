package hostpital_management;
import java.util.*;

public class hospitalConsultation {

	public static void main(String[] args) {
		Scanner in;
		int pid = 0;
		in = new Scanner(System.in);
		patientRecord record = new patientRecord();
		patientNode node;
		consultQueue queue = new consultQueue(100);
		String cont = "yes";
		int menu_choice = 0;
		while (cont.equalsIgnoreCase("yes")) {
			System.out.println("Menu:\n");
			System.out.println("1. Register Patient");
			System.out.println("2. Display/Dequeue Next Patient");
			System.out.println("3. Display Queue");
			menu_choice = in.nextInt();
			switch (menu_choice) {
			case 1:
				String name;
				int age;
				System.out.println("Enter name:");
				name = in.next();
				System.out.println("Enter age");
				age = in.nextInt();
				node = new patientNode(name, age, pid++);
				record.registerPatient(node);
				if (queue.enqueuePatient(node) != 0) {
					record.removePatient(node);
				}
				break;
			case 2:
				node = queue.nextPatient();
				record.removePatient(node);
				break;
			case 3:
				queue.displayQueue();
				break;
			default:
				System.out.println("Invalid choice");
			}
			
			int ask_again = 0;
			do {
				System.out.println("Do you want to return to main menu?");
				cont = in.next();
				if (!cont.equalsIgnoreCase("yes") && !cont.equalsIgnoreCase("no")) {
					ask_again = 1;
					System.out.println("enter yes or no");
				} else {
					ask_again = 0;
				}
			} while (ask_again == 1);
		}
		
		in.close();
		System.out.println("Tank you");
	}
	
	

}
