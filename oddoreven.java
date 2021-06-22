public class oddoreven {
    public static void main(String[] args) {
        

        int numb=9999;
        while(numb!=0){
        int last=numb%10;
        if(last%2==0){
            System.out.println(last+" "+"number is even");
        }
        else{
            System.out.println(last+" "+"number is odd");
        }
        numb=numb/10;


        }
    }
}
