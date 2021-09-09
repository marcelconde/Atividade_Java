import java.util.Scanner;

public class resolucao {
    public static void main(String[] args) {
        double passagem;

        String local = " "; // declarando local e nome como strings, vão receber do usuário o local de viagem e o nome do usuário respectivamente
        String nome  = " ";

        System.out.println("Digite seu nome: ");
        Scanner s = new Scanner(System.in);  // Recebe e armazana o nome do usuário na string "nome"
        nome = s.next();

        System.out.println("olá Sr(a). " + nome);
        System.out.println("\nPara onde você quer viajar? Norte, Nordeste ou Centro-Oeste?");
        Scanner s1 = new Scanner(System.in); // Recebe e armazena o local da viagem
        local = s1.next();

        System.out.println("\nDigite 1 para passagem de ida e volta / digite 2 só para passagem de ida");
        Scanner s2 = new Scanner(System.in); // Recebe e armazena a opção de passagem ida e volta / só ida
        passagem = s2.nextDouble();

        if (local.equalsIgnoreCase("Norte")) { // Compara se o nome armazenado em "local" é igual a "Norte"
            if (passagem == 1) {
                System.out.println("\nSua viagem para o Norte com passagem de ida e volta fica: R$ 740,00");
            } else if (passagem == 2) {
                System.out.println("\nSua viagem para o Norte com passagem só de ida fica: R$ 400,00");
            }
        }
        if (local.equalsIgnoreCase("nordeste")) { // Compara se o nome armazenado em "local" é igual a "Nordeste"
            if (passagem == 1) {
                System.out.println("\nSua viagem para o Nordeste com passagem de ida e volta fica: R$ 655,00");
            } else if (passagem == 2) {
                System.out.println("\nSua viagem para o Nordeste com passagem só de ida fica: R$ 345,00");
            }
        }
        if (local.equalsIgnoreCase("Centro-Oeste")) {// Compara se o nome armazenado em "local" é igual a "Centro-Oeste"
            if (passagem == 1) {
                System.out.println("\nSua viagem para o Centro-oeste com passagem de ida e volta fica: R$ 807,00");
            } else if (passagem == 2) {
                System.out.println("\nSua viagem para o Centro-oeste com passagem só de ida fica: R$ 448,00");
            }
        }
    }
}