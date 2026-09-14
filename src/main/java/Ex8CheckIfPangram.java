public class Ex8CheckIfPangram {
    // A pangram is a sentence where every letter of the English alphabet appears at least once.
    // Example String "thequickbrownfoxjumpsoverthelazydog" - it contains all alphabets
    public static void main(String[] args) {
        String sentence = "thequickbroaydog";
        System.out.println("Is Pangram: " + checkIfPangram(sentence));
    }

    private static boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        boolean[] check = new boolean[26];
        int count = 0;
        for(int i = 0; i < sentence.length(); i++) {
            int index = sentence.charAt(i) - 'a';
            if(!check[index]) {
                count++;
                check[index] = true;
                if(count == 26) return true;
            }
        }
        return false;
    }
}
