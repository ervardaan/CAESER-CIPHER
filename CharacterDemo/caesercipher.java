
/**
 * Write a description of caesercipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class caesercipher {
public StringBuilder changestring(StringBuilder sgiven,int key)
{
    String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";int initialindex=0;char getnewc='e';
    StringBuilder sgiven2=sgiven;
    StringBuilder sgiven3=new StringBuilder("");
    String sencrypt=s.substring(key)+s.substring(0,key);
    System.out.println(s);
     System.out.println(sencrypt);
      System.out.println(sgiven2);
      for(int i=0;i<sgiven2.length();i++)
      {
           char c=sgiven2.charAt(i);
          if(c!=' ')
          {
              if(Character.isLowerCase(c))
              {
                  
              initialindex=s.indexOf(Character.toUpperCase(c));
             getnewc=sencrypt.charAt(initialindex);
             sgiven3.insert(i,Character.toLowerCase(getnewc));
            }
            else{
             initialindex=s.indexOf(c);
             getnewc=sencrypt.charAt(initialindex);
             sgiven3.insert(i,getnewc);   
            }
        }
            else{
                sgiven3.insert(i,c);}
            }
            return(sgiven3);
                
             
}
public void encrypttwokeys(String smain,int key1,int key2)
{
    StringBuilder s1=new StringBuilder("");int c=0;
    StringBuilder s2=new StringBuilder("");
    for(int i=0;i<smain.length();i++)
    {
        char cinitial=smain.charAt(i);
        if(cinitial !=' ')// a space in b/w 2 words will not damage the 2 encryptioons
        {
            c+=1;//keeps track of odd and even placed characters excluding any spaces
            //when cinitial is a space-counter c doesn't increase 
            if(c%2==1)
            {
                s1.append(cinitial);
            }
            else{
                s2.append(cinitial);
            }
        }
    }
    StringBuilder en1=changestring(s1,key1);
    StringBuilder en2=changestring(s2,key2);
    System.out.println(en1+"      "+en2);
    //either s1>s2 or s1==s2 in lengtth as s1 contains odd characters
    

}
}
