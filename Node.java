/** Node, for binary tree: general base class, no specific  children or data field
 */

class Node {
	/** constructor */
	protected Node() {
	// block the default from explicit use outside
	}

	Node find(int val) {
		System.out.println("Node.find() ... "
				   + " shouldn't be here");
		return null;
	}

	void show(String prefix, String indent) {
		System.out.println("Node.show => " + this
				   + " shouldn't be here");
	}
}

