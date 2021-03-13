package interviewQuestions;

public class StaticKeyWord_8 {
    public static String address;
    public String name;
    public int age;

    public static void main(String[] args) {
        StaticKeyWord_8 john = new StaticKeyWord_8();
        john.name = "John";
        john.age = 35;
        john.address = "101 Main St";

        System.out.println(john.name);
        System.out.println(john.age);
        System.out.println(john.address);


        StaticKeyWord_8 smith = new StaticKeyWord_8();
        System.out.println(smith.name);
        System.out.println(smith.age);
        System.out.println(smith.address);
    }
}