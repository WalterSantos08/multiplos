# Verificação de Múltiplos em Java 🔢

Este programa em Java verifica se dois números fornecidos pelo usuário são múltiplos entre si.

## 📝 Descrição

O programa:

1. Solicita ao usuário:
   - O valor de A.
   - O valor de B.
2. Verifica se um dos números é múltiplo do outro:
   - Se `A` for múltiplo de `B`, ou `B` for múltiplo de `A`, exibe que os números são múltiplos.
   - Caso contrário, exibe que os números não são múltiplos.
3. Exibe o resultado da verificação.

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório ou copie o código.
3. Compile o arquivo Java:
   ```bash
   javac multiplos.java
   ```
4. Execute o programa:
   ```bash
   java multiplos
   ```

## 🕹️ Como usar

1. Ao executar o programa, insira dois números inteiros quando solicitado.
2. O programa verificará se um dos números é múltiplo do outro e exibirá a resposta.

### Exemplo

Entrada:
```
Digite o valor de A:
6
Digite o valor de B:
3
```

Saída:
```
numero são multiplos
```

Entrada:
```
Digite o valor de A:
7
Digite o valor de B:
5
```

Saída:
```
numero não são multiplos
```

## 📂 Estrutura do código

O código é composto por:

- **Leitura da entrada do usuário**: Utiliza `Scanner` para capturar dois números inteiros.
- **Verificação de múltiplos**: Usa a operação de módulo (`%`) para checar se `A` é divisível por `B` ou vice-versa.
- **Exibição do resultado**: Informa se os números são múltiplos ou não.

---


