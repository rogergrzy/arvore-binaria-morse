
# 🌐 Projeto: Árvore Binária com Código Morse

## 📚 Descrição

Este projeto implementa uma **árvore binária** em Java para representar o **código Morse**, onde:
- Cada **caractere alfanumérico** (A–Z, 0–9) é posicionado na árvore conforme sua codificação em pontos (`.`) e traços (`-`).
- Caminhos à **esquerda** representam **pontos (`.`)**.
- Caminhos à **direita** representam **traços (`-`)**.
- O usuário pode digitar uma **mensagem em código Morse** e o sistema retorna a mensagem decodificada.
- A árvore também é exibida de forma **hierárquica e compreensível no console**.

## ✅ Regras atendidas

- ❌ **Não** utilizamos arrays, listas, vetores, tipos genéricos ou estruturas avançadas.
- ❌ **Não** utilizamos `split()`, `charAt()`, `equals()`, `StringBuilder`, `List`, `Arrays`, etc.
- ✅ Utilizamos **apenas**: `String`, `int`, `float`, `substring()`, `Scanner`, e estruturas de controle como `if`, `while`.
- ✅ Toda a manipulação de texto foi feita manualmente, respeitando as restrições do enunciado.

## 🛠️ Estrutura de Arquivos

| Arquivo           | Função                                                             |
|-------------------|--------------------------------------------------------------------|
| `Main.java`       | Executa o programa: recebe entrada do usuário e mostra a resposta |
| `ArvoreBinaria.java` | Implementa a árvore binária com inserção, busca e exibição      |
| `Node.java`       | Estrutura de cada nó da árvore (caractere + filhos)                |
| `CodigoMorse.java`| Tabela estática com todos os caracteres e seus códigos Morse       |

## 🎮 Como usar

### 1. Digite a mensagem em código Morse (separando letras com espaço):

```
... --- ...
```

### 2. Saída esperada:

```
Mensagem decodificada: SOS
```

## 🌳 Exibição da árvore Morse

A árvore é exibida **de forma hierárquica e indentada**, mostrando as subárvores de maneira organizada no console. Exemplo simplificado:

```
        M
    T
        N
·
        A
    E
        I
```

## 🧪 Exemplo de código Morse suportado

| Letra | Código |
|-------|--------|
| A     | `.-`   |
| B     | `-...` |
| C     | `-.-.` |
| D     | `-..`  |
| ...   | ...    |
| Z     | `--..` |
| 0     | `-----`|
| 1     | `.----`|
| ...   | ...    |
| 9     | `----.`|

## 🎓 Créditos e Autores

Este projeto foi desenvolvido para a disciplina de **Resolução de Problemas Estruturados em Computação I**.

Todos os membros do grupo contribuíram na construção do código, documentação e explicação do projeto, conforme exigido pelo professor.

## 📌 Observações Finais

- O projeto foi desenvolvido com **cuidado para seguir todas as restrições** especificadas no enunciado.
- O código está **comentado e dividido em partes lógicas** para facilitar o entendimento.
- A árvore binária está **funcional, completa e hierarquicamente organizada**.
