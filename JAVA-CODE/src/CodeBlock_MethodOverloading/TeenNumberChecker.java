package CodeBlock_MethodOverloading;

public class TeenNumberChecker {
    /*
    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
    Write a method named hasTeen with 3 parameters of type int.
    The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    Write another method named isTeen with 1 parameter of type int.
    The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
     */
    public static boolean hasTeen(int first, int second, int third){
        return (first>=13 && first<=19) || (second>=13 && second<=19) || (third>=13 && third<=19);
    }

    public static boolean isTeen(int first){
        return first>=13 && first<=19;
    }
}
