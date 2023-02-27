
public class Test {

	public static void main(String[] args) {
		
		
		
		int[] array = {4,7,9,13,4,679,46,98,101,98,4,76,9,13,46};
		
		
		
		for(int i=0; i<array.length; i++) {
		   
		   for(int j=0; j<array.length; j++) {
			   
			   if ((i != j) && (array[i]==array[j])) {
				   
				   if(array[i] % 2 == 0) {
					   System.out.println(array[i]);
					  break;
					      }
					   }
			    }
             }
		}

}
