
/**
 * Write a description of class sucesionpadovan2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sucesionpadovan2
{
  public static void seriePadovan(int hasta){
    long n[]=new long[hasta];
    
    int i;
    n[0]=n[1]=n[2]=1;
    int limite=hasta;
    for( i=3;i<limite;i++){
        n[i]=n[i-2]+n[i-3];
        System.out.println(n[i]);
    }
   
  }
}
