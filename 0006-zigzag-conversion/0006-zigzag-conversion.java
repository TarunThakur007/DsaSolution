class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<List<Character>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ans.add(new ArrayList<>());
        }

        int row = 0;
        int direction = 1; // 1 = down, -1 = up

        for (int i = 0; i < s.length(); i++) {
            ans.get(row).add(s.charAt(i));

            if (row == 0) {
                direction = 1;
            } else if (row == numRows - 1) {
                direction = -1;
            }

            row += direction;
        }

        StringBuilder result = new StringBuilder();

        for (List<Character> list : ans) {
            for (char c : list) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
