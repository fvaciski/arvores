package estruturanaolinear;

public class Tree {

	Node root;

	public Tree() {
		this.root = null;
	}

	// metodo recursivo para inserir valor na arvore
	// o private serve pra ficar mais facil sem ter que ficar usando while(que usa
	// na a lista encadeada que aprendemos)
	// tambem nao bagunça o codigo, as vezes pode dar algum b.o

	// primeiro ele vai direto na raiz
	// se chegou num espaço vazio, significa que aqui é o lugar pra colocar o novo
	// valor
	// cria um novo no com esse valor e o retorna
	// esse return atualiza o filho da arvore na chamada anterior
	public void insert(int value) {
		root = insertValue(root, value);
	}

	// esse metodo serve pra decidir onde vai ir
	// se for menor que o atual vai pra esquerda
	// se for maior que o atual vai pra direita
	// se for igual ele ignora e nao adiciona
	private Node insertValue(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = insertValue(current.left, value);
		} else if (value > current.value) {
			current.right = insertValue(current.right, value);
		}

		return current;
	}

	// é o em ordem que falou nas aulas
	// esquerda -> no atual -> direita
	public void inOrder(Node current) {
		if (current != null) {
			inOrder(current.left);
			System.out.println(current.value + " ");
			System.out.println();
			inOrder(current.right);
		}
	}

	public int height() {
		return heightRec(root);
	}

	// Método recursivo que calcula a altura de um nó(especifico para arvore
	// binaria, acredito que nao funcione na generica)
	private int heightRec(Node current) {
		if (current == null) {
			return 0; // arvore vazia ou folha
		}

		int leftHeight = heightRec(current.left);
		int rightHeight = heightRec(current.right);

		// pega o maior e retorna
		return Math.max(leftHeight, rightHeight) + 1;
	}

}
