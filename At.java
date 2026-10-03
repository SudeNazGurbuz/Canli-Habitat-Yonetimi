
public class At extends Hayvan {

	private int populasyon=0;

	public At()
	{
		setAyakSayisi(4);
	}
	@Override
	public void solunumYap() {
		System.out.println(" “Burnumla solunum yaparım.” ");
		super.solunumYap();
	}
	
	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		System.out.println(" “Ben kişnerim.” ");
	}

	
	public int getpopulasyon()
	{
		populasyon++;
		System.out.println(populasyon);
		return populasyon;
	}
}
