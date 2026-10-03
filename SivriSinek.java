
public class SivriSinek extends Hayvan {

	private int populasyon=0;
	
	 private Canli Kurban;
		public Canli getKurban() {
			return Kurban;
		}
		public void setKurban(Canli kurban) {
			this.Kurban = kurban;
		}
		public SivriSinek()
		{
			setAyakSayisi(6);
		}
	@Override
	public void solunumYap() {
		System.out.println(" “Karın bölgemdeki stigma ile\r\n"
				+ "solunum yaparım”  ");
		super.solunumYap();
	}
			
		
	@Override
	public void sesCikar() {
		System.out.println(" “Ben vızıldarım.” ");

	}

	
	public int getpopulasyon()
	{
		populasyon++;
		System.out.println(populasyon);
		return populasyon;
	}
}
