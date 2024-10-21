package Biblioteca;

class ListaDuplamenteLigada {
    private NoLivro inicio;
    private NoLivro fim;

    public ListaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarNoInicio(int id, String titulo, String autor) {
        NoLivro novoLivro = new NoLivro(id, titulo, autor);
        if (inicio == null) {
            inicio = fim = novoLivro;
        } else {
            novoLivro.proximo = inicio;
            inicio.anterior = novoLivro;
            inicio = novoLivro;
        }
        System.out.println("Livro adicionado no início: " + titulo);
    }

    public void adicionarNoFim(int id, String titulo, String autor) {
        NoLivro novoLivro = new NoLivro(id, titulo, autor);
        if (fim == null) {
            inicio = fim = novoLivro;
        } else {
            fim.proximo = novoLivro;
            novoLivro.anterior = fim;
            fim = novoLivro;
        }
        System.out.println("Livro adicionado no fim: " + titulo);
    }

    public void removerDoInicio() {
        if (inicio == null) {
            System.out.println("A lista está vazia. Nenhum livro para remover.");
            return;
        }
        System.out.println("Livro removido do início: ID " + inicio.id + ", Título: " + inicio.titulo);
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null; // Caso a lista fique vazia
        }
    }

    public void removerDoFim() {
        if (fim == null) {
            System.out.println("A lista está vazia. Nenhum livro para remover.");
            return;
        }
        System.out.println("Livro removido do fim: ID " + fim.id + ", Título: " + fim.titulo);
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null; // Caso a lista fique vazia
        }
    }

    public void buscarPorId(int id) {
        NoLivro atual = inicio;
        while (atual != null) {
            if (atual.id == id) {
                System.out.println("Livro encontrado: ID " + atual.id + ", Título: " + atual.titulo + ", Autor: " + atual.autor);
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    public void imprimirOrdemOriginal() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Livros na ordem original:");
        NoLivro atual = inicio;
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Título: " + atual.titulo + ", Autor: " + atual.autor);
            atual = atual.proximo;
        }
    }

    public void imprimirOrdemReversa() {
        if (fim == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Livros na ordem reversa:");
        NoLivro atual = fim;
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Título: " + atual.titulo + ", Autor: " + atual.autor);
            atual = atual.anterior;
        }
    }
}

