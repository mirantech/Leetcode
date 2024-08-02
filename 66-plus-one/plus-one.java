import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        // Convert the array of digits to a string
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }

        // Convert the string to a BigInteger and increment by one
        BigInteger val = new BigInteger(sb.toString());
        val = val.add(BigInteger.ONE);

        // Convert the result back to a string to easily split into digits
        String str = val.toString();
        int[] arr = new int[str.length()];

        // Fill the array with the new digits
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        return arr;
    }
}