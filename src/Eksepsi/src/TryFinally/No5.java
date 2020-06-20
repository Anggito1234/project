/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryFinally;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mahas
 */
public class No5 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        String cmdX;
        
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Terjadi Mata-Mata, pengguna masukkan kata aman: ");
        
        try{
        cmdX = inputUser.readLine();
        checkData(cmdX);
        System.out.println("Anda Aman");
        }
        
        catch(MyException e){
        System.out.println(e);
        }
        catch(IOException e){
            return;
        }
}
        static void checkData(String value) throws MyException{
        if (!value.equals("123"))
        throw new MyException(value);
    }

}