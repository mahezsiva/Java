import java.util.Iterator;
import java.util.TreeSet;

public class Add {
	 public static int sumOfArray(Integer[] a, int n)
	    {
	        if (n == 0)
	            return a[n];
	        else
	            return a[n] + sumOfArray(a, n - 1);
	    }

	public static void main(String[] args) {
		TreeSet<Integer>ref=new TreeSet<Integer>();
		
		ref.add(10);
		ref.add(20);
		ref.add(40);
		ref.add(70);
	int sum=0;
	for(Integer type:ref){
		sum=sum+type;
	}
	System.out.println("using for loop="+sum);
	
	
	 Iterator<Integer> iterator = ref.iterator();
	  
     
   
     int sum1=0;
     while (iterator.hasNext()){
     sum1=sum1+iterator.next();
   
	}
     System.out.println("using while loop="+sum1);
     Integer a[] = new Integer[ref.size()];
	    ref.toArray(a);		 
	    int sum3 = sumOfArray(a,a.length-1);
	    
	    System.out.println("Recurssion: " + sum3);

}

	
}
