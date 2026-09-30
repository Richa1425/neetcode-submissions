class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();

        HashMap<Character, Integer> hash = new HashMap<>();

        int l = 0;
        int r = 0;
        int maxLen = 0;

        while (r < n) {

            if (hash.containsKey(s.charAt(r))) {

                if (hash.get(s.charAt(r)) >= l) {
                    l = hash.get(s.charAt(r)) + 1;
                }
            }

            int len = r - l + 1;
            maxLen = Math.max(len, maxLen);

            hash.put(s.charAt(r), r);

            r++;
        }

        return maxLen;
    }
}
