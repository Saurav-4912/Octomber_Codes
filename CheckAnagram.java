public class CheckAnagram{

	public static void main(String[] args) {

		String str1 = "listen";

		int n = str1.length();

		String str2 = "silent";

		int m = str2.length();

		if(n == m){

			char[] arr = str2.toCharArray();

			boolean isAnagram = true;

			for(int i = 0; i < n; i++){

				char ch = str1.charAt(i);

				boolean found = false;

				for(int j = 0; j < arr.length; j++){

					if(ch == arr[j]){

						arr[j] = '\0';
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
				System.out.println("Both string are anagram");
			}else{
				System.out.println("Both string are not anagram");
			}
		}else{
			System.out.println("Both string are not anagram");
		}
		
	}
}