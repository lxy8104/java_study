package StackoverflowJava;


import java.sql.SQLOutput;
import java.util.*;

class Student2{
    private int age;
    private String name;
    public Student2(){}
}

public class ContainsTest {
    public static void main(String[] args) {
        ArrayList<Student2> test = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            test.add(new Student2());
        }
        System.out.println('2'-'1');
        Student2 student2 = test.get(0);
        System.out.println(student2);

        String s = "1.00.1";
        String[] split1 = s.split("\\.");
        System.out.println(split1);

        String[] split = s.split(" ");
        List<String> strings = Arrays.asList(split);
        System.out.println(strings);
        Collections.reverse(strings);
        String res = String.join(" ", strings);
        System.out.println(res);


        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.poll());
        //System.out.println(queue.element());
        System.out.println(queue.peek());
        List<List<Integer>> list = new LinkedList<>();

        List<Integer> l1 = new LinkedList<>(){{
            add(1);
            add(0);
            add(1);
            add(0);
        }};
        List<Integer> l2 = new LinkedList<>(){{
            add(1);
            add(0);
            add(1);
            add(0);
        }};

        System.out.println(l2.get(1));

        System.out.println("------");
        List<Integer> l3 = new LinkedList<>();
        List<Integer> l4 = new LinkedList<>();
        Object a =null;
        Object b =null;
        if (a == null || b == null) {
            System.out.println(1);
        }
        if(a == null && b == null){
            System.out.println(0);
        }

        list.add(l1);
        list.add(l2);


        Collections.reverse(l1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l2.equals(l1));


        Collections.reverse(list);
        System.out.println(list);

        String[] as = new String[]{"a","a"};
        String s3 = "dsbjf";
        char[] chars1 = s3.toCharArray();
        List<char[]> chars = Arrays.asList(chars1);
        int[] vv = new int[]{1,2,3,4};

        List<String> list3 = new ArrayList<String>();
        list3.add("jay");
        list3.add("tianluo");
        String[] strings1 = list3.toArray(new String[list3.size()]);
        System.out.println(strings1[0]);


    }
}
