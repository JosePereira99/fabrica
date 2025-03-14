package pt.isec.fabrica;
import pt.isec.fabrica.Module.*;
import pt.isec.fabrica.UI.*;

public class Main {
    public static void main(String[] argvs) {
        Fabrica fabrica = new Fabrica("Minha Fábrica");

        // Adicionando produtos

        fabrica.acrescentaProduto(101);
        fabrica.acrescentaProduto(102);
        fabrica.acrescentaProduto(103);
        fabrica.acrescentaProduto(104);
        fabrica.acrescentaProduto(105);
        fabrica.acrescentaProduto(106);
        fabrica.acrescentaProduto(107);
        fabrica.acrescentaProduto(101); // Tentativa de duplicação (não será adicionada)
        fabrica.testaUnidades();
        System.out.println(fabrica);
        fabrica.eliminaReprovados();

        // Listando produtos
        System.out.println(fabrica);

        // Removendo um produto
        System.out.println("\nRemovendo produto 102...");
        fabrica.eliminaProduto(102);

        // Listando novamente
        System.out.println(fabrica);

        // Exibir total de produtos criados
        System.out.println("\nTotal de produtos criados: " +
                fabrica.getnTotalProdutos());


    }
}
