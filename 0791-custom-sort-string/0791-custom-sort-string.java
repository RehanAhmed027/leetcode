class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];

        // Count frequency of characters in s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();

        // Add characters in the order specified
        for (char c : order.toCharArray()) {
            while (freq[c - 'a']-- > 0) {
                result.append(c);
            }
        }

        // Add remaining characters not in order
        for (int i = 0; i < 26; i++) {
            while (freq[i]-- > 0) {
                result.append((char) (i + 'a'));
            }
        }

        return result.toString();
    }
    }
