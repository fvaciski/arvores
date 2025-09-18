# Estruturas de Árvores em Java 🌳

Este repositório contém implementações de duas estruturas de árvore em Java:

- **Árvore Genérica**: permite múltiplos filhos por nó, ideal para hierarquias flexíveis.
- **Árvore Binária de Busca (BST)**: árvore binária onde os valores menores vão para o filho esquerdo e os maiores para o direito.


---

## 🌳 Funcionalidades

### Árvore Genérica

- Nós com múltiplos filhos.
- Cálculo da altura.
- Cálculo da profundidade de um nó.
- Impressão hierárquica da árvore.

### Árvore Binária de Busca (BST)

- Inserção de valores respeitando a propriedade BST.
- Impressão in-order (valores em ordem crescente).
- Cálculo da altura da árvore.

---

## 📌 Exemplo de Uso

### Árvore Genérica

```java
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



// Criando uma árvore binária de busca
Tree tree = new Tree();

// Inserindo valores na árvore
tree.insert(4);
tree.insert(3);
tree.insert(8);
tree.insert(2);
tree.insert(7);
tree.insert(9);

// Imprimindo os valores em ordem crescente (in-order)
System.out.println("In-order tree:");
tree.inOrder(tree.root);

System.out.println();

// Calculando e exibindo a altura da árvore
System.out.println("Tree height: " + tree.height());


