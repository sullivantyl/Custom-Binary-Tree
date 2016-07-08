/** driver for tree program */

class Main {
	
	public static void main(String[] args) {
		
		java.util.Scanner scn = new java.util.Scanner(System.in);

		Node t4a = new Leaf(3);
		Node t4b = new Leaf(8);
		Node t3b = new Branch(6, t4a, t4b);
		Node t3a = new Leaf(1);
		Node t2a = new Branch(4, t3a, t3b);

		Node t2b = new Branch(15,
				    new Leaf(11),
				    new Leaf(18));
		Node root = new Branch(10, t2a, t2b);	

		System.out.println("init done, show");
		root.show("", "   ");
		while(true) {
			System.out.print("cmd: ");
			String cmd = scn.next();
			if ("find".startsWith(cmd)) {
				System.out.print("val? ");
				int val = scn.nextInt();
				Node found = root.find(val);

				if (found == null) {
					System.out.println(val + " not in tree");
				} else {
					System.out.println("Found " + val + ": " + found);
				}
			} else if ("show".startsWith(cmd)) {
				if (root == null)
					System.out.println("<null>");
				root.show("", "   ");
			} else if ("quit".startsWith(cmd)) {
				break;
			} else {
				System.out.println("unrec cmd " + cmd
						   + ", try: find  quit");
			}
		}		
	}
}
