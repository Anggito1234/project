
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
public class menentukanarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  max,minimum, jumlah, i, lokasi = 1, array[];
        float rata = 0;
        
        System.out.print("Masukkan jumlah elemen: ");
        Scanner boy = new Scanner(System.in);
        jumlah = boy.nextInt();
        array = new int[jumlah];
    
    System.out.println("Masukkan "+jumlah+" angka");
    for(i = 0; i < jumlah; i++) {
      System.out.print("Elemen ke-"+ (i+1) +": " );
      array[i] = boy.nextInt();
      
    if (array[i] == 9){
        System.out.println("Anda mendapatkan Angka reward");
         }  
    }
    //menghitung array minimu
    minimum = array[0];
    
    for(i = 1; i < jumlah; i++) {
      if (array[i] < minimum){
        minimum = array[i];
        lokasi = i+1;
      }
    }
    
    //menghitung max array
    max = array[0];
    
    for(i = 1;i < jumlah; i++){
        if (array[i] > max){
            max =array[i];
            lokasi =i+1;
        }
    }
    
    for (i = 1 ; i == jumlah;i++){
        if (array[i] == max ){
        rata = max/jumlah;   
        }
    }
    
    System.out.println("Nilai minimum adalah "+minimum);
    System.out.println("Nilai maksimum adalah "+max);
    System.out.println("Nilai maksimum adalah "+rata);
    
  }
}
