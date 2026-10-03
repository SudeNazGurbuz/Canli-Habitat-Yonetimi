
public abstract class Bitki extends Canli {
	
	private float yaprakSayisi;
	public float getYaprakSayisi() {
		return yaprakSayisi;
	}

	public void setYaprakSayisi(float yaprakSayisi) {
		this.yaprakSayisi = yaprakSayisi;
		System.out.println("Yaprak sayısı: "+yaprakSayisi);
	}

	Bitki()
	{
		//getHucreTipi();
		setHucreTipi("Bitkisel Hücre");
	}
	
	@Override
	public void solunumYap() {
		

	}
	
	public void fotosentezYap()
	{
		System.out.println(" “Fotosentez ile havayı temizlerim!” ");
	}

}
