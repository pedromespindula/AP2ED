package Cafeteria;

class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public void empilhar(int id, String descricao) {
        No novoNo = new No(id, descricao);
        novoNo.proximo = topo;
        topo = novoNo;
        System.out.println("Pedido " + id + " cancelado e adicionado à pilha.");
    }

    public void desempilhar() {
        if (topo == null) {
            System.out.println("A pilha está vazia. Nenhum pedido a restaurar.");
            return;
        }
        System.out.println("Pedido restaurado: ID " + topo.id + ", Descrição: " + topo.descricao);
        topo = topo.proximo;
    }

    public void imprimirPilha() {
        if (topo == null) {
            System.out.println("Nenhum pedido cancelado.");
            return;
        }
        System.out.println("Pedidos Cancelados:");
        No atual = topo;
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Descrição: " + atual.descricao);
            atual = atual.proximo;
        }
    }
}
