package Demo;

public class Students {
    private int studentId;
    private String studentName;
    private int age;

    public Students() {
    }

    public Students(int studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{ " +
                "studentId= " + studentId +
                ", studentName= '" + studentName + '\'' +
                ", age= " + age +
                " },";
    }
}
