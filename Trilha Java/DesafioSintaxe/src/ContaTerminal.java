import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String cliente;
        float saldo;

        System.out.println("Por favor, informe o número do conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, informe o nome da agencia: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, informe o nome do cliente: ");
        cliente = scanner.nextLine();
        System.out.println("Por favor, informe o saldo disponível: ");
        saldo = scanner.nextFloat();

        System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu " +
                "saldo R$ %.2f já está disponíve para saque!", cliente, agencia, numeroConta, saldo);

        scanner.close();
    }
}