package arvoregenerica;

public class Tree {
	Node root;

	public Tree(String rootValue) {
		root = new Node(rootValue);
	}

	// calcula a altura da arvore a partir de um no
	public int Height(Node no) {
		// se nao existe no, a altura é 0
		if (no == null)
			return 0;
		// se nao tem filhos, a altura é 1 (ele mesmo)
		if (no.filhos.isEmpty())
			return 1;

		int maxHeight = 0;

		// para cada filho, calcula sua altura
		for (Node filho : no.filhos) {
			int heightFilho = Height(filho);
			if (heightFilho > maxHeight) {
				maxHeight = heightFilho;
			}

		}

		// a altura do no é 1 + maior altura entre os filhos
		return 1 + maxHeight;
	}

	// calcula a profundidade de um no especifico, começando da raiz
	public int getDepth(Node current, Node target, int currentLevel) {
		if (current == null) // no nao existe
			return -1;
		if (current == target) //achou no alvo(target)
			return currentLevel;

		//procura entre os filhos
		for (Node filho : current.filhos) {
			int result = getDepth(filho, target, currentLevel + 1);
			if (result != -1)
				return result; // achou o alvo em algum filho
		}

		return -1; // não encontrou em lugar nenhum

	}
	
	public void imprimir(Node no, String prefixo) {
	    if (no == null) return;

	    // imprime o nó atual
	    System.out.println(prefixo + no.value);

	    // percorre os filhos recursivamente, adicionando "--" para mostrar o nível
	    for (Node filho : no.filhos) {
	        imprimir(filho, prefixo + "--");
	    }
	}
}
