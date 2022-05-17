import java.util.ArrayList;

public class Student {


    private String f_name;
    private String l_name;
    private int grade;
    static int student_number = 1;
    private int id;

    Student(){
        f_name = "";
        l_name = "";
        grade = 10;
        id = student_number;
        student_number++;
    }




    Student(String f_name, String l_name, int grade){
        this.f_name = f_name;
        this.l_name = l_name;
        this.grade = grade;
        this.id = student_number;
        student_number++;



    }

    //getters and setters//
    public String getF_name() {
        return f_name;
    }
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }
    public String getL_name() {
        return l_name;
    }
    public void setL_name(String l_name) {
        this.l_name = l_name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
