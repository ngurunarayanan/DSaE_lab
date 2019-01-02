/**
 * 
 */
package hostpital_management;

/**
 * @author gn41225
 *
 */
public class patientRecord {
	patientNode head;
	patientNode tail;
	public patientRecord() {
		super();
	}
	public void registerPatient(patientNode node) {
		if (tail == null) {
			head = tail = node;
			return;
		}
		tail.next = node;
		tail = node;
	}
	public void removePatient(patientNode node) {
		if (node == null) {
			return;
		}
		if (head == node) {
			head = node.next;
		}
		if (tail == node) {
			tail = node.prev;
		}
		if (node.prev != null) {
			node.prev.next = node.next;
		}
		if (node.next != null) {
			node.next.prev = node.prev;
		}
		node.next = node.prev = null;
	}
}
