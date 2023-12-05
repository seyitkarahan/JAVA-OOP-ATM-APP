package pack;

public class MainClass {

	public static void main(String[] args) {
		
		IATMService musteri = new Musteri("Barış", "TEKSİN", 50000, 11111111111l, "Diyarbakır/Kayapınar");
		
		musteri.girisYap();
		
	}

}
