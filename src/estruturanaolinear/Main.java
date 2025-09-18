package estruturanaolinear;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();

		tree.insert(4);
		tree.insert(3);
		tree.insert(8);
		tree.insert(2);
		tree.insert(7);
		tree.insert(9);

		System.out.println("In-order tree: ");
		tree.inOrder(tree.root);

		System.out.println();
		System.out.println("Tree height: " + tree.height());

	}

}
