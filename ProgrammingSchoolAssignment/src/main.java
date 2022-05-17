import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String Response1;
        int DeleteStudent = 0;
        int DeleteStudent1 = 0;
        int DeleteTeacher = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the school\n" + "Would you like to view a list of students or teachers? (Type S for Students, T for Teachers)");

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        Student zack = new Student("Zack", "Smith", 10);
        Student kate = new Student("Kate", "Johnson", 9);
        Student greg = new Student("Greg", "Tucker", 8);
        Student reed = new Student("Reed", "Turner", 11);
        Student mark = new Student("Mark", "Thompson", 12);
        Student hank = new Student("Hank", "Schrader", 8);
        Student walter = new Student("Walter", "Pinkman", 9);
        Student luis = new Student("Luis", "Hemsworth", 11);
        Student lucius = new Student("Lucius", "Greenwood", 10);
        Student marie = new Student("Marie", "Lothric", 12);
        Teacher jenny = new Teacher("Jenny", "Rodriguez", "Science");
        Teacher gabe = new Teacher("Gabe", "Newman", "Mathematics");
        Teacher hellen = new Teacher("Hellen", "Croft", "English");
        students.add(zack);
        students.add(kate);
        students.add(greg);
        students.add(reed);
        students.add(mark);
        students.add(hank);
        students.add(walter);
        students.add(luis);
        students.add(lucius);
        students.add(marie);
        teachers.add(jenny);
        teachers.add(gabe);
        teachers.add(hellen);
        Response1 = scan.nextLine();






        //STUDENTS//
        if (Response1.equals("S")) {
            System.out.println("STUDENTS");
            for (int i = 0; i < students.size(); i++) {
                System.out.print("Name: " + students.get(i).getF_name() + " ");
                System.out.print(students.get(i).getL_name() + ", Grade:");
                System.out.print(students.get(i).getGrade() + " ID:");
                System.out.println(students.get(i).getId());
            }
            System.out.println("\nWould you like to remove a student? (Type student ID)");
            DeleteStudent = scan.nextInt();
            students.remove(DeleteStudent - 1);
            System.out.println("Printing new list...");
            for (int i = 0; i < students.size(); i++) {
                System.out.print("Name: " + students.get(i).getF_name() + " ");
                System.out.print(students.get(i).getL_name() + ", Grade:");
                System.out.print(students.get(i).getGrade() + " ID:");
                System.out.println(students.get(i).getId());
            }
            System.out.println("\nWould you like to remove a second student?");
            DeleteStudent1 = scan.nextInt();
            if (DeleteStudent1 < DeleteStudent){
                students.remove(DeleteStudent1 - 1);
            }
            else {
                students.remove(DeleteStudent1 - 2);
            }
            System.out.println("Printing new list...");
            for (int i = 0; i < students.size(); i++) {
                System.out.print("Name: " + students.get(i).getF_name() + " ");
                System.out.print(students.get(i).getL_name() + ", Grade:");
                System.out.print(students.get(i).getGrade() + " ID:");
                System.out.println(students.get(i).getId());
            }
        }





        //TEACHERS//
        else if (Response1.equals("T")) {
            System.out.println();
            System.out.println("TEACHERS");
            for (int i = 0; i < teachers.size(); i++) {
                System.out.print("Name: " + teachers.get(i).getF_name() + " ");
                System.out.print(teachers.get(i).getL_name() + ", subject:");
                System.out.println(teachers.get(i).getSubject());
            }
            System.out.println("\nWould you like to remove a Teacher? " + "(Type teacher number (1-3)");
            DeleteTeacher = scan.nextInt();
            teachers.remove(DeleteTeacher - 1);
            System.out.println("Teacher number " + DeleteTeacher + " has been removed..\nHere is the new list.\n");
            for (int i = 0; i < teachers.size(); i++) {
                System.out.print("Name: " + teachers.get(i).getF_name() + " ");
                System.out.print(teachers.get(i).getL_name() + ", subject:");
                System.out.println(teachers.get(i).getSubject());
            }
        }
    }
}










