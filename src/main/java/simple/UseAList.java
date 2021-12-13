package simple;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseAList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        // names= Collections.checkedList(names, String.class);
        names.add("Shittu");
        names.add("Verma");

        //breakAList(names);
        String name = names.get(0);
        System.out.println(name);
        boolean b = true;
        //Serializable & Comparable obj = b?"Hello": 99;
        var obj = b?"Hello": 99;

        //obj.compareTo() available now
    }

    //Old code, will break at runtime.
    //javac -d . -Xlint:all UseAList.java
    private static void breakAList(List names) {
        names.add(0, LocalDate.now());
    }
}
