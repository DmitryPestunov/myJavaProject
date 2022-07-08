package school.lesson8;

import java.util.*;

public class FindAndShowUniqueWord {

    public void findAndShow(ArrayList<String> list){
        Set<String> unique = new LinkedHashSet<>();
        Map<String, Integer> countDuplicates = new HashMap<>();

        for(String str : list){
            String word = str.toLowerCase();
            unique.add(word);
        }

        System.out.println("Unique words is " + unique.size());
        System.out.println(unique.toString());

        for(String uniq : unique){
            String uniqWord = uniq.toLowerCase();
            int count = 0;
            for(String str : list){
                String strWord = str.toLowerCase();
                if(uniqWord.equals(strWord)){
                    count++;
                }
            }
            countDuplicates.put(uniq,count);
        }

        System.out.println(countDuplicates.toString());

    }

}
