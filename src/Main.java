import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static List<Cliente> clientes = new ArrayList<>();
    private static int idCliente = 1;

    public static void main(String[] args) {
        System.out.println("----------Cadastro do Cliente----------");

        System.out.println("Digite o nome do cliente");
        String nome = sc.nextLine();

        System.out.println("Digite o CPF do cliente");
        String CPF = sc.nextLine();

        System.out.println("Digite o email do cliente");
        String email = sc.nextLine();

        System.out.println("Digite o senha do cliente");
        String senha = sc.nextLine();

        System.out.println("Digite o telefone do cliente");
        String telefone = sc.nextLine();

        System.out.println("Digite o endereço do cliente");
        String endereco = sc.nextLine();

        String tipoUsuario = "Cliente";

        Cliente cliente = new Cliente(
                idCliente,
                nome,
                CPF,
                email,
                senha,
                telefone,
                tipoUsuario,
                endereco);

        clientes.add(cliente);

        idCliente++;

        System.out.println("Cliente cadastrado com sucesso!!!");

         System.out.println("Cliente: "+ cliente);


    }
}
