
/**
 * Write a description of decryption here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class decryption {
public void decryptmessage(String encrypted)
{
    breakcaesercipher c1=new breakcaesercipher();
    int maxind=c1.countLetters(encrypted);
    int dkey=maxind-4;
    if(maxind<4)
    {
        dkey=26+(maxind-4);
    }
    System.out.println(dkey);
    c1.encryptanddecrypt(encrypted,26-dkey);
    
}  
}
