
/**
 * Write a description of randomgenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class randomgenerator {
public int[] generate(int roll)
{
    int []a=new int[12];
    
    Random r=new Random();
    for(int i=1;i<=roll;i++)
    {
        int n=r.nextInt(6)+1;//we add 1 because min random number generated is 0 but we want min number generated to be 1
        int n2=r.nextInt(6)+1;
        /* wherever we find sum=x,we add 1 to the position x-2 inside array and thus adding 1 each time on finding a number x acts like a counter for that number x appearing as sum on both dice */
        a[n+n2-2]+=1;//min value of n+n2 is 2 therefore 2 goes to index 0 inside array a
    }
    return (a);
}
}
