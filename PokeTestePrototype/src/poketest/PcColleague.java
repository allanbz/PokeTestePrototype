package poketest;

public class PcColleague extends Colleague {

	public PcColleague(Mediator m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void definirResolucao(String resolucao) {
		// TODO Auto-generated method stub
		System.out.println("---- Computer resolution (1024�768) ----");
		
		System.out.println(resolucao);
	}

}
