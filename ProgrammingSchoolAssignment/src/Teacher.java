public class Teacher {
    private String f_name;
    private String l_name;
    private String subject;
    static int teacher_number = 1;
    private int t_id;


    Teacher(){
        f_name = "";
        l_name = "";
        subject = "";
        t_id = teacher_number;
        teacher_number++;
    }
    Teacher(String f_name, String l_name, String subject){
        this.f_name = f_name;
        this.l_name = l_name;
        this.subject = subject;
        this.t_id = teacher_number;
        teacher_number++;
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
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getT_id() {
        return t_id;
    }
    public void setT_id(int t_id) {
        this.t_id = t_id;
    }


}
