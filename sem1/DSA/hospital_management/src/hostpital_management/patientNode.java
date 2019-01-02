/**
 * 
 */
package hostpital_management;

/**
 * @author gn41225
 *
 */
public class patientNode {
	String Name;
	int age;
	int id;
	patientNode prev;
	patientNode next;
	
	public patientNode(String name, int age, int id) {
		Name = name;
		this.age = age;
		this.id = id;
		this.prev = null;
		this.next = null;
	}
	
}
