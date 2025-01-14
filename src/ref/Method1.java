package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student(); // 주소값이 복사돼서 들어가면 그 복사된 주소값을 전달해주는거임.
        initStudent(student1,"학생1" , 15,90);
        Student student2 = new Student();
        initStudent(student2,"학생2" , 18,85);

        printStudent(student1);
        printStudent(student2);

//        System.out.println("이를: " + student1.name + " 나이 :" + student1.age + " 성적: " + student1.grade);
//        System.out.println("이를: " + student2.name + " 나이 :" + student2.age + " 성적: " + student2.grade);
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
