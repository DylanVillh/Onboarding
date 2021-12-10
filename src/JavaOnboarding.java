import java.math.BigInteger;

public class JavaOnboarding {

	public static long lcmOfArray(int[] arr)
    {
        long lcmOfArray = 1;
        int divisor = 2;
         
        while (true) {
            int counter = 0;
            boolean divisible = false;
             
            for (int i = 0; i < arr.length; i++) {
 
                if (arr[i] == 0) {
                    return 0;
                }
                else if (arr[i] < 0) {
                    arr[i] = arr[i] * (-1);
                }
                if (arr[i] == 1) {
                    counter++;
                }
                if (arr[i] % divisor == 0) {
                    divisible = true;
                    arr[i] = arr[i] / divisor;
                }
            }
            if (divisible) {
                lcmOfArray = lcmOfArray * divisor;
            }
            else {
                divisor++;
            }

            if (counter == arr.length) {
                return lcmOfArray;
            }
        }
        
        // I will be honest, I struggled with this one a lot. After looking up ways of finding the LCM of a group of numbers, i had the idea of going through the array and 
    	// dividing by the lowest prime numbers. I couldn't figure out how to do it and eventually started looking things up and found a solution. 
    	// https://www.geeksforgeeks.org/lcm-of-given-array-elements/ solved it in a way i was going for and helped me find a way of iterating through the array multiple 
    	// times while also increasing the prime number you are dividing by. I want to give the website credit for helping me figure out the solution.
    }
	
	public static BigInteger lookAndSay(BigInteger bint) {
		String number = bint.toString();
		String lookAndSayNum = "";
		
		if(number.length()%2==1) {
			BigInteger odd = new BigInteger("-1");
			return odd;
		}
		for(int i = 0; i < number.length()-1; i++) {
			int counter = number.charAt(i) - '0';
			
			for(int x = 0; x < counter; x++) {
				lookAndSayNum = lookAndSayNum + number.charAt(i+1);
			}
			i++;
		}
		BigInteger num = new BigInteger(lookAndSayNum);
		return num;
	}
     
    public static void main(String[] args)
    {
        int[] arr = {5, 4, 6, 46, 54, 12, 13, 17};
        System.out.println(lcmOfArray(arr));
        
        BigInteger bint = new BigInteger("1213200012171979");
        System.out.println(lookAndSay(bint));
    }

}
