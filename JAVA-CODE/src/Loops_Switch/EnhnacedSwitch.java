package Loops_Switch;

public class EnhnacedSwitch {
    /*
    create a method called printDayofWeek, that takes an int parameter called day. this doesn't return any value.
    Use enhanced switch statement to return the name of the day based on the parameter passes to the switch statement so that 0 will retrun sunday and so on.
    any number not b/w 0-6 should return "Invalid day"
     */

    public static String printDayOfWeek(int day){
        return switch (day){
            case 0 -> "Sunday";
            case 1 ->{
                yield  "Monday"; }
            case 2 -> "Tuseday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }

    public static void main(String[] args) {
        System.out.println("on 3 day of the week is "+ EnhnacedSwitch.printDayOfWeek(3));
        System.out.println("on 9 day of the week is "+ EnhnacedSwitch.printDayOfWeek(9));
        System.out.println("on 9 day of the week is "+ EnhnacedSwitch.printDayOfWeek(1));
    }
}
