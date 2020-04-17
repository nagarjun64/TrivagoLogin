package pageobjects.Listen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckAbstract {

	public void findDuplicateChars(String str){
        
        Map<Character, Integer> dupMap = new HashMap<>();
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
            	int v = dupMap.get(ch);
            	System.out.println(ch + "=="+ v );
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }
     
    public static void main(String a[]){
    	CheckAbstract dcs = new CheckAbstract();
        dcs.findDuplicateChars("Enumerationenar");
    }

}
