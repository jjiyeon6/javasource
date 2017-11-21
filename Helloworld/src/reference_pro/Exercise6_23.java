package reference_pro;

public class Exercise6_23 {

	static int max(int[] arr) {
		
		if(arr==null || arr.length==0) {
			return -999999;
		}
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
//				System.out.println(i);
			}
		}	
		return max;
	}
	
	public static int min(int[] arr) {
		
		if(arr==null || arr.length==0) {
			return -999999;
		}
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
//				System.out.println(i);
			}
		}	
		return min;
	}

	public static int[] maxArray(int[] data) {
		int max = data[0];
		int temp =data[0];
		for(int i=0; i<data.length; i++) {
			if (data[i]>max) {
				max = data[i];
//				System.out.println(i);
//				System.out.println(max);
				temp = max;
				data[i] = data[0];
				data[0] = temp;
			}
		}
		return data;
	}
	
	public static int[] selectSort(int[] data) {
		int max = data[0];
		int temp =data[0];
		int count = data.length-1;
		for(int i=0; i<data.length; i++) {
			for(int j=count; j>=0; j--){
				if (data[i]>max) {
					max = data[i];
//					System.out.println(i);
					temp = max;
					data[i] = data[0];
					data[0] = temp;
					System.out.println(data[j]);
				}
			} 
		}
		return data;
	}
	
   public static int[] _selectSort(int[] arr) {
	      int temp = 0;
	      for(int i = 0; i < arr.length; i++) {
	         if(i == arr.length - 1) {
	            return arr;
	         }
	         for(int j = i + 1; j < arr.length; j++) {
	            if(arr[i] > arr[j]) {
	               temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	      return arr;
	   }
	   
	public static void main(String[] args) {

		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
//		System.out.println("최대값:"+max(null));
//		System.out.println("최대값:"+max(new int[] {}));
		
		System.out.println("최소값:"+min(data));
		
//		System.out.println(java.util.Arrays.toString(maxArray(data)));
		
		System.out.println(java.util.Arrays.toString(selectSort(data)));
		
//		System.out.println(java.util.Arrays.toString(_selectSort(arr)));
		
	}

}
