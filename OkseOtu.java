
public class OkseOtu extends Bitki {

	private int populasyon=0;
	
	 private Canli Kurban;
	public Canli getKurban() {
		return Kurban;
	}
	public void setKurban(Canli kurban) {
		this.Kurban = kurban;
	}
	public OkseOtu(){
		setYaprakSayisi(1.5F);
	}
	public OkseOtu(float yaprakSayisi)
	{
		
	}
	@Override
	public void solunumYap() {
		System.out.println(" “Gövdemle solunum yaparım.” ");
		super.solunumYap();
	}
	
	public int getpopulasyon()
	{
		populasyon++;
		System.out.println(populasyon);
		return populasyon;
	}
}
