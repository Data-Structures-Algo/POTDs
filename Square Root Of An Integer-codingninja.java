/*You are given an integer ‘A’. Your task is to find the greatest non-negative integer whose square is less than or equal to ‘A’.

Square of a number is the product of the number with itself. For e.g. square of 3 is 9.*/
import java.util.* ;
import java.io.*; 
public class Solution
{
public static int squareRoot(int a)
    {   
        if(a==0){
            return 0;
        }
        if(a==1){
            return 1;
        }
        int low=0;
        int high=a;
        int ans=0;
        

        while(low<=high){
            int mid=(high+low)/2;
            long square=(long)mid*mid;
            if(square==a){
                return mid;
            }
            else if(square<a){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
