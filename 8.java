
public class Solution 
{
    public int myAtoi(String str) 
    {
        if(str == null || str.length() == 0)
            return 0;
            
        str.trim();
        int sign = 1;
        int i = 0;
        int length = str.length();
        double result = 0;
        
        if(str.charAt(0) == '-')
        {
            sign = -1;
            i++;
        }
        
        if(str.charAt(0) == '+')
            i++;
            
        while(i < length && str.charAt(i) >= '0' && str.charAt(i) <= '9')
        {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        
        if(sign == -1)
            result = -result;
            
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
    
        return (int) result;
    }
}
