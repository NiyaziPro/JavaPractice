package day5.inheritance01;

public class Runner {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.method3();
        parent.method4();

        System.out.println("--------------------------------------");
        Child1 child1 = new Child1();

        child1.method3();
        child1.method4();

        System.out.println("--------------------------------------");

        Child2 child2 = new Child2();

        child2.method3();
        child2.method4();

        System.out.println("--------------------------------------");

        parent = new Child1();
        parent.method3();
        parent.method4();

        System.out.println("--------------------------------------");

        parent = new Child2();
        parent.method3();
        parent.method4();

        System.out.println("--------------------------------------");
    }
}
