class Solution {
    public boolean canConstruct(String r, String m) {
        StringBuilder buff = new StringBuilder(m); // magazine is buff

        for (int i = 0; i < r.length(); i++) {
            char c = r.charAt(i);
            boolean found = false;

            for (int j = 0; j < buff.length(); j++) {
                if (c == buff.charAt(j)) {
                    buff.deleteCharAt(j); // use this character
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Cannot construct ransom note");
                return false;
            }
        }

        System.out.println("Can construct ransom note");
        return true;
    }
}
