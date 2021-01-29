import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Automovel {
	
	@Id 
	@GeneratedValue
	
	private Long id;
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String observacoes;
	

	public void setAnoFabricacao(int i) {
		
	}

	public void setObservacoes(String string) {
	
		
	}

	public void setModelo(String string) {
		
		
	}

	public void setMarca(String string) {
		
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return null;
	}



}
