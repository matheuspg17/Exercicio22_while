# Resolução Exercicio22_while

## Descrição do problema
Escreva um programa em Java para calcular e mostrar a média aritmética dos
números inteiros entre 1(inclusive) e 1000(inclusive) usando while.

## Como Funciona
1. O algoritmo inicializa as variáveis contadora (`i = 0`) e acumuladora (`soma = 0`) como inteiros.
2. A estrutura de repetição `while (i < 1000)` controla o fluxo do programa:
   - Incrementa a variável de controle no início do bloco (`i++`), fazendo com que o primeiro número somado seja o 1.
   - Acumula o valor atual de `i` na variável `soma` (`soma += i`).
3. Fora do laço, a média é obtida dividindo a soma total pelo número de elementos (`i`), aplicando um cast explícito para `(double)` para evitar que o Java trunque o resultado em uma divisão inteira.
4. O programa imprime a média formatada via `System.out.printf` utilizando o marcador `%.1f`.