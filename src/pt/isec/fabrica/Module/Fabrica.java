package pt.isec.fabrica.Module;

import java.util.HashSet;
import java.util.Set;
import pt.isec.fabrica.Module.Produtos;
public class Fabrica {

    private static Set<Produtos> produtosFabrica=new HashSet<>();
    private final String nome;
    private int nTotalProdutos;

    public Fabrica(String nomeFabrica){

        this.nome = nomeFabrica;
        this.produtosFabrica=new HashSet<>();
        this.nTotalProdutos =0;
    }

    public boolean acrescentaProduto(int id){
        Produtos novo = new Produtos(id);
        if(produtosFabrica.add(novo)){
            nTotalProdutos++;
            return true;
        }
        return false;
    }
    public boolean eliminaProduto(int id){
        return produtosFabrica.remove((new Produtos(id)));
    }
    private void listarProdutos() {
        if (produtosFabrica.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de produtos na fábrica:");
            for (Produtos produto : produtosFabrica) {
                System.out.println(produto);
            }
        }
    }
    public String getNome(){
        return this.nome;
    }
    public int getnTotalProdutos(){
        return this.nTotalProdutos;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fábrica: ").append(nome).append("\n");
        sb.append("Total de produtos criados: ").append(nTotalProdutos).append("\n");
        sb.append("Produtos atuais:\n");

        if (produtosFabrica.isEmpty()) {
            sb.append("Nenhum produto registrado.");
        } else {
            for (Produtos produto : produtosFabrica) {
                sb.append(produto).append("\n");
            }
        }

        return sb.toString();
    }

}
