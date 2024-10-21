package Cafeteria;

class No {
    int id;
    String descricao;
    No proximo;

    No(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.proximo = null;
    }
}

