
public class Gul extends Bitki {

	private int populasyon=0;
	
	public Gul()
	{
		setYaprakSayisi(5.0F);	
	}
	public Gul(float yaprakSayisi)
	{
		setYaprakSayisi(yaprakSayisi);
	}
	@Override
	public void solunumYap() {
		System.out.println(" “Yapraklarımla solunum yaparım.” ");
		super.solunumYap();
	}
	public int getpopulasyon()
	{
		populasyon++;
		//System.out.println("Popülasyon: "+populasyon);
		return populasyon;
	}
	public void setPopulasyon(int populasyon) {
		
		this.populasyon = populasyon;
		System.out.println("Popülasyon: "+populasyon);
	}
}
