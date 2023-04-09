
public class SampleProgramAssign {

    public static void main(String[] args) {

      

        Uniform uniformObject = new Uniform();

        uniformObject.todaysDressCode("red");

    }

}

class Uniform extends WhiteShirt{

    public void todaysDressCode(String color) {

        color(color);

    }
  

}

abstract class WhiteShirt {

    public void color() {

        System.out.println("White");

    }

    public void color(String color) {
        System.out.println(color);
    }

}