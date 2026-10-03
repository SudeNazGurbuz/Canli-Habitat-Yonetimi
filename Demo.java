import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Habitat orman=new Habitat();
	        
		int islem_sec;
		do {
		System.out.println(" LÜtfen yapmak istediğiniz işlemin numarasını tuşlayınız."
				+ "\n 1.Ormanı görüntülemek istiyorum. \n "
				+ "2.Orman habitatıma yeni üye eklemek istiyorum.\n"
				+ "3.Çıkış yapmak istiyorum. ");
	
		
		islem_sec=input.nextInt();
		if(islem_sec==1)
		{
			orman.gettoplamPopulasyon();
			orman.canlilariEkranaYaz();
			orman.hayvanSesleriniEkranaYaz();
			orman.kurbanlariListele();
			orman.solunumlariEkranaYaz();
		
			
		}
		else if(islem_sec==2)
		{
			int tur_sec;
			do {
						System.err.println("Lutfen ormanınıza eklemek istediğiniz "
								+ " türü seçiniz:\n 1.Gül \n 2.Ökse Otu \n 3.Sivrisinek \n 4.At \n 5.ÇIKIŞ "
								+ "\n Seçmek istediğinz ürün numarasını yazınız...");
						
						
						tur_sec=input.nextInt();
						if(tur_sec==1)
						{
							System.out.println("Ormana gül ekleniyor... \n Bilgiler:");
							Gul gul=new Gul();
							orman.canliEkle(gul);
							gul.fotosentezYap();
							gul.solunumYap();
							
							
							
						}
						else if(tur_sec==2)
						{
							System.out.println("Ormana gül ekleniyor... \n Bilgiler:");

							OkseOtu okseOtu=new OkseOtu();
							orman.canliEkle(okseOtu);
							okseOtu.fotosentezYap();
							okseOtu.solunumYap();
						
							
					
						}
						
						else if(tur_sec==3)
						{
							System.out.println("Ormana gül ekleniyor... \n Bilgiler:");

							SivriSinek ss=new SivriSinek();
							orman.canliEkle(ss);
							ss.getAyakSayisi();
							ss.solunumYap();
							ss.sesCikar();
							
							
							
						}
						else if(tur_sec==4)
						{
							System.out.println("Ormana gül ekleniyor... \n Bilgiler:");

							At at=new At();
							orman.canliEkle(at);
							at.getAyakSayisi();
							at.solunumYap();
							at.sesCikar();
						}
						else if(tur_sec==5)
						{
							System.out.println("ÇIKIŞ YAPILIYOR...");
							
						}
						else
						{
							System.out.println("Yanlış tuşlama yaptınız lütfen tekrar deneyiniz.");
						}
						
						   
			}while(tur_sec!=5);
			
		}
		else if(islem_sec==3)
		{
			System.out.println("ÇIKIŞ YAPILIYOR...");
		}
		else
		{
			System.out.println("Yanlış tuşlama yaptınız lütfen tekrar deneyiniz.");
		}
		}while(islem_sec!=3);
		
	}

	

	

}
