class Solution {
        public String reversePrefix(String word, char ch) {
                int i = word.indexOf(ch);
                 if (i == -1)
                    return word;
            String a = new StringBuilder(word.substring(0, i + 1)).reverse().toString();
            return a + word.substring(i + 1);}
}