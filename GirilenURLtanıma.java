
package girilenurltanıma;
import java.util.Scanner;
public class GirilenURLtanıma {

  
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       System.out.println("lütfen URL adresini giriniz");
       String u =a.nextLine();
       
       String[] list = new String[]{".com.tr",".org.tr","com",".org",".gov.tr",".edu.tr",".it","us","uk"};
       
       
       for(int i=0;i<7;i++){
        boolean isFound = u.indexOf(list[i]) !=-1? true:false;
       if(isFound){
           System.out.println(u+"url'si"+" "+list[i]+" "+" uzantısına sahiptir");
           break;
       }
       }
       
       
      
       
    }
    
}
