package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("child.hello");
    }

    public void call(){
        System.out.println("this.value = " + this.value);
        System.out.printf("super.value = " + super.value); // super은 부모를 뜻함.
    }
}
