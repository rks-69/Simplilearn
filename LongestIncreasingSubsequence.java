import java.util.Scanner;
public class LongestIncreasingSubsequence 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        LongestIncreasingSubsequence lis=new LongestIncreasingSubsequence();
        System.out.println("The Longest Increasing Subsequence is:" + lis.lengthLIS(arr));
    }
    public int lengthLIS(int[] arr)
    {
        int umax=0;
        int dp[]=new int[arr.length];
        for(int i=0;i<dp.length;i++)
        {
            int max=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i])
                {
                    if(dp[j]>max)
                    max=dp[j];
                }
            }
            dp[i]=max+1;
            if(dp[i]>umax){
                umax=dp[i];
            }
        }
        return umax;
    }
}
