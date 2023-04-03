package appointment.booking.models;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Patients> pList = new ArrayList<>();
    static List<Doctors> dList = new ArrayList<>();
    List<String> timeSlot = List.of("8_10", "10_12", "12_14", "14_16");
    List<String> daySlot = List.of("Mon", "Tue", "Wed", "Thur", "Fri", "Sat");
    List<String> SkillIssues = List.of("FEVER", "STOMACH_PAIN", "JOINT_PAIN");

    public static void main(String[] args) throws Exception {
        pList = readPatientData();
        dList = readDoctorsData();

        while (true) {
            System.out.println("Enter your choice");
            System.out.println(
                    "1)Visitors List - View list of all Visitors\n 2)Add new Visitor \n 3)Edit Visitor Details \n4)View Appointment Schedule for a Day \n5)Book an Appointment - Book new appointment with available time slots \n 6)Edit Appointment\n7)Cancel Appointment\n8)EXIT ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("View list of all Visitors");
                    System.out.println("Name | Mobile | Email | Address | ID |Presecription");
                    for (Patients list : pList)
                        System.out.println(list);
                    break;
                case 2:

                    sc = new Scanner(System.in);
                    System.out.println("Register new patient");
                    System.out.println("Enter Name:");
                    String pName = sc.nextLine();
                    System.out.println("enter email :");
                    String pEmail = sc.nextLine();
                    System.out.println("enter id :");
                    String pid = sc.nextLine();
                    System.out.println("enter issue :");
                    String pIssue = sc.nextLine();
                    System.out.println("enter address :");
                    String pAddress = sc.nextLine();
                    System.out.println("enter mobile :");
                    String pMobile = sc.nextLine();
                    Patients newPatient = new Patients(pName, pMobile, pEmail, pAddress, pid, pIssue, pName, pName);
                    pList.add(newPatient);
                    for (Patients list : pList)
                        System.out.println(list + "\n");

                    break;
                case 3:
                    sc = new Scanner(System.in);
                    System.out.println("Update patient details");
                    System.out.println("Enter Name to search:");
                    pName = sc.nextLine();

                    Patients ept = getPatientData(pName);
                    if (ept != null) {
                        System.out.println("enter email :");
                        pEmail = sc.nextLine();
                        ept.setEmail(pEmail);
                        System.out.println("enter issue :");
                        pIssue = sc.nextLine();
                        ept.setIssue(pIssue);
                        System.out.println("enter address :");
                        pAddress = sc.nextLine();
                        ept.setAddress(pAddress);
                        System.out.println("enter mobile :");
                        pMobile = sc.nextLine();
                        ept.setMobile(pMobile);
                        updatePatientData(ept.getId(), ept);
                    }
                    System.out.println("Name | Mobile | Email | Address | ID");
                    for (Patients list : pList)
                        System.out.println(list + "\n");
                    break;
                case 4:

                    System.out.println("View Appointment Schedule for a Day");
                  
                    for (Patients pt : pList) {
                        if (pt.getAppointmentSlot()) {
                            System.out.println("---" + pt + " " + pt.getDocterName() + " " + pt.getDoctorId() + "---");
                        }
                    }

                    break;
                case 5:

                    System.out.println("Book new appointment with available time slots");
                    sc = new Scanner(System.in);
                    System.out.println("Enter Name to search:");
                    pName = sc.nextLine();

                    ept = getPatientData(pName);
                    String issue = ept.getIssue();
                    System.out.println("The doctor list for the issue :");
                    for (Doctors dt : dList) {
                        if (issue.equalsIgnoreCase(dt.getSpecialization())) {
                            System.out.println(dt);

                        }

                    }

                    System.out.println("enter the doctor id ");
                    String docID = sc.nextLine();
                    for (Doctors dt : dList) {
                        if (docID.equalsIgnoreCase(dt.getId())) {
                            ept.setDocterName(dt.getName());
                            ept.setDoctorId(dt.getId());
                            if (ept.getAppointmentSlot()) {
                                ept.setTimeSlot(dt.getDay() + "DAY Time: " + dt.getAvailableSlot());
                                System.out.println(pName + "'s  Apointment booked for :\n" + ept.getTimeSlot() + "\n");
                                break;
                            } else {
                                System.out.println("***Appointment not booked.***\n");
                                break;
                            }

                        }
                    }

                    break;
                case 6:
                    System.out.println("Update the appointment after a visit is done.");
                    System.out.print("Enter Name to search:");
                    pName = sc.nextLine();

                    ept = getPatientData(pName);

                    for (Patients pt : pList) {
                        if (pName.equalsIgnoreCase(pt.getName())) {
                            if (pt.getAppointmentSlot()) {
                                System.out.println("***---Visit completed---***");
                                pt.setDocterName("");
                                pt.setDoctorId("");
                                break;
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.print("Enter patient Name to cancel appointment:");
                    pName = sc.nextLine();

                    ept = getPatientData(pName);

                    for (Patients pt : pList) {
                        if (pName.equalsIgnoreCase(pt.getName())) {
                            if (pt.getAppointmentSlot()) {
                                System.out.println("***---Appoinment cancelled---***");
                                pt.setDocterName("");
                                pt.setDoctorId("");
                                break;
                            }
                        }
                        
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    break;
            }
        }

    }

    private static boolean updatePatientData(String id, Patients updPt) {
        for (Patients pt : pList) {
            if (id.equalsIgnoreCase(pt.getId())) {
                pList.remove(pt);
                pList.add(updPt);
                return true;
            }
        }
        return false;
    }

    private static Patients getPatientData(String name) {
        for (Patients pt : pList) {
            if (name.equalsIgnoreCase(pt.getName())) {
                return pt;
            }
        }
        return null;
    }

    // private static Doctors getIssue(String issue) {
    // for (Doctors dt : dList) {
    // if (issue.equalsIgnoreCase(dt.getSpecialization())) {
    // return dt;
    // }
    // }
    // return null;
    // }

    private static List<Doctors> readDoctorsData() {
        List<Doctors> dList = new LinkedList<>();
        File file = new File("src/appointment/booking/models/doctors.csv");
        try {
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] token = line.split(",");
                Doctors od = new Doctors(token[0], token[1], token[2], token[3], token[4], token[5], token[6],
                        token[7]);
                dList.add(od);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dList;
    }

    private static List<Patients> readPatientData() {

        File file = new File("src/appointment/booking/models/patient.csv");
        try {
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] token = line.split(",");

                Patients op = new Patients(token[0], token[1], token[2], token[3], token[4], token[5]);
                pList.add(op);

            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pList;
    }
}
