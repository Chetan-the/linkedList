import java.util.*;
public class longestpalindrome {
    //given an array fo strings of words we have to find the longest  string of words
    public int longest(String[]words){
        int count=0;
        boolean hasmiddle=false;
        HashMap<String,Integer> mp=new HashMap<String,Integer>();
        for(String word:words){
            mp.put(word,mp.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer> it: mp.entrySet()){
            String word=it.getKey();
            int value=it.getValue();
            String reversed=new StringBuilder(word).reverse().toString();
            if(!word.equals(reversed) && mp.containsKey(reversed)){
                int pairs=Math.min(it.getValue(),mp.get(reversed));
                count+=pairs*4;
                mp.put(word,mp.get(word)-pairs);
                mp.put(reversed,mp.get(reversed)-pairs);
            }
        }
        for(Map.Entry<String,Integer> it:mp.entrySet()){
            String word=it.getKey();
            int value=it.getValue();

            if(word.charAt(0)==word.charAt(1)){
                int pairs=value/2;
                count+=pairs*4;

                if(value%2==1){
                    hasmiddle=true;
                }
            }
           

        }
         if(hasmiddle){
                count+=2;
            }

        return count;
    }
    
}
