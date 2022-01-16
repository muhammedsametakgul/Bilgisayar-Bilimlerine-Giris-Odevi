 
package girilenmailkontrolu;

import java.util.Scanner;

 
public class GirilenMailKontrolu {

    
    public static void main(String[] args) {
        Scanner mail = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz");
        String email = mail.nextLine();
        
        boolean isFound = email.indexOf("@") != -1;
        if(isFound){
            System.out.println("Girdiğiniz mail gerçek bir maildir" +" "+ email);
        }
        String[] list = new String[]{"gmail.com","hotmail.com","outlook.com","zoho.com","yahoo.com","aol.com","icloud.com","yandex.com","firat.edu.tr"};
        for(int i=0;i<9;i++){
        boolean a =email.contains(list[i]);
            if(a){
                System.out.println("girdiğiniz mailin sağlayıcısı"+"  "+list[i]);
                break;
            }
        
        }
    }
    
}
