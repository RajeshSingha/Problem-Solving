package String;

import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
//        countMatches();
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> list : items) {
            if(ruleKey.equals("type") && ruleValue.equals(list.get(0))) count++;
            else if(ruleKey.equals("color") && ruleValue.equals(list.get(1))) count++;
            else if(ruleKey.equals("name") && ruleValue.equals(list.get(2))) count++;
        }
        return count;
    }
}
