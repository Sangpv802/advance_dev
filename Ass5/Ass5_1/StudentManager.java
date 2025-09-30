package advance_dev.Ass5.Ass5_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    // thêm sinh viên
    public void addStudent(Student s) {
        students.add(s);
    }

    // sửa sinh viên theo MSSV
    public boolean updateStudent(String mssv, String hoTen, double diem) {
        for (Student s : students) {
            if (s.getMssv().equals(mssv)) {
                s.setHoTen(hoTen);
                s.setDiem(diem);
                return true;
            }
        }
        return false;
    }

    // xóa sinh viên theo MSSV
    public boolean deleteStudent(String mssv) {
        return students.removeIf(s -> s.getMssv().equals(mssv));
    }

    // tìm kiếm sinh viên theo MSSV
    public Student findStudent(String mssv) {
        for (Student s : students) {
            if (s.getMssv().equals(mssv)) {
                return s;
            }
        }
        return null;
    }

    // hiển thị danh sách
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // sắp xếp theo họ tên
    public void sortByName() {
        Collections.sort(students, Comparator.comparing(Student::getHoTen));
    }

    // sắp xếp theo điểm
    public void sortByScore() {
        Collections.sort(students, Comparator.comparingDouble(Student::getDiem).reversed());
    }
}
