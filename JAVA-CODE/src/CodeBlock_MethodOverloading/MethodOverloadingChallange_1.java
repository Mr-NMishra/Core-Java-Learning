package CodeBlock_MethodOverloading;

public class MethodOverloadingChallange_1 {
    /*
     create two method with same name
     first method has one parameter of type int, it represent height in inches. method converts inches to centimeter, and passback the number of centimeters as a double

     second method has two parameter of type int one represent height in feet and other is remaining height into inches.
     this method converts feet and inches to just inches, then call the first method to get the number of centimeters, also returning the value as double.

     both method return a real number or decimal value for total height in centimeters.

     call both methods and print out the result

     inch= 2.54cm
     1 foot=12 inches.

     */

    public static double convertToCentimeters(int inches){
        return inches*2.54;
    }
    public  static double convertToCentimeters(int feet,int inches){
        return convertToCentimeters((feet*12)+inches);
    }

    public static void main(String[] args) {
        System.out.println("5ft, 8in = "+convertToCentimeters(5,8)+" cm");
        System.out.println("68in = "+convertToCentimeters(68)+" cm");
    }

}
