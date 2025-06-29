public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];  // Maximum possible length

        for (int i = n - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';

            for (int j = m - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';

                int mul = digit1 * digit2;
                int posLow = i + j + 1;
                int posHigh = i + j;

                mul += result[posLow];

                result[posLow] = mul % 10;
                result[posHigh] += mul / 10;
            }
        }

        // Build the final string result
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (sb.length() == 0 && num == 0) continue; // Skip leading zeros
            sb.append(num);
        }

        return sb.toString();
    }

    // Test it
    public static void main(String[] args) {
        Solution sol = new Solution();
        String num1 = "881095803";
        String num2 = "61";
        System.out.println(sol.multiply(num1, num2));  // Output: 53746843983 ✅
    }
}
