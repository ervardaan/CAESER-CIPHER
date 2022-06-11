
/**
 * Write a description of breakceasercipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class breakcaesercipher {
public void encryptanddecrypt(String s1,int key)
{
    String check="ABCDEFGHIJKLMNOPQRSTUVWXYZ";int n=0;char newc='e';
    StringBuilder s3=new StringBuilder();
    String keycheck=check.substring(key)+check.substring(0,key);
  StringBuilder s=new StringBuilder(s1);
  for(int i=0;i<s.length();i++)
  {
      char c=s.charAt(i);
      if(Character.isAlphabetic(c))//print space directly as it's not an alphabet
      {
          
      if(Character.isLowerCase(c))
      {
          
       n=check.indexOf(Character.toUpperCase(c));
       newc=Character.toLowerCase(keycheck.charAt(n));
      
    }
    else{
        n=check.indexOf(c);
        newc=keycheck.charAt(n);
    }
    s3.insert(i,newc);
}
else{
    s3.insert(i,c);}
}
System.out.println( s3);
}
public int countLetters(String s1)
{
    String al="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  int [] a=new int[26];int i=0;
    while(i<s1.length())
    {
        char c=s1.charAt(i);
        int j=al.indexOf(Character.toUpperCase(c));
        if(j!=-1)
        {
            a[j]+=1;
        }
        i+=1;
    }
    int l=0;int index=0;
    for(int k=0;k<26;k++)
    {
        
        if(a[k]>l)
        {
            l=a[k];
            index=k;
        }
    }
    return(index);
}
}


        
    

