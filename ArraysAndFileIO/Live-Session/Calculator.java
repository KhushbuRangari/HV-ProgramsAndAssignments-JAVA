//Program for Calculator by Khushbu Rangari

public class Calculator{
 
   
    public int add(int a, int b){
      return a+b;
    }
     public int subtract(int a, int b){
      return a-b;
    }
     public int multiply(int a, int b){
      return a*b;
    }
     public int divide(int a, int b){
      return a/b;
    }
     public int modulo(int a, int b){
      return a%b;
    }
    public static void main(String[] args){
    int a=5;
    int b=7;
    Calculator myCalculator= new Calculator();
    
    System.out.println("\n-----------Calculator-----------------");
   
    System.out.println("The Addition of :"+a+" and "+b+" is "+ myCalculator.add(a,b));
    System.out.println("The Subtraction of :"+a+" and "+b+" is "+myCalculator.subtract(a,b));
    System.out.println("The Division of :"+a+" and "+b+" is "+myCalculator.divide(a,b));
    System.out.println("The Modulo of :"+a+" and "+b+" is "+myCalculator.modulo(a,b));

    }
  
  }