package constructoroverloading25;

public class Student5 {
    //Java program to overload constructors
    int id;
    String name;
    int age;
    //creating two arg constructor
    public Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //creating three arg constructor
    public Student5(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println(this.id + " " +   this.name + " " + this.age );
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karan");
        Student5 s2 = new Student5(222, "Aryan",  25);
        s1.display();
        s2.display();
    }
}


