class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        // Number of characters and words must be equal
        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            for (int j = 0; j < i; j++) {

                // If characters are same, words must be same
                if (pattern.charAt(i) == pattern.charAt(j)) {
                    if (!words[i].equals(words[j])) {
                        return false;
                    }
                }

                // If words are same, characters must be same
                if (words[i].equals(words[j])) {
                    if (pattern.charAt(i) != pattern.charAt(j)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}