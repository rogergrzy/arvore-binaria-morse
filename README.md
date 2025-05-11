# Criando o conteúdo do README.md com base na estrutura solicitada
readme_content = """
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

