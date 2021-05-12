public class SucesionPadovan {

    
    public  int Sucesion(int n) {
    int Padovan2=0;
          
    for(int i = 3; i <= 12; i++)
        {
            if(n == 0 || n == 1 || n == 2){
            return 1;
        }
        else{
            return Sucesion(n-2) + Sucesion(n-3);
        }
        }
    return Padovan2;

   
}
}