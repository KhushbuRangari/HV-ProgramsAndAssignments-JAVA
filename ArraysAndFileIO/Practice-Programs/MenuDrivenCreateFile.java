
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuDrivenCreateFile {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Enter Choice");
            System.out.println("1)Create a new folder");
            System.out.println("2)Create, Write and Append data a new text file");
            System.out.println("3)Append data to file");
            System.out.println("4)Rename a file");
            System.out.println("5)Delete a File");
            System.out.println("6) To exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc = new Scanner(System.in);
                    System.out.print("Please enter the Folder-name to be Created:\n");

                    String pathName = sc.nextLine();

                    File file = new File(pathName);

                    if (file.mkdir())
                        System.out.println("Folder is created successfully !");

                    else
                        System.out.println("Folder not created.");

                    System.out.println("Press 'Y' to go back to the Main File-Operations Menu: Y");
                    sc = new Scanner(System.in);
                    String dec = sc.nextLine();
                    if (dec.equalsIgnoreCase("Y")) {
                        break;
                    }
                    System.exit(0);

                case 2:
                    sc = new Scanner(System.in);

                    System.out.print("Enter the path :\n");

                    String strPath = sc.nextLine();
                    System.out.print("Enter the file name :\n");
                    String fileName = sc.nextLine();

                    File fileText = new File(strPath + "/" + fileName + ".txt");

                    if (fileText.createNewFile())
                        System.out.println("File is created successfully !");

                    else
                        System.out.println("file not created.");

                    System.out.println("Enter the text to write to file :");
                    sc = new Scanner(System.in);
                    String text = sc.nextLine();
                    byte[] byteInpt = text.getBytes();
                    FileOutputStream fos = new FileOutputStream(fileText, true);
                    fos.write(byteInpt);
                    fos.close();

                    System.out.println("Press 'Y' to go back to the Main File-Operations Menu: Y");
                    sc = new Scanner(System.in);
                    String dec2 = sc.nextLine();
                    if (dec2.equalsIgnoreCase("Y")) {
                        break;
                    }
                    System.exit(0);

                case 3:
                    String data = "";

                    try {

                        sc = new Scanner(System.in);
                        System.out.println("Enter the File name to append: ");
                        String fName = sc.nextLine();
                        FileWriter file3 = new FileWriter(fName + ".txt", true);
                        BufferedWriter bw = new BufferedWriter(file3);
                        System.out.println("Enter the text :" + data);
                        String sr = sc.nextLine();

                        bw.write(sr + "\n");
                        bw.close();
                        System.out.println("File written Successfully");

                    }

                    catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Press 'Y' to go back to the Main File-Operations Menu: Y");
                    sc = new Scanner(System.in);
                    String dec3 = sc.nextLine();
                    if (dec3.equalsIgnoreCase("Y")) {
                        break;
                    }
                    System.exit(0);

                case 4:
                    sc = new Scanner(System.in);

                    System.out.println("Enter the file name to rename");
                    String fRename = sc.nextLine();
                    File file4 = new File(fRename);
                    System.out.println("Enter the new name");

                    String fNewName = sc.nextLine();
                    File file5 = new File(fNewName);

                    if (file4.renameTo(file5)) {
                        System.out.println("file renamed\n");
                    } else {
                        System.out.println("rename failed\n");
                    }
                    System.out.println("Press 'Y' to go back to the Main File-Operations Menu: Y");
                    sc = new Scanner(System.in);
                    String dec4 = sc.nextLine();
                    if (dec4.equalsIgnoreCase("Y")) {
                        break;
                    }
                    System.exit(0);
                case 5:
                    sc = new Scanner(System.in);

                    System.out.println("Enter the file name to delete");
                    String fdelete = sc.nextLine();
                    File file6 = new File(fdelete);

                    if (file6.delete()) {
                        System.out.println("file Deleted\n");
                    } else {
                        System.out.println("delete failed\n");
                    }

            
                    System.out.println("Press 'Y' to go back to the Main File-Operations Menu: Y");
                    sc = new Scanner(System.in);
                    String dec5 = sc.nextLine();
                    if (dec5.equalsIgnoreCase("Y")) {
                        break;
                    }
                    System.exit(0);

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Default");
                    break;
            }
        }
    }
}
