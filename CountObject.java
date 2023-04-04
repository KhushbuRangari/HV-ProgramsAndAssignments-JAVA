 /*Question 2: Count the number of Objects

Skill Mapping: Basic

Description: Write a program in Java, which will display the total number of Objects created for a class.

Task 1 - Declare a counter variable in class and initialize it to zero

Task 2 - Increase the value of a counter variable every time the object is created - (Note - constructor method is called when the object is created)

Task 3 - create a method which will return the value of a counter variable */
 
 public class CountObject{
   static int count = 0;

   
    int countMethod(){
        return count++;
    }

    public static void main(String[] args) {
        
        CountObject obj = new CountObject();
     
        CountObject obj1 = new CountObject();
        obj1.countMethod();
       
        CountObject obj2 = new CountObject();
        obj2.countMethod();

        CountObject obj3 = new CountObject();
        obj3.countMethod();
        
        System.out.println("Object of Class is created "+obj.countMethod()+" times.");
       
    }
}
