import javax.annotation.ManagedBean;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();
		
	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public void salva(Automovel automovel) {
		System.out.println("Marca: " + automovel.getMarca());
		
	}
	
	EntityManager em = JPAUtil.getEntityManager();
}
