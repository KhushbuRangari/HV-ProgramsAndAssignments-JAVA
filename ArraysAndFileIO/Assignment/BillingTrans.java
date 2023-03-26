
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BillingTrans {

    public static int findMin(List<Integer> iList) {
        Collections.sort(iList);
        return iList.get(0);
    }

    public static int findMax(List<Integer> iList) {
        Collections.sort(iList);
        return iList.get(iList.size() - 1);
    }

    public static void main(String[] args) {

        int headerlines = 1;
        int sum = 0;
        int trans;
        int rowcount = 1;
        int count = 0;
        String data;
        
        
        List<Integer> ilist = new ArrayList<>();

        try {
            FileReader file = new FileReader("Billing_Trans.csv");
            BufferedReader buffer = new BufferedReader(file);

            while ((data = buffer.readLine()) != null) {

                if (rowcount <= headerlines) {
                    rowcount += rowcount;
                    continue;
                }
                String[] array = data.split(",", -1);
                trans = Integer.parseInt(array[3]);

                ilist.add(trans);
                System.out.println("transaction for transaction ID " + array[0] + " is " + trans);
                count = count + 1;
                sum = sum + trans;

            }
            System.out.println(ilist);
            System.out.println("Total transaction (in INR) :" + sum);
            System.out.println("Total number of Transactions :" + count);
            System.out.println("Maximum Bill amount - " + findMax(ilist));
            System.out.println("Minimum Bill amount - " + findMin(ilist));
         
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
