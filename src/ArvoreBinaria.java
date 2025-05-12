// ArvoreBinaria.java: Classe correspondente a árvore binária
// Métodos de inicializacão, busca, insercão e exibicão.

public class ArvoreBinaria {
    private Node raiz;

    // Método inicializar: cria a raiz da árvore com um caractere vazio.
    public void inicializar() {
        raiz = new Node(' ');
    }

    // Método inserir: recebe uma sequência de pontos, tracos e o caractere correspondente.
    public void inserir(String codigo, char caractere) {
        Node atual = raiz;
        int i = 0;

        while (i < codigo.length()) {
            String c = codigo.substring(i, i + 1);
            if (c.equals(".")) {
                if (atual.esquerda == null) {
                    atual.esquerda = new Node(' ');
                }
                atual = atual.esquerda;
            } else if (c.equals("-")) {
                if (atual.direita == null) {
                    atual.direita = new Node(' ');
                }
                atual = atual.direita;
            }
            i = i + 1;
        }
        atual.caractere = caractere;
    }

    // Método buscar: recebe um código morse e tenta encontrar o caractere correspondete
    public char buscar(String codigo) {
        Node atual = raiz;
        int i = 0;

        while (i < codigo.length()) {
            String c = codigo.substring(i, i + 1);
            if (c.equals(".")) {
                if (atual.esquerda == null) return '?';
                atual = atual.esquerda;
            } else if (c.equals("-")) {
                if (atual.direita == null) return '?';
                atual = atual.direita;
            } else {
                return '?';
            }
            i = i + 1;
        }
        return atual.caractere;
    }

    public void exibir() {
        exibirRecursivo(raiz, 0);
    }

    // exibirRecursivo: Chama a funcão para o nó da direita, printa quatros espacos ("    ") para separacao de nível,
    //                  chama a funcão aós a verificacão de espaco vazio no nó esquerdo.
    private void exibirRecursivo(Node no, int nivel) {
        if (no == null) return;
        exibirRecursivo(no.direita, nivel + 1);
        int i = 0;
        while (i < nivel) {
            System.out.print("    ");
            i = i + 1;
        }
        if (no.caractere != ' ') {
            System.out.println(no.caractere);
        } else {
            System.out.println(".");
        }
        exibirRecursivo(no.esquerda, nivel + 1);
    }

}
