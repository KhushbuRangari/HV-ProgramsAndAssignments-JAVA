import java.util.Scanner;

public class DistanceUnitConversion {
    static Scanner sc = new Scanner(System.in);

    public static void convert(int n, double num) {

        switch (n) {
            case 1:
                System.out.println("CM to M: " + num / 100);
                break;
            case 2:
                System.out.println("M to KM: " + num / 1000);
                break;
            case 3:
                System.out.println("KM to M: " + num * 1000);
                break;
            case 4:
                System.out.println("M to CM: " + num * 100);
                break;
            default: {

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n***********Distance Unit Converter**************");
        for (;;) {
            String unit = "";
            sc = new Scanner(System.in);
            System.out.print("Please enter the choice :\n1)CM to M\n2) M to KM\n3) KM to M\n4)M to CM\n---> ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    unit = "CM";
                    break;
                case 2:
                    unit = "M";
                    break;
                case 3:
                    unit = "KM";
                    break;
                case 4:
                    unit = "M";
                    break;
                default:

            }
            System.out.println("Enter Number " + unit + " value: ");
            double num = sc.nextDouble();

            convert(n, num);
            sc = new Scanner(System.in);
            System.out.println("\nDo you want to Continue: y/n");
            String inpt = sc.nextLine();

            if (inpt.equals("Y") || inpt.equals("y")) {

            } else if (inpt.equals("N") || inpt.equals("n")) {
                System.exit(0);
            }

        }
    }
}
