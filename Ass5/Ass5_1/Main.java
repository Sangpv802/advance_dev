package advance_dev.Ass5.Ass5_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm sinh viên theo MSSV");
            System.out.println("5. Hiển thị danh sách sinh viên");
            System.out.println("6. Sắp xếp theo họ tên");
            System.out.println("7. Sắp xếp theo điểm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống

            switch (choice) {
                case 1:
                    System.out.print("Nhập MSSV: ");
                    String mssv = sc.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhập điểm: ");
                    double diem = sc.nextDouble();
                    manager.addStudent(new Student(mssv, hoTen, diem));
                    break;

                case 2:
                    System.out.print("Nhập MSSV cần sửa: ");
                    String mssvUpdate = sc.nextLine();
                    System.out.print("Nhập họ tên mới: ");
                    String hoTenUpdate = sc.nextLine();
                    System.out.print("Nhập điểm mới: ");
                    double diemUpdate = sc.nextDouble();
                    if (!manager.updateStudent(mssvUpdate, hoTenUpdate, diemUpdate)) {
                        System.out.println("Không tìm thấy sinh viên!");
                    }
                    break;

                case 3:
                    System.out.print("Nhập MSSV cần xóa: ");
                    String mssvDel = sc.nextLine();
                    if (!manager.deleteStudent(mssvDel)) {
                        System.out.println("Không tìm thấy sinh viên!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập MSSV cần tìm: ");
                    String mssvFind = sc.nextLine();
                    Student s = manager.findStudent(mssvFind);
                    if (s != null) {
                        System.out.println(s);
                    } else {
                        System.out.println("Không tìm thấy sinh viên!");
                    }
                    break;

                case 5:
                    manager.displayStudents();
                    break;

                case 6:
                    manager.sortByName();
                    System.out.println("Đã sắp xếp theo họ tên.");
                    break;

                case 7:
                    manager.sortByScore();
                    System.out.println("Đã sắp xếp theo điểm.");
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
