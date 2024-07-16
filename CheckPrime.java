public class CheckPrime {
    static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i=2;i<10;i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }
    }
}
