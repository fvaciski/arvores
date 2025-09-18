package arvoregenerica;

import java.util.LinkedList;

class Node {
 String value;                       // dado armazenado no nó
 LinkedList<Node> filhos;              // lista de filhos

 public Node(String value) {
     this.value = value;
     this.filhos = new LinkedList<>(); // começa sem filhos
 }

 // adiciona um filho a este nó
 public void adicionarFilho(Node filho) {
     filhos.add(filho);
 }
}