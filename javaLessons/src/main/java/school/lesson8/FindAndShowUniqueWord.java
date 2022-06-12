package school.lesson8;

import java.util.*;

public class FindAndShowUniqueWord {

    public void findAndShow(ArrayList<String> list){
        Set<String> unique = new LinkedHashSet<>();

        for(String str : list){
            String word = str.toLowerCase();
            unique.add(word);
        }

        System.out.println("Unique words is " + unique.size());
        System.out.println(unique.toString());
    }

}
