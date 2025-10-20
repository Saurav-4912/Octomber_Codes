public class CheckSpecialChar {

	public static void main(String[] args){

		String str = "Hello@World!";

		boolean status = false;

		for(int i = 0; i < str.length(); i++){

			char ch = str.charAt(i);

			if(!( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))){

				status = true;
				break;
			}
		}

		if(status){
			System.out.println("String contain special character");
		}else{
			System.out.println("String does not contain any special character");
		}
	}
}