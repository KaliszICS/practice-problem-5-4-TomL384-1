public class PracticeProblem {

	public static void main(String args[]) {
		String s = "abc   bbb  ccc";
		System.out.println(s.split(" "));
	}

	public static void stringSwap(String[] arr, int i1, int i2){
		String swap1 = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = swap1;
	}

	public static void reverse(int[] arr){
		for (int i = 0; i < arr.length/2; i++){
			int swap1 = arr[i];
		    arr[i] = arr[arr.length-1-i];
		    arr[arr.length-1-i] = swap1;
	    }
    }

	public static String[] toWordArray(String s1){
		String[] arr = {};
		if (s1.length() > 0 && !(s1.replaceAll(" ","").equals(""))){
			s1 = s1.trim();
		    s1 = s1.replaceAll("  "," ");
		    s1 = s1.replaceAll("  "," ");
		    s1 = s1.replaceAll("  "," ");
		    return s1.split(" ");
		}
		return arr;

	}

	public static String[] removeChars(String[] arr, String c1){
	    int count = 0;
	    int exclude = 0;
	    for (int i1 = 0; i1 < arr.length; i1++){
	        if (arr[i1] == c1 ){
	            count++;
	        }
	    }
	    String[] arr1 = new String[arr.length - count];
	    for (int i2 = 0; i2 < arr.length; i2++){
	        if (arr[i2] != c1){
	            arr1[exclude] = arr[i2];
	            exclude++;
	        }
	    }
	    return arr1;
	}
}
	


