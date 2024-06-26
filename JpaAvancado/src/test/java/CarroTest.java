import br.com.raijheckinny.dao.CarroDAO;
import br.com.raijheckinny.dao.ICarroDAO;
import br.com.raijheckinny.dao.IMarcaDAO;
import br.com.raijheckinny.dao.MarcaDAO;
import br.com.raijheckinny.domain.Carro;
import br.com.raijheckinny.domain.Marca;
import org.junit.Assert;
import org.junit.Test;

public class CarroTest {
    ICarroDAO daoCarro;
    IMarcaDAO daoMarca;

    public CarroTest(){
        daoCarro = new CarroDAO();
        daoMarca = new MarcaDAO();
    }

    @Test
    public void cadastrarCarro(){
        Marca marca = new Marca();
        marca.setCodigo("A01");
        marca.setNome("Toyota");
        Marca marcaBD = daoMarca.cadastrar(marca);

        Assert.assertNotNull(marcaBD);
        Assert.assertEquals(marca, marcaBD);

        Carro carro = new Carro();
        carro.setCodigo("A01");
        carro.setNome("Corola");
        carro.setDescricao("auto");
        carro.setMarca(marca);
        Carro carroBD = daoCarro.cadastrar(carro);

        Assert.assertNotNull(carroBD);
        Assert.assertEquals(carro, carroBD);
    }
}
