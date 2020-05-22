
import com.silvio.exercicio.builder.Produto;
import com.silvio.exercicio.builder.ProdutoBuilder;
import com.silvio.exercicio.builder.Vendedor;
import java.time.LocalDate;

/**
 *
 * @author silvio
 */
public class principal {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.now();
        
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Teste 01");
        
        Produto produto = new ProdutoBuilder()
                .vendedor(vendedor)
                .categoria("eletronicos")
                .titulo("TV 4k")
                .descricao("TV ULTIMA GERAÇAO")
                .preco(6899.99)
                .dataCadastro(ld)
                .dataUltimaAtualizacao(ld)
                .createProduto();
        
        produto.setMarca("as");
        produto.setModelo("modelo");
        
        System.out.println(produto.toString());
    }
    
}
