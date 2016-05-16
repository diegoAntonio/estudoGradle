import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ClasseModeloTest {

	public static Archive<?> vaiBusanfa() {
		return ShrinkWrap.create(JavaArchive.class, "teste.jar").addClass(ClasseModelo.class);
	}

	@Test
	public void megaTesteDoMal() {
		ClasseModelo modelo = new ClasseModelo("texto", 8);
		
		Assert.assertFalse(modelo.getNumero() == 12);
	}
	
	
	@Test
	public void megaTesteDoMal2() {
		ClasseModelo modelo = new ClasseModelo("texto", 8);
		
		Assert.assertTrue(modelo.getNumero() == 8);
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
}
