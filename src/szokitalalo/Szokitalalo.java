
package szokitalalo;

import java.util.Scanner;


public class Szokitalalo {


    public static void main(String[] args) {
        String[] szavak = {"kf","lt","ap"};
        String talalat = null;
        Scanner sc = new Scanner(System.in);

        String szo = sc.nextLine();
        String karakter = new String(new char[szo.length()]);
        int i=0;
        for (i = 0; i < szo.length(); i++) {
            if (szo.contains("*"))
            {
                    System.out.println("Kérek egy szót: ");
                    System.out.printf(karakter);
            }
            else{
                System.out.println("nemjo.");
            }
        }    

        String helyet ="";
        while(i<szo.length()){
            if(szo.charAt(i) == talalat.charAt(0))
        {
            helyet += talalat.charAt(0);
        }
        else if (szo.charAt(i) != '*')
        {
            helyet += szo.charAt(i);
        }
        else{
            helyet +="*";
            }
        }
        if ( karakter.equals(helyet)){
            i++;
        }
        else{
            
        }
        if( karakter.equals(szo)){
            System.out.println("Eltalaltad.");
        }
       
    }
}
