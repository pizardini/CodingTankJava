import java.util.Objects;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double fator1 = 1.8;
        final double fator2 = 32;
        double temp1;
        double temp2 = 0;
        double media;
        boolean valor = true;
        int quantidade = 0;

        while (true) {
            System.out.println("Digite quantos valores de temperatura você gostaria de converter.");
            quantidade = sc.nextInt();
            if (quantidade > 0) {
                break;
            } else {
                System.out.println("Insira um valor maior que zero.");
            }
        }

        while (quantidade > 0) {
            System.out.println("Digite a escala de origem da temperatura. (celsius, kelvin ou fahrenheit)");
            String escala1 = sc.next();
            System.out.println("Digite a escala de temperatura que você gostaria de transformar.");
            String escala2 = sc.next();
            System.out.println("Digite o valor da temperatura de origem.");
            temp1 = sc.nextDouble();

            if (Objects.equals(escala1, "celsius")) {
                if (Objects.equals(escala2, "fahrenheit")) {
                    temp2 = (temp1 * (fator1) + fator2);
                    System.out.printf("A temperatura transformada é %s Fº.", temp2);
                }

                if (Objects.equals(escala2, "kelvin")) {
                    temp2 = temp1 + 273;
                    System.out.printf("A temperatura transformada é %s Kº.", temp2);
                }
                media = (temp1 + temp2) / 2;
                System.out.printf("\nA temperatural inicial é %s ºC.", temp1);
                System.out.printf("\nA média entre a temperatura inicial e transformada é %s.", media);
                quantidade--;
            } else if (Objects.equals(escala1, "kelvin")) {
                if (Objects.equals(escala2, "celsius")) {
                    temp2 = temp1 - 273;
                    System.out.printf("A temperatura transformada é %s Cº.", temp2);
                }
                if (Objects.equals(escala2, "fahrenheit")) {
                    temp2 = ((temp1 - 273) * (fator1) + fator2);
                    System.out.printf("A temperatura transformada é %s Fº.", temp2);
                }
                media = (temp1 + temp2) / 2;
                System.out.printf("\nA temperatural inicial é %s ºK.", temp1);
                System.out.printf("\nA média entre a temperatura inicial e transformada é %s.", media);
                quantidade--;
            } else if (Objects.equals(escala1, "fahrenheit")) {
                if (Objects.equals(escala2, "celsius")) {
                    temp2 = (temp1 - fator2) / fator1;
                    System.out.printf("A temperatura transformada é %s Cº.", temp2);
                }
                if (Objects.equals(escala2, "kelvin")) {
                    temp2 = ((temp1 - fator2) / fator1) - 273;
                    System.out.printf("A temperatura transformada é %s Kº.", temp2);
                }
                media = (temp1 + temp2) / 2;
                System.out.printf("\nA temperatural inicial é %s ºF.", temp1);
                System.out.printf("\nA média entre a temperatura inicial e transformada é %s.", media);
                quantidade--;
            } else {
                System.out.println("Por favor digite uma escala válida.");
            }
        }

    }

}
