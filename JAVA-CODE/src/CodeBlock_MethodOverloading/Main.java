package CodeBlock_MethodOverloading;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws Exception{
    /*    Method_Overloading_Challange methodOverloadingChallange= new Method_Overloading_Challange();
        methodOverloadingChallange.displayHighScorePosition("Akash",500);
        methodOverloadingChallange.displayHighScorePosition("Narendra",1500);
        methodOverloadingChallange.displayHighScorePosition("Ashish", 200);
        methodOverloadingChallange.displayHighScorePosition("Navid",50);


        Check_Integer checkInteger= new Check_Integer();
        checkInteger.checkNumber(100);
        checkInteger.checkNumber(-500);
        checkInteger.checkNumber(0);
        //checking method return type
        Method method=Check_Integer.class.getMethod("checkNumber", int.class);
       //Checking return type
        System.out.println("Method "+method.getName()+" having retrun type :"+method.getReturnType());
        //checking method is tatic or not
        System.out.println("Is method is static :"+Modifier.isStatic(method.getModifiers()));




        SpeedCOnverter speedCOnverter= new SpeedCOnverter();
        speedCOnverter.printConversion(0.0);
        speedCOnverter.printConversion(95.75);


        MegaBytesConverter megaBytesConverter= new MegaBytesConverter();
        megaBytesConverter.printMegaBytesAndKiloBytes(2500);
        megaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        megaBytesConverter.printMegaBytesAndKiloBytes(5000);

     */
        System.out.println(Boolean_Logic.shouldWakeUp(true,1));
        System.out.println(Boolean_Logic.shouldWakeUp(false,2));
        System.out.println(Boolean_Logic.shouldWakeUp(true,8));
        System.out.println(Boolean_Logic.shouldWakeUp(true,-1));
    }
}
