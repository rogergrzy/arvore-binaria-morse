// Node.java: Classe representando um Nó da árvore

public class Node {
    public char caractere;  // Representa a letra ou o número
    public Node esquerda;   // Representa o ponto
    public Node direita;    // Representa o traco

    public Node(char caractere) {   // Construtor inicializando o caractere no Node e os filhos como null
        this.caractere = caractere;
        this.esquerda = null;
        this.direita = null;
    }
}
