public class CheckDigitInString {

	public static void main(String[] args) {
		String str = "a1b2c3";

		boolean status = false;

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			if(ch >= '0' && ch <= '9'){
				status = true;
				break;
			}
		}

		if(status){
			System.out.println("Yes, the string contains digits");
		}else{
			System.out.println("No, the string does not contain any digits");
		}
	}
}