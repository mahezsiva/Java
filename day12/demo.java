
import java.util.ArrayList;
import java.util.Iterator;
public class demo {


		   static void front(ArrayList < Integer > ref){

		       int Index = 0;

		       for(int i=1; i<ref.size(); i++){

		          if(ref.get(Index) > ref.get(i))

		               index = i;

		      }

		       int min = ref.get(Index);
		       ref.remove(Index);
		       ref.add(0, min);
		  }

		  public static void main(String[] args) {
		       ArrayList<Integer> ref = new ArrayList<>();
		     ref.add(3); 
		     ref.add(8);
		     ref.add(92);
		      System.out.println(ref);
		      front(ref);
		      System.out.println(ref);

		  }

		}