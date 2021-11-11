
public class Quiz5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
		
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
		
		for (int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			
			if ('a'<=ch && ch<='z') {
				result += abcCode[(int)(ch - 'a')];
			} else if ('0'<=ch && ch<='9') {
				result += numCode[(int)(ch - '0')];
			}
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}

}
