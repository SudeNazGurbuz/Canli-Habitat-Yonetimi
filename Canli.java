
public abstract class Canli extends Habitat {

	private  String HucreTipi;
	public String getHucreTipi() 
	{
		return HucreTipi;
	}
	
	public void setHucreTipi(String hucreTipi) 
	{
		this.HucreTipi = hucreTipi;
		System.out.println("Hücre Tipi: "+hucreTipi);
	}
	
	public abstract void solunumYap();
	
	
	
}
