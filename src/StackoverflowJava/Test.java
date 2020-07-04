package StackoverflowJava;

public class Test {
    static Test one = new Test();
    static {
        System.out.println("Test静态块");
    }

    {
        System.out.println("Test普通块");
    }
    public Test(){
        System.out.println("Test构造方法");
    }

    public static void main(String[] args) {
        new Test();
    }
}
