package CodeBlock_MethodOverloading;

public class DecimalComparator {
    /*
        Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
        The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

     */

        public static boolean areEqualByThreeDecimalPlaces(double first, double second){
            return (int)(first*1000)==(int)(second*1000);
        }
}
