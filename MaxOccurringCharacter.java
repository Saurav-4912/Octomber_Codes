public class MaxOccurringCharacter {

    public static void main(String[] args) {

        String str = "mississippi";

        boolean[] isCounted = new boolean[str.length()];
        int max = 1;
        char ch = '\0'; // placeholder for max occurring char

        for (int i = 0; i < str.length(); i++) {

            if (isCounted[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) { // start from i+1
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    isCounted[j] = true;
                }
            }

            if (count > max) {
                max = count;
                ch = str.charAt(i); // assign, don't add
            }
        }

        System.out.println(ch + " --> " + max); // prints character and its frequency
    }
}
