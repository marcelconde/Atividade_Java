import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double salario, horas_trab, valor_hora, hora_extra;
        
        System.out.println("Quantas horas você trabalhou esse mês?");
        Scanner s = new Scanner(System.in);
        horas_trab = s.nextDouble();

        System.out.println("Quanto você recebe por hora?");
        Scanner s1 = new Scanner(System.in);
        valor_hora = s1.nextDouble();

        hora_extra = horas_trab - 160;

        if (hora_extra <= 0)
            salario = horas_trab * valor_hora;
        else
            salario = 160 * valor_hora + hora_extra * 1.5 * valor_hora;

    System.out.println("Seu salário foi R$" + salario);
    }
}
