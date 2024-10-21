package Cafeteria;
import java.util.Scanner;

public class SistemaDeGerenciamentoCafeteria {

    public static void main(String[] args) {
        Fila pedidosPendentes = new Fila();
        Pilha pedidosCancelados = new Pilha();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Novo Pedido");
            System.out.println("2. Atender Pedido");
            System.out.println("3. Cancelar Pedido");
            System.out.println("4. Restaurar Pedido");
            System.out.println("5. Imprimir Pedidos Pendentes");
            System.out.println("6. Imprimir Pedidos Cancelados");
            System.out.println("0. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do pedido: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a descrição do pedido: ");
                    String descricao = scanner.nextLine();
                    pedidosPendentes.adicionar(id, descricao);
                    break;
                case 2:
                    pedidosPendentes.atender();
                    break;
                case 3:
                    No pedidoCancelado = pedidosPendentes.removerInicio();
                    if (pedidoCancelado != null) {
                        pedidosCancelados.empilhar(pedidoCancelado.id, pedidoCancelado.descricao);
                    } else {
                        System.out.println("Nenhum pedido a cancelar.");
                    }
                    break;
                case 4:
                    pedidosCancelados.desempilhar();
                    break;
                case 5:
                    pedidosPendentes.imprimirFila();
                    break;
                case 6:
                    pedidosCancelados.imprimirPilha();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
