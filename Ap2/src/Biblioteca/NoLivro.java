package Biblioteca;

class NoLivro {
    int id;
    String titulo;
    String autor;
    NoLivro anterior;
    NoLivro proximo;

    NoLivro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anterior = null;
        this.proximo = null;
    }
}

