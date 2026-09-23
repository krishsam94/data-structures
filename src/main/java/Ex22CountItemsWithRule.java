public class Ex22CountItemsWithRule {
    // https://leetcode.com/problems/count-items-matching-a-rule/
    public static void main(String[] args) {
      ArrayList<List<String>> items = new ArrayList<>(Arrays.asList(
        Arrays.asList("phone", "blue", "pixel"),
        Arrays.asList("computer", "silver", "lenovo"),
        Arrays.asList("phone", "gold", "iphone")
    ));
      System.out.println(countMatches(items, "color", "silver"));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = 0;
        if (ruleKey.equals("color")) {
            idx = 1;
        } else if (ruleKey.equals("name")) {
            idx = 2;
        }
        int matches = 0;
        for(List<String> curItem: items){
            if(curItem.get(idx).equals(ruleValue)) {
                matches++;
            }
        }
        return matches;
    }
}
