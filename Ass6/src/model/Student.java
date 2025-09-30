package  model;

public class Student {
    private int studentID;
    private String studentName;
    private String gender;

    public Student(int id, String name, String gender) {
        this.studentID = id;
        this.studentName = name;
        this.gender = gender;
    }

    public int getStudentID() { return studentID; }
    public String getStudentName() { return studentName; }
    public String getGender() { return gender; }

    public void setStudentID(int id) { this.studentID = id; }
    public void setStudentName(String name) { this.studentName = name; }
    public void setGender(String gender) { this.gender = gender; }
}
