public class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // gives the string representation of the object
    public String toString() {
        return "Student Details " + "Id = " + id + " Name = " + name;
    }

    public static void main(String[] args) {
        int num = 576;
        System.out.println("num = " + num);
        Student s1 = new Student(5, "Shailesh");
        System.out.println("Id : " + s1.id);
        System.out.println("Name : " + s1.name);
        System.out.println(s1);
        // when we print object then this will work as like this s1.toString();
    }
}