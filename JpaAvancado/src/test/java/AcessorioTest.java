import br.com.raijheckinny.dao.*;
import br.com.raijheckinny.domain.Acessorio;
import br.com.raijheckinny.domain.Carro;
import br.com.raijheckinny.domain.Marca;
import org.junit.Assert;
import org.junit.Test;

public class AcessorioTest {
    IAcessorioDAO daoAcessorio;
    ICarroDAO daoCarro;
    IMarcaDAO daoMarca;

    public AcessorioTest(){
        daoAcessorio = new AcessorioDAO();
        daoCarro = new CarroDAO();
        daoMarca = new MarcaDAO();

    }

    @Test
    public void cadastrar(){
        Marca marca = new Marca();
        marca.setCodigo("A01");
        marca.setNome("Toyota");
        Marca marcaBD = daoMarca.cadastrar(marca);

        Assert.assertNotNull(marcaBD);
        Assert.assertEquals(marca, marcaBD);

        Carro carro = new Carro();
        carro.setNome("Corsa");
        carro.setCodigo("A02");
        carro.setDescricao("baixo");
        Carro carroBD = daoCarro.cadastrar(carro);

        Assert.assertNotNull(carroBD);
        Assert.assertEquals(carro, carroBD);

        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo("A01");
        acessorio.setNome("Ar_Condicionado");
        acessorio.setCarro(carro);
        Acessorio AcessorioBD = daoAcessorio.cadastrar(acessorio);

        Assert.assertNotNull(AcessorioBD);
        Assert.assertEquals(acessorio, AcessorioBD);
    }
}
