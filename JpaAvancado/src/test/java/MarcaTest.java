import br.com.raijheckinny.dao.CarroDAO;
import br.com.raijheckinny.dao.ICarroDAO;
import br.com.raijheckinny.dao.IMarcaDAO;
import br.com.raijheckinny.dao.MarcaDAO;
import br.com.raijheckinny.domain.Marca;
import org.junit.Assert;
import org.junit.Test;

public class MarcaTest {
    IMarcaDAO daoMarca;

    public MarcaTest(){
        daoMarca = new MarcaDAO();
    }

    @Test
    public void cadastrarMarca(){
        Marca marca = new Marca();
        marca.setCodigo("A01");
        marca.setNome("Toyota");
        Marca marcaBD = daoMarca.cadastrar(marca);

        Assert.assertNotNull(marcaBD);
        Assert.assertEquals(marca, marcaBD);
    }
}
