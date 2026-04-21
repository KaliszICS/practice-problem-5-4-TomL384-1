
class Notes {
	public static void main(String args[]) {

		int a;
		int b;
		a = 5;
		b = 4;

		//swapping non-arrays

		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);

		//Swapping within an array

		int[] arr = {1, 3, 5};

		//Swap the first and last value of the array

		temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		//using split

		//var.split(String delimiter) -> String[] with each element being seperated by the delimiter

		//delimiter is a string that we are searching to use as a way to break up our string into elements for an array.
		//the delimiter will be removed from the result.

		String word;
		word = "Hello World";

		String[] arr = word.split("ll"); //split by each word (removes the spaces)


		//prints out all of our elements on seperate lines
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		arr = word.split(""); //splits each letter into its own element

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}