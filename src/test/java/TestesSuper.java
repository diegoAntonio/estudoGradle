import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
@Ignore
public abstract class TestesSuper {
	
	public static Archive<?> vaiBusanfa() {
		return ShrinkWrap.create(JavaArchive.class, "teste.jar").addClass(ClasseModelo.class);
	}

}
