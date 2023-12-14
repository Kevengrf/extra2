import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                produto.mostrarDetalhes();
            }
        }
    }

    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarProduto(int id, String novoNome, double novoPreco) {
        Produto produto = buscarProduto(id);
        if (produto != null) {
            produto.mostrarDetalhes();  // Exibir detalhes antes da atualização
            produto = new Produto(id, novoNome, novoPreco);
            produtos.set(produtos.indexOf(buscarProduto(id)), produto);
            System.out.println("Produto atualizado com sucesso!");
            produto.mostrarDetalhes();  // Exibir detalhes após a atualização
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
