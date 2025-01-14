package ref;

public class Method2 {

    public static void main(String[] args) {

        Student student1 = createStudent("학생1",18,90);
        Student student2 = createStudent("학생2",16,88);

        printStudent(student1);
        printStudent(student2);

//        System.out.println("이를: " + student1.name + " 나이 :" + student1.age + " 성적: " + student1.grade);
//        System.out.println("이를: " + student2.name + " 나이 :" + student2.age + " 성적: " + student2.grade);
    }

    static Student createStudent(String name,int age,int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student){
        System.out.println("이를: " + student.name + " 나이 :" + student.age + " 성적: " + student.grade);
    }


}
