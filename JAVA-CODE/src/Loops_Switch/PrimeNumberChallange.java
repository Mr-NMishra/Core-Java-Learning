package Loops_Switch;

public class PrimeNumberChallange {
    /*
    create a prime number counter variable that will keep count of how many numbers were found.
     */

    public static int primeCounter(int initialNumber, int lastNumber ){
        int count=0;
        boolean result=false;

        for(int i=initialNumber;i<=lastNumber;i++){
            result=isPrime(i);
            if(result){
                System.out.println(i+" is prime");
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int number){
       if(number==1)
           return false;
       if(number ==2)
           return true;
       for(int i=2;i<(number/2);i++){
        if(number%i==0)
            return false;
       }
       return true;
    }



    public static void main(String[] args) {
        System.out.println("Number 2 is prime :"+PrimeNumberChallange.isPrime(2));
        System.out.println("Number 12 is prime :"+PrimeNumberChallange.isPrime(12));
        System.out.println("Number 11 is prime :"+PrimeNumberChallange.isPrime(11));
        System.out.println("Number 13 is prime :"+PrimeNumberChallange.isPrime(13));

        System.out.println("Prime number between 10 to 20 : "+PrimeNumberChallange.primeCounter(10,50));
    }
}
