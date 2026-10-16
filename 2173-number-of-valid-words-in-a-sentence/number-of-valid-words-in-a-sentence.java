class Solution {
    public int countValidWords(String sentence) {
         String[] words = sentence.trim().split("\\s+");
        int count = 0;

        for (String word : words) {
            boolean valid = true;
            int hyphen = 0;
            int punct = 0;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (Character.isDigit(ch)) {
                    valid = false;
                    break;
                }

                if (ch == '-') {
                    hyphen++;

                    if (hyphen > 1 || i == 0 ||
                        i == word.length() - 1 ||
                        !Character.isLowerCase(word.charAt(i - 1)) ||
                        !Character.isLowerCase(word.charAt(i + 1))) {
                        valid = false;
                        break;
                    }
                }

                if (ch == '!' || ch == '.' || ch == ',') {
                    punct++;

                    if (punct > 1 || i != word.length() - 1) {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}