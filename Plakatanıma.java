
package plakatanıma;

import java.util.Scanner;


public class Plakatanıma {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
		String sehirList[]= new String[] {
				"Adana",
			    "Adıyaman",
			    "Afyonkarahisar",
			    "Ağrı",
			    "Amasya",
			    "Ankara",
			    "Antalya",
			    "Artvin",
			    "Aydın",
			    "Balıkesir",
			    "Bilecik",
			    "Bingöl",
			    "Bitlis",
			    "Bolu",
			    "Burdur",
			    "Bursa",
			    "Çanakkale",
			    "Çankırı",
			    "Çorum",
			    "Denizli",
			    "Diyarbakır",
			    "Edirne",
			    "Elazığ",
			    "Erzincan",
			    "Erzurum",
			    "Eskişehir",
			    "Gaziantep",
			    "Giresun",
			    "Gümüşhane",
			    "Hakkari",
			    "Hatay",
			    "Isparta",
			    "Mersin",
			    "İstanbul",
			    "İzmir",
			    "Kars",
			    "Kastamonu",
			    "Kayseri",
			    "Kırklareli",
			    "Kırşehir",
			    "Kocaeli",
			    "Konya",
			    "Kütahya",
			    "Malatya",
			    "Manisa",
			    "Kahramanmaraş",
			    "Mardin",
			    "Muğla",
			    "Muş",
			    "Nevşehir",
			    "Niğde",
			    "Ordu",
			    "Rize",
			    "Sakarya",
			    "Samsun",
			    "Siirt",
			    "Sinop",
			    "Sivas",
			    "Tekirdağ",
			    "Tokat",
			    "Trabzon",
			    "Tunceli",
			    "Şanlıurfa",
			    "Uşak",
			    "Van",
			    "Yozgat",
			    "Zonguldak",
			    "Aksaray",
			    "Bayburt",
			    "Karaman",
			    "Kırıkkale",
			    "Batman",
			    "Şırnak",
			    "Bartın",
			    "Ardahan",
			    "Iğdır",
			    "Yalova",
			    "Karabük",
			    "Kilis",
			    "Osmaniye",
			    "Düzce"};
		System.out.print("Plakayı girniz:");
		String plaka = input.nextLine();
		int i = Integer.parseInt(plaka.substring(0,2));
		System.out.println(sehirList[i-1]);
		
    }
}
