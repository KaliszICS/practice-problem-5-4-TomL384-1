
class Notes {
	public static void main(String args[]) {

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