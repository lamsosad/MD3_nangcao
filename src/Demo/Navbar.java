package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Navbar {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        Students[] student = new Students[100];
        student[0] = new Students(1, "Lam", 20);
        student[1] = new Students(2, "Tuan", 11);
        student[2] = new Students(3, "Minh", 33);
        int size = 3;
        while (choice != 0) {
            System.out.println("***************STUDENT MANAGE***************");
            System.out.print("1. Hiển thị sinh viên  \t");
            System.out.print("2. Thêm mới sinh viên \t");
            System.out.print("3. Sửa sinh viên \t");
            System.out.print("4. Xóa sinh viên  \t");
            System.out.print("5. Sắp xếp tuổi (Tăng Dần) \t");
            System.out.println("0. Exit \n");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < size; i++) {
                        System.out.println(student[i]);
                    }
                    break;
                case 2:

                    System.out.println("Nhập tên mới: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int age = input.nextInt();
                    student[size] = new Students(size + 1, name, age);
                    size++;
                    break;
                case 3:
                    System.out.println("Nhập id-1 sinh viên muốn sửa: ");
                    int idUpdate = input.nextInt();
                    System.out.print("Tên ban đầu: " + student[idUpdate].getStudentName() + "\n Nhập tên mới: ");
                    input.nextLine();
                    String nameUpdate = input.nextLine();
                    student[idUpdate].setStudentName(nameUpdate);
                    System.out.print("tuổi ban đầu: " + student[idUpdate].getAge() + "\n Nhập tuổi: ");
                    int ageUpdate = input.nextInt();
                    student[idUpdate].setAge(ageUpdate);
                    break;
                case 4:
                    Students[] newStudent = new Students[size - 1];
                    System.out.println("Nhập id muốn xóa: ");
                    int idDel = input.nextInt();
                    for (int i = 0; i < idDel; i++) {
                        newStudent[i] = student[i];
                    }
                    for (int i = idDel + 1; i < size; i++) {
                        newStudent[i - 1] = student[i];
                    }
                    for (int i = 0; i < newStudent.length; i++) {
                        System.out.println(newStudent[i]);
                    }
                    break;
                case 5:
                    Students temp;
                    for (int i = 0; i < size; i++) {
                        for (int j = i + 1; j < size; j++) {
                            if (student[i].getAge() > student[j].getAge()) {
                                temp = student[j];
                                student[j] = student[i];
                                student[i] = temp;
                            }

                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
