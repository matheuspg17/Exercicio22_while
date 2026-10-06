
public class Principal {

    public static void main(String[] args) {
        int i = 0, soma = 0;
        double divisao;

        while (i < 1000) {
            i++;
            soma += i;
        }
        divisao = (double)soma / i;
        System.out.printf("A média é: %.1f\n", divisao);
    }
}
