package Cafeteria;

class Fila {
    private No inicio;
    private No fim;

    public Fila() {
        this.inicio = this.fim = null;
    }

    public void adicionar(int id, String descricao) {
        No novoNo = new No(id, descricao);
        if (fim == null) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        System.out.println("Pedido " + id + " adicionado à fila de pedidos pendentes.");
    }

    public void atender() {
        if (inicio == null) {
            System.out.println("A fila está vazia. Nenhum pedido a atender.");
            return;
        }
        System.out.println("Pedido atendido: ID " + inicio.id + ", Descrição: " + inicio.descricao);
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
    }

    public void imprimirFila() {
        if (inicio == null) {
            System.out.println("Nenhum pedido pendente.");
            return;
        }
        System.out.println("Pedidos Pendentes:");
        No atual = inicio;
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Descrição: " + atual.descricao);
            atual = atual.proximo;
        }
    }

    public No removerInicio() {
        if (inicio == null) return null;
        No removido = inicio;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return removido;
    }
}
