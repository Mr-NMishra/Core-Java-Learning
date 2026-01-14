package Functional_Interface;

@FunctionalInterface
interface SumNumber{
    int sum(int a, int b);
    default void show(){
        System.out.println("SumNUmber method called");
    }
}

@FunctionalInterface
interface SubstractNumber {
    default void show(){
        System.out.println("SubtractNumber Method called");
    }
    int substract(int number);
}

abstract class child implements SumNumber, SubstractNumber {
    public  void show(){
        System.out.println("Child show mwthod");
    }

}
public class LambdaExpression {
    public static void main(String[] args) {
        // first Functional Interface called
   /*     first Functional interface have an abstract method , if we want to use that abstract method (i.e. method without having body or implementation)
         we need to provide  body first then we can use it.
    */
        SumNumber sumNumber=(a,b)->a+b;
        System.out.println("Sum of two number :"+sumNumber.sum(10,5));

        //second Functional interface called
/*      before using abstract method from second functional interface we need object of second functional interface, like annonymous class
        and for that we need to create a non-abstract class and for that we must implement a abstract method.
 */
        SubstractNumber substractNumber=(s)->s-1;
        System.out.println("number sunstracted by -1 : "+substractNumber.substract(100));

        //showing show method from second functional interface
        substractNumber.show();



    }
}


