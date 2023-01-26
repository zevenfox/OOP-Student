import java.util.LinkedList;

public class StudentRecordManagement {
    private LinkedList<Student> studentList;

    public StudentRecordManagement() {
        studentList = new LinkedList<Student>();
    }

    public void add(Student record) {
        studentList.add(record);
    }

    public boolean find(int idNumber) {
        for (Student student : studentList) {
            if (student.getIdNumber() == idNumber) {
                return true;
            }
        }
        return false;
    }

    public void delete(int idNumber) {
        for (Student student : studentList) {
            if (student.getIdNumber() == idNumber) {
                studentList.remove(student);
                break;
            }
        }
    }

    public Student findRecord(int idNumber) {
        for (Student student : studentList) {
            if (student.getIdNumber() == idNumber) {
                return student;
            }
        }
        return null;
    }

    public void display() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
