import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {

    public static void main (String[] args){
        DynamicArray ad = new DynamicArray();
        List<Integer> list = ad.getList();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        int a = list.get(2);
        System.out.println(a);
        list.clear();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(5);//addToEnd
        list.remove(list.size()-1);//removeFromEnd
        System.out.println(list);
    }
}
