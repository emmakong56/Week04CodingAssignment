package Week04CodingAssignment;

public class Week04CodingAssignment {

	public static void main(String[] args) {
		
	//This is the method for question 12
		boolean isHotOutside = true;
	 	double moneyInPocket = 3.50;
	 	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	 	
	 //This is the method for question 13
	 	double price1 = 5.25;
	 	double price2 = 4.25;	
	 	System.out.println(calculateSum(price1, price2));

	//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	
		int [] ages = {3,9,23,64,2,8,28,93};
		
	//a.Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
	 	
	 	int lastMinusFirst = (ages[ages.length-1]- ages[0]);
	 	System.out.println(lastMinusFirst);
	 
	//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		int [] ages2 = {3,9,23,64,2,8,28,93,100};
		int lastMinusFirst2 = (ages2[ages2.length-1]- ages2[0]);
		System.out.println(lastMinusFirst2);

	//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
    	
    	double sum = 0;
    	for(int x : ages){
    		sum += x;    	
    	}
    	System.out.println(sum/ages.length);
    	
	// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
	//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		int sum2 = 0;
		for(String string : names){
			sum2 += string.length();
		}
		System.out.println(sum2/names.length);
	
	//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		String sumOfNames = ""; 
		for(String string : names){
			sumOfNames += string + " ";
		}
		System.out.println(sumOfNames);
		
	//3. How do you access the last element of any array?
	 		
	 	//	array[array.length - 1]
	 	//	System.out.println(array[array.length - 1]);
	 		
	 //4. How do you access the first element of any array?
	 		
	 	//	array[0]
	 	//	System.out.println(array [0]);
	 		
	 // 5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	 	
	 	//String [] names = {“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”};
	 	 
	 	int [] nameLengths = new int [names.length];
	 	for(int i = 0; i < names.length; i++) {
	 	 	nameLengths[i] = names[i].length();
	 	}
	 	for(int x : nameLengths){
	 		System.out.println(x);
	 	}
	 		
	 // 6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	 	
	 	for (int i = 0; i < nameLengths.length; i++) {
            sum += nameLengths[i];
        }
	    System.out.println(sum);
   
	    //This is the method for question7
	    System.out.println(concatenateWord("Paper", 3));
	    //This is the method for question 8
	    System.out.println(createFullName("Emmanuel", "Ndzi"));
	    //This is the method for question 9
	    int [] array = {2,3,5,7};
	    System.out.println(isSumGreaterThan100(array));
	    //This is the method for question 10
	    double [] array1 = {5.7, 6.8, 9.2};
	    System.out.println(calculateAverage(array1));
	    //This is the method for question 11
	    double [] Emmanuel = {3.3,4.3, 5.6};
	    double [] Emmanuel1 = { 2.6, 4.1, 7.8};
	    System.out.println(higherAverage(Emmanuel, Emmanuel1));
	    
}////End of main method	 	
	 // 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 	
	 	public static String concatenateWord(String word, int n){
	 		String result = "";
	 		for(int index = 1; index <= n; index++){
	 			result = result + word;
	 		}
	 		return result;
	 	}
	 	
	 // 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	 	
	 	public static String createFullName(String firstName, String lastName){
	 		return firstName + " " + lastName;
	 	}
	 	
	 // 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	 	
	 	public static boolean isSumGreaterThan100(int [] array) {
			int sum = 0;
			for (int num : array) {
        		sum += num;
        	
			}
			if (sum > 100){
				return true;
			}else{
				return false;
			}
			
		}	
			
	 		 	
	 // 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	 	
	 	public static double calculateAverage(double[] array) {
			double sum = 0;
			double average;
			for (double number : array) {
				sum += number;
			}
			average = sum / array.length;
			return average;
		}
	 	
	 // 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	 	
	 	public static boolean higherAverage(double[] array1, double[] array2) {
	 		double sum1 = 0;
    		double sum2 = 0;
    		for (double num : array1) {
        		sum1 += num;
    		}
    		for (double num : array2) {
        		sum2 += num;
    		}
    		double average1 = sum1 / array1.length;
    		double average2 = sum2 / array2.length;
    		if( average1 > average2){
				return true;
			}else {
				return false;
			}
		}
	 		
	 // 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	 	
	 	
	 	
	 	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
	 		if(isHotOutside == true && moneyInPocket > 10.50){
	 			return true;
	 		}else{
	 			return false;
	 		}
	 	}
	 	
	 // 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	 	
	 		
	 	public static double calculateSum(double price1, double price2){
	 		return price1 + price2;
	 	}
	 	
	 	//This method returns the sum of prices for two grocery items. The total or minimum amount to by two grocery items listed as price1 and price2 	  
	  
	 
	
	
} // End of class

		
		

		
