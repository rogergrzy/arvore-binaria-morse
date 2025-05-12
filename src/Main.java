// Main.java: inicializa a árvore a partir da funcão inicializar;
//            Percorre a tabela com os símbolos em morse e constrói ela de forma automática;
//            Para cada caractere, insere na árvore o caminho e a letra correspondente.
// Entrada: Mensagem em Código Morse "... --- .- ." (Separado por espacos).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inicializar();

        // Inserção dos caracteres manualmente (sem arrays)
        int i = 0;
        while (i < CodigoMorse.tabelaMorse.length)
        {
            String letra = CodigoMorse.tabelaMorse[i][0];
            String codigo = CodigoMorse.tabelaMorse[i][1];
            arvore.inserir(codigo, letra.substring(0, 1).charAt(0));
            i = i + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a mensagem em código morse:");
        String linha = scanner.nextLine();

        // Decodificação
        String codigoAtual = "";
        int pos = 0;

        System.out.print("Mensagem decodificada: ");

        while (pos < linha.length()) {
            String caractere = linha.substring(pos, pos + 1); // pega um caractere
            if (caractere.equals(" ")) {
                if (codigoAtual.length() > 0)
                {
                    char letra = arvore.buscar(codigoAtual);
                    System.out.print(letra);
                    codigoAtual = ""; // zera para o próximo caractere
                }
            }
            else
            {
                codigoAtual = codigoAtual + caractere;
            }
            pos = pos + 1;
        }

        if (codigoAtual.length() > 0) {
            char letra = arvore.buscar(codigoAtual);
            System.out.print(letra);
        }

        System.out.println();
        System.out.println("Exibição da árvore Morse:");
        arvore.exibir();

        scanner.close();
    }
}
