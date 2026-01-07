package CodeBlock_MethodOverloading;

public class MegaBytesConverter {
    /*
        Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
        The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

        For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
     */

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes>=0){
            int megaByte=kiloBytes/1024;
            int remainingKB=kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+megaByte+" MB and "+remainingKB+" KB");
        }else
            System.out.println("Invalid Value");
    }
}
