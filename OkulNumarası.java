 
package okulnumarası;

import java.util.Scanner;

 
public class OkulNumarası {
 
    public static void main(String[] args) {
         Scanner klavye = new Scanner(System.in);
         System.out.println("lütfen okul numaranızı giriniz");
         String no =klavye.nextLine();
         String ilkiki=no.substring(0,2);
         
         System.out.println("Girdiğiniz sene 20"+ilkiki);
         
         String ucdort =no.substring(2,4);
        
         if(ucdort.equals("05")){
            System.out.println("birinci öğretimsiniz");
         
         }else{
             System.out.println("ikinci öğretim öğrencisisiniz");
         }
         String soniki = no.substring(7,9);
         System.out.println("okula giriş sıranız :"+soniki);
         
         int i=Integer.parseInt(no);  
         if(i%2==0){
             System.out.println("B şubesindesiniz");
         }else{
             System.out.println("A şubesindesiniz");
         
         }
         String dortbesaltı = no.substring(4, 7);
         if(dortbesaltı.equals("410")){
             System.out.println("Yazılım mühendisi öğrencisi");
         }
     
    }
    
}
