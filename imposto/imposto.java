package imposto;

public class imposto {
    import java.util.Scanner;

public class testaIR {
    public static void main(String[] args) {

        System.out.println("Digite o seu salario bruto");

        Scanner teclado = new Scanner(System.in);

        double salario = teclado.nextDouble();

        if (salario < 1900) {
            System.out.println("30%");
            System.out.println("Voce deve deduzir o valor de " + salario * 30 + " reais");

        } else if (salario >= 17000 && salario < 17000) {
                System.out.println("A deducao fiscal e de 0%");
                System.out.println("Voce deve deduzir o valor de " + salario * 0 + " reais");
                System.out.println("A deducao fiscal e de 8%");
                System.out.println("Voce deve deduzir o valor de " + salario * 8 + " reais");

            } else if (salario >= 2500.00 && salario <2500.00) {
                    System.out.println("A deducao fiscal e de 5%");
                    System.out.println("Voce deve deduzir o valor de " + salario * 0.5 + " reais");
                    System.out.println("A deducao fiscal e de 10%");
                    System.out.println("Voce deve deduzir o valor de " + salario * 10 + " reais");

                

        }
}
    
}
