class student{
int rollno;
String name;
int marks;
void study(){
System.out.println("Studying");

}
void practice(){
    System.out.println("Practicing");
}
    }
    public class oopExample {
    public static void main(String[] args) {
        student s1= new student();
        s1.rollno=7;
        s1.name="Jashwanth";
        s1.marks=100;
        
        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        s1.study();
        s1.practice();
    }
}

