public class CheckAnagrams {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        int firstString = str1.length();
        int secondString = str2.length();

        if (firstString == secondString) {

            char[] arr = str2.toCharArray();

            boolean isAnagram = true;

            for(int i = 0; i < str1.length(); i++){

            	char ch1 = str1.charAt(i);

            	boolean found = false;

            	for(int j = 0; j < arr.length; j++){

            		if(ch1 == arr[j]){

            			arr[j] = '\0'; // mark it as used so we don’t count it again. -- '\0' is the null character in Java — it’s a placeholder indicating “this character has been used”.
            			found = true;
            			break;
            		}
            	}

            	if(!found){
            		isAnagram = false;
            		break;
            	}
            }

            if(isAnagram){
            	System.out.println("Both string are anagrams");
            }else{
            	System.out.println("Both strings are not anagrams");
            }
        } else {
            System.out.println("Both strings are not anagrams");
        }
    }
}
