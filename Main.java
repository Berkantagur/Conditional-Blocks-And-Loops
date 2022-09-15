package intro;

public class Main {
//main javada başlangıç noktasıdır.
	public static void main(String[] args) {
       System.out.println("Hello world!");

       String ortaMetin = "İlginizi çekebilir";
       String altMetin = "Vade süresi";
       
 //javada bütün kod satırları ; ile bitmek zorundadır.
 //değişken isimlendirilmeleri java'da camelCase yazılır.      
      
       System.out.println(ortaMetin);
       
       //integer
       int vade = 12;
       
       double dolarDün = 18.20;
       double dolarBugün = 18.20;
       
       boolean dolarDüştüMü = true;
       
       String okYönü = "";
       
       if (dolarBugün<dolarDün) { //false
    	   okYönü = "down.svg";
	System.out.println(okYönü);
       } 
       else if(dolarBugün>dolarDün) {
    	   okYönü = "up.svg";
    	   System.out.println(okYönü);
       }
       else {
    	   okYönü = "equal.svg";
    	   System.out.println(okYönü);
}
       //java'da [] veri listesi olduğunu gösterir.
       //array
       
       String[] krediler = {"Dijital Kredi","İhtiyaç Kredisi","Tüketici Kredisi","Taşıt Kredisi"};
       
       System.out.println(krediler[0]);
       System.out.println(krediler[1]);
       System.out.println(krediler[2]);
       System.out.println(krediler[3]);
       
       for (int i = 0; i < krediler.length; i++) {
    	   System.out.println(krediler[i]);
	}
       
       
	}

}
