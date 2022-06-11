
/**
 * Write a description of newapproach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class newapproach {
public void getfiles()
{
    DirectoryResource dr=new DirectoryResource();//get all files
    String []a=new String[20];int i=0;
    FileResource fr2=new FileResource("data\\common.txt");//get common words file
    for(String s1:fr2.words())//get all 20 words
    {
        a[i]=s1;//store each word in an array
        i+=1;
    }
   
    int b[]=new int[20];//this integer array records the no of times a word appears each time in a file
    for(File f:dr.selectedFiles())
    {
        FileResource fr=new FileResource(f);//converted one file
        for(String s:fr.words())
        {
            int c=-1;
            for(int k=0;k<20;k++)
            {
                if(a[k].equals(s.toLowerCase()))//our common file has all 20 words in lower case so compare each word of shakespeare file after converting them but print the original one
                {
                    c=k;
                    break;
                }
            }
            if(c!=-1)
            {
              b[c]+=1;
            }
        }
    }
     for(int j=0;j<20;j++){
         System.out.println(a[j] +"     "+b[j]);}
}
}
    
    
