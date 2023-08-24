package chinucollections;

import java.util.ArrayList;
import java.util.HashMap;

public class Arraylistt {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(0,30);
        al.add(1,40);

        for(int i=0; i<4; i++){
            System.out.println(al.get(i));
        }

        System.out.println(al.lastIndexOf(20));
        System.out.println(al.indexOf(20));

        Object[] arr = al.toArray();

        HashMap<Integer, Integer>  hm = new HashMap<>();

        hm.put(2,45);
        System.out.println(hm);

    }

}
