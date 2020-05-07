class Factorial
{
    public static double M_E = 2.71828182845904523536; 
    public static double M_PI = 3.141592654;
    public int digitsInFactorial(int n)
    {
        //Your code here
         if (n < 0) 
            return 0; 

        if (n <= 1) 
            return 1; 
        double x = (n * Math.log10(n / M_E) + 
                    Math.log10(2 * M_PI * n) /  
                    2.0); 
  
        return (int)Math.floor(x) + 1; 
    }

}
