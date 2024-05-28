package day5.inheritance01;

public class Child1 extends Parent{

    public static void main(String[] args) {

        System.out.println(Parent.name);
        System.out.println("name = " + name);

        Parent.method1();
        method1();

        Parent p = new Parent();
        System.out.println(p.yas);

        Child1 child = new Child1();
        System.out.println(child.yas);

        p.method3();
        child.method3();

        p.method4();
        child.method4();





    }

    @Override
    public void method4() {
        System.out.println("Child1 class non-static method 4 ");
    }
}
