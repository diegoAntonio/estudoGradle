
public class ClasseModelo {
	private String texto;
	private int numero;
	
	public ClasseModelo() {
		super();
	}

	public ClasseModelo(String texto, int numero) {
		super();
		this.texto = texto;
		this.numero = numero;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}