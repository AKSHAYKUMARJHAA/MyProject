package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 22, 34, 55, 41, 10, 9);    //creating list in two ways

        List<Integer> list1=new ArrayList<>();
        list1.add(12);
        list1.add(10);
        list1.add(29);
        list1.add(76);
        System.out.println(list1);
        System.out.println(list);

        List<Integer> listEven=new ArrayList<>();
        for (Integer i : list){
            if(i % 2==0)
            {
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        //using stream

        List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1 = list.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newList1);


        List<String> names=List.of("Akshay","Puja","Ayush","Arya");
        List<String> newName=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newName);

        List<Integer> num = List.of(22, 31, 24, 7, 9, 24, 11);
        List<Integer> newNum = num.stream().map(i -> i * i).collect(Collectors.toList());
        num.stream().map(i->i+i).filter(i -> i>25).forEach(i-> System.out.println(i));
        System.out.println(newNum);

    }
}
