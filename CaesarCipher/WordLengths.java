
/**
 * Write a description of WordLengths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class WordLengths {
public int[] countWordLengths(FileResource resource,int []counts)
{
    int l=0;
    for(String s:resource.words())
    {
        l=s.length();
     if(Character.isLetter(s.charAt(0))==false)
     {
          l-=1;}
         if(Character.isLetter(s.charAt(s.length()-1))==false)
         {
             l-=1;}
             counts[l]+=1;//l length word is stored at lth index ,so 30 th length word will not be stored in a 30 length array
      
    
}
/*for(int i=0;i<30;i++)
{
    
    System.out.println(counts[i]);
}*/
return counts;
}
public int indexOfMax(int[] values)
{
    int i=0;int l=0;
    while(i<values.length)
    {
       if(values[i]>=l)
       {
           l=values[i];
        }
    i+=1;
}
return l;
}
public void get()
{
    FileResource r=new FileResource();
    int []a=new int[30];
    int []b=countWordLengths(r,a);
    System.out.println(indexOfMax(b));
}
}
