
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGGITO ALFARIZI
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i = 1;
      int a;
    
    System.out.print("Masukan angka = ");
    a = new Scanner(System.in).nextInt();

    while ( i <  a ){ 
        // blok kode yang akan diulang
        System.out.println("Perulangan ke-" + i);

        // increment nilai i
        i++;
        }
      }   
    }
