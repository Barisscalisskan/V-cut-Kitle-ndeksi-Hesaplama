
import java.util.Scanner;

public class CokluDersCalisma {
    
public static void main(String[] args) {

Scanner bar = new Scanner(System.in);

double kilo,boy;

double vkindeks;

System.out.println("Boyunuzu metre cinsinden (M) girin :");

boy = bar.nextDouble();


System.out.println("Lütfen kilonuzu girin :");
        
kilo = bar.nextDouble();

vkindeks = ( (kilo / boy) * boy);

System.out.println("Boyunuz :" + boy);
        
System.out.println("Kilonuz :" + kilo);

System.out.println("Vücut Kitle İndeksiniz :" + vkindeks);

[Patika'ya Git](https://www.patika.dev)
    
    }
}


    
