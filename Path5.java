// Java program to count all possible paths from
// top left to top bottom using combinatorics
class Path5{
 
    static int numberOfPaths(int m, int n)
    {
        // We have to calculate m+n-2 C n-1 here
        // which will be (m+n-2)! / (n-1)! (m-1)!
        int path = 1;
        for (int i = n; i < (m + n - 1); i++) {
            path *= i;
			
			System.out.print("Numerator["+i+"]:"+i+ "        Numerator product:"+path);
			
            path /= (i - n + 1);
			System.out.println("       Denominator["+i+"]:"+(i-n+1));
			System.out.println("Numerator product / Dnominator : "+path);
			System.out.println("-------------------------------------------------------------------------");
        }
        return path;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        System.out.println("Number of paths:"+ numberOfPaths(3, 5));
		
		//System.out.println("Number of paths:"+ numberOfPaths(5, 3));
    }
}
 
// This code is contributed by Andy