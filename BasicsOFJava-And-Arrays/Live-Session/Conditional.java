//Find which day of week is this.

public class Conditional{
    public static void main(String[] args)
    {
        int day = 5;
        String s = "\nThe Day of week is :";

        if (day==1){
            System.out.println(s+"Monday");
        }
        else if (day==2){
            System.out.println(s+"Tuesday");
        }
        else if (day==3){
            System.out.println(s+"Wednesday");
        }
        else if (day==4){
            System.out.println(s+"Thursday");
        }
        else if (day==5){
            System.out.println(s+"Friday");
        }
        else if (day==6){
            System.out.println(s+"Saturday");
        }
        else if (day==7){
            System.out.println(s+"Sunday");
        }
        
        else {
            System.out.println("Invalid Input");
        }
    }

}