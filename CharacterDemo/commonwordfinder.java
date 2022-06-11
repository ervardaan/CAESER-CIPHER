
/**
 * Write a description of commonwordfinder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import edu.duke.*;
public class commonwordfinder {
/* public findwords()
{
    DirectoryResource dr=new DirectoryResource();
    for(File f:dr.selectedFiles())
    {
        FileResource fr=new FileResource(f);
        String content1=fr.asString();
        getwords(content1);
}}
*/
public void etwords()
{
    FileResource fr1=new FileResource("data\\common.txt");
    String commoncontent=fr1.asString();
    String word="";
    String []collectcommon=new String[20];
    for(int i=0;i<20;i++)
    {
        char c=commoncontent.charAt(i);
        if(c!='\n')
        {
            word=word+c;
        }
        else{
          collectcommon[i]=word; 
        }
        word="";
    }
    for(int j=0;j<20;j++){
        System.out.println(collectcommon[j]);
    }
    /* for(i=0;i<commoncontent.length();i++)
    {
    }*/
}
}  
