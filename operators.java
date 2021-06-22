public class operators {
    public static void main(String args[]){
        int a=10;
        int b=23;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);
        if(a>b){
            System.out.println("a is greater");
        }
        else if (a<b){
            System.out.println("b is greater");
        }
        if(a>=b){
            System.out.println("a is greater ");
        }
        else if (a<=b){
            System.out.println("b is greater");
        }
        if(a==b){
            System.out.println("a and b are equal");
        }
        else if(a!=b){
            System.out.println("a and b are not equal");
        }

         boolean ref=(a%2==0)?true:false;
         if(ref==true){
  System.out.println("a is even number");
         }
        
    }
    
}
