/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

/**
 *
 * @author ANKS
 */
public class Transform {
    public static String encrypt(String s){
        String res="";
        int i,l=s.length();
        for(i=0;i<l;i++){
            res+=(char)((s.charAt(i)+1)%256);
        }
        return res;
    }
    public static String decrypt(String s){
        String res="";
        int i,l=s.length();
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='\n'){
                res+="\n";
                continue;
            }
            res+=(char)((s.charAt(i)-1)%256);
        }
        return res;
    }
    
}
