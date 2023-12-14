public class Produto {
    private static int proximoId = 1;

    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.id = proximoId++;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("---------------");
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
