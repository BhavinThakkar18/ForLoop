package com.company;

public class Main {
    public static boolean isOdd(int number)
    {
        if(number<0)
        {
            return false;
        }
        if(number%2!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int sumOdd(int start, int end)
    {
        int sum=0;
        if(start<0 || end<0 || (end-start)<0)
        {
            return -1;
        }
        for(int i=start;i<=end;i++)
        {
            if(isOdd(i))
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static int sumDigits(int num)
    {
        int sum=0;
        int d=0;
        if(num>=10)
        {
            while(num>0) {

                d = num % 10;
                num = num / 10;
                sum += d;
            }
            return sum;
        }
        else
        {
            return -1;
        }
    }
    public static boolean isPalindrome(int number)
    {
        int reverse=0;
        int d=0;

        if(number<0)
        {
            number=(-1)*number;
        }int duplicate=number;

        while (number>0)
        {
            d=number%10;
            reverse+=d;
            number=number/10;
            reverse*=10;
        }
        reverse/=10;
        System.out.println(reverse);
        if((reverse==duplicate))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) {
	// write your code here
        int count=0;
        int sum=0;
//        for(int i=1;i<=1000;i++)
//        {
//            if((i%3 == 0) && (i%5 == 0))
//            {
//                count++;
//                sum+=i;
//                //System.out.println("found Number="+i);
//            }
//            if( count==5)
//            {
//                break;
//            }
//
//        }
//        System.out.println("Sum="+sum);
//        System.out.println(sumOdd(1,100));
//        System.out.println(sumOdd(-1,100));
//        System.out.println(sumOdd(100,100));
//        System.out.println(sumOdd(13,13));
//        System.out.println(sumOdd(100,-100));
//        System.out.println(sumOdd(100,1000));
//        System.out.println(sumDigits(125));
//        System.out.println(sumDigits(10225));
//        System.out.println(sumDigits(-125));
//        System.out.println(sumDigits(5));
//        System.out.println(isPalindrome(-1221));
//        System.out.println(isPalindrome(707));
//        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-12345));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(-707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-222));

    }
}
