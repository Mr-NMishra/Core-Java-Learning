package CodeBlock_MethodOverloading;

public class MethodOverloadingChallange_2 {
    /*
        weare creating a method that takes time, represented in seconds as the parameter
        we will transform the seconds into hours
        next, dispaly the time in hours with remaining minutes and seconds in a string.


        we are creating two method with the same name : getTImeInString
        first method has one parameter of type int and named seconds.
        the second method has two parameter, named minutes and seconds both are ints
        both method return string in " XXh YYm ZZs"
        the first method double in turn call the second method to return i's result.

     */

    public static String getTimeInString(int seconds){
        return getTimeInString(seconds/60,seconds%60);
    }
    public static String  getTimeInString(int minutes, int seconds){
      return ((minutes*60)+seconds)/3600+"h "+((minutes%60)+(seconds/60))+"m "+(((minutes*60)+seconds)%60)+"s";
    }

    public static void main(String[] args) {
        System.out.println(getTimeInString(3965));
        System.out.println(getTimeInString(65,45));
    }
}
