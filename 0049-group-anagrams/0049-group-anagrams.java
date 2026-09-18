class Solution {
    public String sortedString(String s) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String result = new String(ch);
        return result;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for (String i : strs) {
            String copy = sortedString(i);
            if (m.containsKey(copy)) {
                m.get(copy).add(i);
            } else {
                List<String> arr = new ArrayList<>();
                arr.add(i);
                m.put(copy, new ArrayList<>(arr));
            }
        }
        for (String key : m.keySet()) {
            List<String> current = m.get(key);
            ans.add(current);
        }
        return ans;
    }
}