/*
 * hello
 * @author Todimu Jenrola
 */
public class compute {

    public static void main(String[] args) {
        //System.out.println("The numbers are: ");
    
    int i = computeSumOfEvenNumbers(10);
    System.out.println(i);

    }

    public static int computeSumOfEvenNumbers(int n){
    int sum = 0;
    if (n%2 == 0){
    int i = n;
    while(i>0)
    {
        sum+=i;
        i-=2;
    }
    }

    else{
    int i = n-1;
    while(i>0)
    {
        sum+=i;
        i-=2;
    }
    }

    return sum;
    }
}
