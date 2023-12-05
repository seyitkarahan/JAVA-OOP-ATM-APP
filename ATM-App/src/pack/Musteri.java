package pack;

import java.util.Scanner;

public class Musteri implements IATMService {

	public String ad;
	public String soyad;
	public int bakiye;
	public long TC;
	public String adres;
	private Scanner scanner;

	public Musteri(String ad, String soyad, int bakiye, long TC, String adres) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.bakiye = bakiye;
		this.TC = TC;
		this.adres = adres;
	}

	@Override
	public void girisYap() {

		while (true) {
			System.out.println("Yapmak istediğiniz işlemi seçiniz: \n" + "Müşteri Bilgilerini Görmek için 1'e\n"
					+ "Bakiye Sorgulamak için 2'e\n" + "Para Transferi için 3'e\n" + "Para Eklemek için 4'e\n"
					+ "Para Çekmek için 5'e\n" + "İşlemi Sonlandırmak için 0'a basınız.\n");

			Scanner scanner = new Scanner(System.in);

			System.out.print("Yapacağınız işlemi seçiniz: ");
			int tus = scanner.nextInt();

			switch (tus) {
			case 1:
				Musteri.this.musteriBilgileri();
				break;

			case 2:
				Musteri.this.bakiyeSorgula();
				break;

			case 3:
				Musteri.this.paraTransferi();
				break;

			case 4:
				Musteri.this.paraEkle();
				break;

			case 5:
				Musteri.this.paraCek();
				break;

			default:
				System.out.println("Sistemden çıkılıyor...");
				break;
			}
		}

	}

	@Override
	public void musteriBilgileri() {
		System.out.println("Ad: " + ad);
		System.out.println("Soyad: " + soyad);
		System.out.println("TC: " + TC);
		System.out.println("Adres: " + adres);
	}

	@Override
	public void bakiyeSorgula() {
		System.out.println("Bakiyeniz: " + bakiye);
	}

	@Override
	public void paraTransferi() {

		Musteri2 musteri2 = new Musteri2("Seyit", "KARAHAN", 30000, 22222222222l, "Diyarbakır/Bağlar");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Para transfer etmek istediğiniz tutarı giriniz: ");
		double tutar = scanner.nextDouble();

		System.out.println(
				"Para transferi " + musteri2.ad + " " + musteri2.soyad + " adlı kişiye " + tutar + "TL gönderildi.");

		System.out.println("Güncel bakiyeniz: " + (bakiye - tutar));

	}

	@Override
	public void paraEkle() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Para ekleyeceğiniz tutarı giriniz: ");
		double ekle = scanner.nextDouble();

		System.out.println("Günncel bakiyeniz: " + (bakiye + ekle));

	}

	@Override
	public void paraCek() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Çekmek istediğiniz tutarı giriniz: ");
		double cek = scanner.nextDouble();

		System.out.println("Güncel bakiyeniz: " + (bakiye - cek));

	}

}
