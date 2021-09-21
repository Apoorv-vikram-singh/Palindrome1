class Palindrome1
{
    public static void main(String agrs[])
    {
      int   n=121;
      int sum=0;
      int n1;
      n1=n;
    int a;
     
      
      while(n>0)
      {
          a=n%10;
         
          sum=sum*10+a;
          n=n/10;
         

         
      }
      if(n1==sum)
      {
          System.out.print("palindrome");

      }
      else{
          System.out.println("not");
      }

    }
}