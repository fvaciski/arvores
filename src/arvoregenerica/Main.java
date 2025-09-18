package arvoregenerica;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree("10");
		Node a = new Node("1");
		Node b = new Node("2");
		Node c = new Node("3");

		tree.root.adicionarFilho(a);
		tree.root.adicionarFilho(b);
		tree.root.adicionarFilho(c);

		b.adicionarFilho(new Node("4"));
		b.adicionarFilho(new Node("5"));
		c.adicionarFilho(new Node("6"));

		System.out.println("Altura: " + tree.Height(tree.root));
		System.out.println("Profundidade de G: " + tree.getDepth(tree.root, c.filhos.get(0), 0));
		tree.imprimir(tree.root, "");
	}

}
