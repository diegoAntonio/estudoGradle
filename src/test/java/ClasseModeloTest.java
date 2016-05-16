import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ClasseModeloTest extends TestesSuper {
	
	@Test
	public void megaTesteDoMal() {
		ClasseModelo modelo = new ClasseModelo("texto", 8);
		Integer valor = new Integer(12);
		
		Assert.assertFalse(valor.equals(new Integer(modelo.getNumero())));
	}
	
	@Test
	public void megaTesteDoMal2() {
		ClasseModelo modelo = new ClasseModelo("texto", 8);
		Integer valor = new Integer(8);
		
		Assert.assertTrue(valor.equals(new Integer(modelo.getNumero())));
	}
	
	@Test
	public void megaTesteDoMal3() {
		ClasseModelo modelo = new ClasseModelo("texto", 8);
		
		Assert.assertTrue(modelo.getTexto().equalsIgnoreCase("texto"));
	}
	
	@Test
	public void megaTesteDoMal4() {
		ClasseModelo modelo = new ClasseModelo("texto", 8);
		
		Assert.assertTrue(modelo.getTexto().equalsIgnoreCase("texto"));
	}
	
	@Test
	public void megaTesteDoMal5() {
		ClasseModelo modelo = new ClasseModelo();
		modelo.setNumero(8);
		modelo.setTexto("texto");
		
		Assert.assertTrue(modelo.getTexto().equalsIgnoreCase("texto"));
	}
}
