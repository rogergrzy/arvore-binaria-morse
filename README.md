
# 🌐 Projeto: Árvore Binária com Código Morse

## 📚 Descrição

Este projeto implementa uma **árvore binária** em Java para representar o **código Morse**, onde:
- Cada **caractere alfanumérico** (A–Z, 0–9) é posicionado na árvore conforme sua codificação em pontos (`.`) e traços (`-`).
- Caminhos à **esquerda** representam **pontos (`.`)**.
- Caminhos à **direita** representam **traços (`-`)**.
- O usuário pode digitar uma **mensagem em código Morse** e o sistema retorna a mensagem decodificada.
- A árvore também é exibida de forma **hierárquica e compreensível no console**.

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
