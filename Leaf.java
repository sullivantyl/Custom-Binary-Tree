/** Leaf node, binary: with children and int data field
 */

class Leaf extends Node {
	
	int data;

	/** constructor */
	Leaf(int a_data) {
		data = a_data;
	}

	
	Node find(int val) {
		// System.out.println("Leaf.find, looking for " + val);
		// if something ?
		if (val == data) {
			return this; // success
		} else {
			return null;
		}
	}

	void show(String prefix, String indent) {
		System.out.println(this + ": " + prefix  + indent + data);
	}
}

