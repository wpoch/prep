package ch01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C1E01 {
    public static void main(String[] args) {
         test();
    }

    static boolean isUnique(String word) {
        Set<Integer> set = new HashSet<>(word.length(), 1);
        for(int i=0;i < word.length(); i++) {
            set.add((int)word.charAt(i));
        }
        return word.length() == set.size(); 
    }

    static boolean isUnique2(String word) {
        String[] words = word.split("");
        Arrays.sort(words);
        String last = words[0];
        for(int i=1; i < words.length; i++){
            if (last.equals(words[i])) return false;
            last = words[i];
        }
        return true;
    }

    static void test(){
        assert isUnique2("word");
        assert !isUnique2("wordd");
    }
}