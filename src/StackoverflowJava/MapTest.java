package StackoverflowJava;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(1, "as");


        System.out.println(map.keySet().getClass());

//        Set<Map.Entry<Integer, String>> entries1 = map.entrySet();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("keys:" + entry.getKey() + "values:" + entry.getValue());
        }

        for (Integer key : map.keySet()) {
            System.out.println("key = " + map.get(key));
        }

        for (String value : map.values()) {
            System.out.println("value = " + value);
        }

        Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key + "value = " + value);
        }

        map.forEach((k, v) -> System.out.println("keys:" + k + "value: " + v));


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }


        List<Integer> test = List.of(1, 2, 3, 4, 5);
        test.forEach((i) -> System.out.println(i));


        Map<String, Integer> map2 = new TreeMap<String, Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
//          map2.put(new Person("刘馨杨",18),1);
////        map2.put(new Person("刘馨杨",18),2);
////        map2.put(new Person("刘洋",16),3);
////        map2.put(new Person("刘杨",13),4);

        map2.put("刘馨杨", 1);
        map2.put("刘德华", 3);
        map2.put("张国荣", 2);
        map2.put("周润发", 5);
        map2.put("周杰伦", 4);


        map2.forEach((p, v) -> System.out.println("Person:" + p + "编号" + v));
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getKey());
        }

//        Collections.sort((List)(map2.entrySet()), new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });


        Map<Person, Integer> map3 = new TreeMap<Person, Integer>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });


        map3.put(new Person("刘馨杨", 18), 1);
        map3.put(new Person("刘馨杨", 18), 2);//key重复，覆盖第一次的
        map3.put(new Person("刘洋", 16), 3);
        map3.put(new Person("刘杨", 19), 4);

        map3.forEach((p, v) -> {
            System.out.println("Person" + p + "编号为" + v);
        });

        Map<Person, Integer> map4 = new HashMap<Person, Integer>();

        map4.put(new Person("lxy", 18), 1);
        map4.put(new Person("lxy", 18), 2);//key重复，覆盖第一次的
        map4.put(new Person("ljj", 16), 3);
        map4.put(new Person("zjy", 19), 4);

        //先把map中的键值对转换成List中，这样就可以使用Collection.sort()方法。
        List<Map.Entry<Person, Integer>> list = new ArrayList<>(map4.entrySet());

        System.out.println(list);

        Collections.sort(list, (Map.Entry<Person, Integer> o1, Map.Entry<Person, Integer> o2) -> {
            return o1.getKey().getAge() - o2.getKey().getAge();
        });
        System.out.println(list);

        HashMap<Character, Integer> hashMap = new HashMap<>();
        String sss = "abcd";
        for (char ch : sss.toCharArray())
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);

        hashMap.put('a', hashMap.getOrDefault('a', 0) - 1);
        System.out.println(hashMap);

        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Character> characters = Arrays.asList('a', 'b', 'c');
        List<int[]> ints = Arrays.asList(new int[]{1, 2, 3});
        List<Integer> integers1 = Arrays.asList(new Integer[]{1, 2, 3});
        List<Character> characters1 = Arrays.asList(new Character[]{'b', 'v'});
        List<String> strings = Arrays.asList("a", "b", "c");
        String s = "asdqw";
        int[] res = new int[2];
        List<String> list3 = new ArrayList<>();
        list3.add("1");
        list3.add("2");
//        Iterator<String> iterator = list3.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if (item.equals("2")) {
//                iterator.remove();
//            }
//        }
        Iterator<String> iterator = list3.iterator();
        while(iterator.hasNext()){
            String item =  iterator.next();
            if(item.equals("2"))  {
                iterator.remove();
            }
        }
        System.out.println(list3);

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
//        Collections.sort(names,(String a, String b) -> b.compareTo(a));
//        Collections.sort(names,(a, b)-> b.compareTo(a));
        System.out.println(names);

        int[] arr1 = {1,2,3};
        int[] arr2 = {2, 3, 4, 5};
        int[] temp = arr2;
        arr2=arr1;
        arr1=temp;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        List<Integer> list2 = new LinkedList<>();
        list2.add(-129);
        list2.add(-129);


    }
}
