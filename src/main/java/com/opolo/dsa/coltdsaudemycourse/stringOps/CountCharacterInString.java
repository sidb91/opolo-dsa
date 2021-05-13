package com.opolo.dsa.coltdsaudemycourse.stringOps;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CountCharacterInString {

    public static void countCharsInStr(String str) {

        Map<Character, Integer> countMap = new HashMap<>();

        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            if(isAlphanumeric(ch)){
                if(countMap.containsKey(ch)){
                    int prevValue = countMap.get(ch);
                    countMap.put(ch, ++prevValue);
                }else{
                    countMap.put(ch, 1);
                }
            }
        }

        countMap.forEach((k,v) -> {
            System.out.println(String.format("%s occurs %s times",k,v));
        });

    }

    static boolean isAlphanumeric(char ch){

        if(!(ch>47 && ch<58) && //numeric ASCII range
            !(ch>64 && ch<91) && //upper case alphabets
            !(ch>96 && ch<123)){ //lower case alphabets
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "jimmy eat world";
        countCharsInStr(str);
    }
}
