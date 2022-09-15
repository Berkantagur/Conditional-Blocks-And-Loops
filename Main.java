package intro;

public class Main { 
	
	public static void main(String[] args) {
		
       double dolarDün = 18.20;
       double dolarBugün = 18.20;
       
       boolean dolarDüştüMü = true;
       
       String okYönü = "";
       
       if (dolarBugün<dolarDün) { //false
    	   okYönü = "down.svg";
	System.out.println(okYönü);
       } 
       else if(dolarBugün>dolarDün) {//false
    	   okYönü = "up.svg";
    	   System.out.println(okYönü);
       }
       else {//true
    	   okYönü = "equal.svg";
    	   System.out.println(okYönü);
}
       //java'da [] veri listesi olduğunu gösterir.
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
