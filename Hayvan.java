
public abstract class Hayvan extends Canli {

	private int ayakSayisi;
	public int getAyakSayisi() {
		return ayakSayisi;
	}

 
	public  void setAyakSayisi(int ayakSayisi) {
		this.ayakSayisi = ayakSayisi;
		System.out.println("Ayak sayısı: "+ayakSayisi);
	}


	Hayvan() 
	{
		setHucreTipi("Hayvansal Hücre");
	}
	
	
	@Override
	public void solunumYap() 
	{
	

	}
	
	public abstract void sesCikar();

}
