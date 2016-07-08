/** Branch node, with children (two, must be there) and int data field 
 */

class Branch extends Node {
	int data;
	Node leftChild, rightChild;

	/** constructor */
	Branch(int a_data, Node left, Node right) {
		data = a_data;
		leftChild = left;
		rightChild = right;
	}

	// look in ordered tree //
	Node find(int val) {
		if (data == val)
			return this;	    // success -- us!
		else if (leftChild.find(val) != null)
			return leftChild.find(val);
		else if (rightChild.find(val) != null)
			return rightChild.find(val);
		else
			return null;
	}

	void show(String prefix, String indent) {
		System.out.println(this + ": " + prefix  + indent + data);
		leftChild.show(prefix + "L", indent + "   ");
		rightChild.show(prefix+ "R", indent + "   ");
	}
}

