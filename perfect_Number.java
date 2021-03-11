import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   
   // Mükemmel sayı kendisi haricindeki tüm çarpanlarının toplamı kendisini veren sayıdır.
  
  Scanner scanner = new Scanner(System.in);
  System.out.print("Lütfen sayı giriniz : ");
  int sayi= scanner.nextInt();
  int toplam = 0;

  for(int i = 1; i < sayi; i++){
    if(sayi%i==0){
      toplam+=i;
      
    }
  }
  if(sayi==toplam){
    System.out.println(sayi+" mükemmel sayıdır...");
  }
  else{
    System.out.println(sayi+" mükemmel sayı değildir...");
  }
 
  }
}
