
public class NumberString {

	public static void main(String[] args) {
		String name="1234567890";
		char ch[]=name.toCharArray();
	int i=0;
	int count=0;
	while(i<ch.length){
		if(ch[i]>=48&&ch[i]<=57){
			count++;
		}
		i++;
	}
	System.out.println(count);

	}

}
