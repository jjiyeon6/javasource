package reference_pro;

public class Exercise6_20 {
	
	static int[] shuffle(int[] input) {
		
		int[] output = new int[input.length];
		
		for(int i=0; i<input.length; i++) {
			output[i] = input[i];
		}

		int ran = 0;
		int temp =0;
		for(int i=0; i<input.length; i++) {
			ran = (int)(Math.random() * input.length);
//			System.out.println(ran);
			temp = output[ran];
			output[ran] = output[0];
			output[0] = temp;
		}	
		
		return output;
	}
	
/*
	static int[] shuffle(int[] arr){
	      int count = arr.length-1;
	      int[] result = new int[count+1];
	      for(int i=count; i>=0; i--){
	         int randomNum = (int)(Math.random()*i+0.5);
	         result[count-i] = arr[randomNum];
	         arr[randomNum] = arr[i];
	      }
	      return result;
	}
*/
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}

}
