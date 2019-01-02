package hostpital_management;


public class consultQueue {
	patientNode[] list;
	int max_count;
	int count;
	
	public consultQueue(int max_count) {
		this.max_count = max_count;
		list = new patientNode [max_count];
		count = 0;
	}

	int enqueuePatient(patientNode node) {
		if (count == max_count) {
			System.out.println("Queue full");
			return (-1);
		}
		list[count] = node;
		count++;
		
		heap_sort();
		return (0);
	}
	patientNode nextPatient() {
		patientNode node = dequeuePatient();
		if (node == null) {
			System.out.println("Queue is empty");
			return (null);
		}
		System.out.println(node.id + ", " + node.Name + ", " + node.age);
		return node;
	}
	patientNode dequeuePatient() {
		if (count == 0) {
			return null;
		}
		patientNode ret_node = list[0];
		for (int i = 0; i < count - 1; i++) {
			list[i] = list[i+1]; 
		}
		list[count-1] = null;
		count--;
		return ret_node;
	}
	void displayQueue() {
		for (int i = 0; i < count; i++) {
			System.out.println(i+1 + ", " + list[i].id + ", " + list[i].Name + ", " + list[i].age);
		}
	}
	void heap_sort() {
		for (int i = count/2 - 1; i >= 0; i--) {
			heapify(count, i);
		}
		
		for (int i = count - 1; i >= 0; i--) {
			patientNode swap = list[0];
			list[0] = list[i];
			list[i] = swap;
			
			heapify(i, 0);
		}
	}
	
	void heapify(int n, int i) {
		int smallest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if ((l < n) && (list[l].age < list[smallest].age)) {
			smallest = l;
		}
		if ((r < n) && list[r].age < (list[smallest].age)) {
			smallest = r;
		}
		if (smallest != i) {
			patientNode swap = list[i];
			list[i] = list[smallest];
			list[smallest] = swap;
			heapify(n, smallest);
		}
	}
}
