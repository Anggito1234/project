/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryFinally;

public class MyException extends Exception {
private String value;


public MyException(String myValue){
    value = myValue;}

 
    public String toString() {
        if (!value.equals("123")){
            return "Anda Tidak Aman";
        }
        else{
            return "Anda Aman";
        }

    }

}

