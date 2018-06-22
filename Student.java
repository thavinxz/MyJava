import java.util.Scanner;
public class Student {
    private int id, age;
    private String name, phone;
    public static String country="Cambodia", school="KIT";
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Input phone: ");
        phone = sc.nextLine();
        sc.close();
    }
    public void output() {
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
        System.out.println("Country: "+country);
        System.out.println("School: "+school);
    }
    public static void main(String[] args) {
        Student stu = new Student();
        stu.input();
        stu.output();
    }
}
