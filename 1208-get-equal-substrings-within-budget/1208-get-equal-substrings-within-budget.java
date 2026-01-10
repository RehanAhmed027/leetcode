class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int cost = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add cost of current character
            cost += Math.abs(s.charAt(right) - t.charAt(right));

            // Shrink window if cost exceeds budget
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    
    }
}