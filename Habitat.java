import java.util.ArrayList;

public class Habitat {

	private ArrayList<Canli> canliListesi= new ArrayList<Canli>();
	private final int KAPASITE=3;
	private int toplamPopulasyon=0;
	
	public  int gettoplamPopulasyon() {
		System.out.println(" Toplam Popülasyon: "+toplamPopulasyon);
		return toplamPopulasyon;
	}
	public  void settoplamPopulasyon(int toplamPopulasyon) {
		
		System.out.println(" Toplam Popülasyon: "+toplamPopulasyon);
		//this.toplamPopulasyon=toplamPopulasyon;
	
	}
	
	public boolean canliEkle(Canli canli) {

		if(toplamPopulasyon<KAPASITE) 
		{
			
			canliListesi.add(canli);
			toplamPopulasyon++;
			return true;
		}
		else 
		{
			System.out.println("kapasite dolu");
			return false;
		}
			
		
	}

	public void solunumlariEkranaYaz()
	{
		
	           
	}

	public void canlilariEkranaYaz()
	{
		
			canliListesi.toString();
			System.out.println("liste:"+canliListesi.toString());
		
	}

	public void hayvanSesleriniEkranaYaz() 
	{
		
		
	}

	public void kurbanlariListele()
	{
		
	}

}
