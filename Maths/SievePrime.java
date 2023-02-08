import java.util.*;
public class SievePrime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=scn.nextInt();
        boolean primes[]=new boolean[n+1];
        sieve(n,primes);
    }
    public static void sieve(int n,boolean primes [])
    {
        for(int i=2;i*i<=n;i++)
        {
            if(!primes[i])
            {
                for(int j=2*i;j<=n;j+=i)
                {
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(!primes[i])
            System.out.println(i);
        }
    }
}
