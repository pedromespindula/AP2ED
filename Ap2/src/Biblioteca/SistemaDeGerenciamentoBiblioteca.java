package Biblioteca;

import java.util.Scanner;

public class SistemaDeGerenciamentoBiblioteca {
    public static void main(String[] args) {
        ListaDuplamenteLigada livros = new ListaDuplamenteLigada();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Novo Livro no Início");
            System.out.println("2. Adicionar Novo Livro no Fim");
            System.out.println("3. Remover Primeiro Livro");
            System.out.println("4. Remover Último Livro");
            System.out.println("5. Buscar Livro por ID");
            System.out.println("6. Imprimir Livros na Ordem Original");
            System.out.println("7. Imprimir Livros na Ordem Reversa");
            System.out.println("0. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do livro: ");
                    int idInicio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String tituloInicio = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorInicio = scanner.nextLine();
                    livros.adicionarNoInicio(idInicio, tituloInicio, autorInicio);
                    break;
                case 2:
                    System.out.print("Digite o ID do livro: ");
                    int idFim = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String tituloFim = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorFim = scanner.nextLine();
                    livros.adicionarNoFim(idFim, tituloFim, autorFim);
                    break;
                case 3:
                    livros.removerDoInicio();
                    break;
                case 4:
                    livros.removerDoFim();
                    break;
                case 5:
                    System.out.print("Digite o ID do livro a ser buscado: ");
                    int idBusca = scanner.nextInt();
                    livros.buscarPorId(idBusca);
                    break;
                case 6:
                    livros.imprimirOrdemOriginal();
                    break;
                case 7:
                    livros.imprimirOrdemReversa();
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

