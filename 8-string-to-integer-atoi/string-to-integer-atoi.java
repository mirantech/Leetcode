class Solution {
    public int myAtoi(String str) {
        // Define constants for the minimum and maximum integer values
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        // Initialize variables
        long ans = 0;
        int sign = 1;
        boolean foundSign = false;
        boolean foundDigit = false;

        // Trim leading and trailing whitespace
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check for sign at the beginning
            if (c == '-' || c == '+') {
                if (foundSign || foundDigit) {
                    break;
                }
                sign = (c == '-') ? -1 : 1;
                foundSign = true;
                continue;
            }

            // If the character is not a digit, break the loop
            if (!Character.isDigit(c)) {
                break;
            }

            // Convert character to digit and add to the result
            ans = ans * 10 + (c - '0');
            foundDigit = true;

            // Handle overflow and underflow
            if (sign == 1 && ans > max) {
                return max;
            }
            if (sign == -1 && -ans < min) {
                return min;
            }
        }

        // Return the result with the appropriate sign
        return (int) ans * sign;
    }
}
