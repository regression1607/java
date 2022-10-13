We can code the First section easily using the code shown below.

   for(int i=1; i<=5; i++)
   {
         for(int k=1; k<=i-1; k++)
         {
              System.out.print(" ");
         }
         for(int j=1; j<=5-i+1; j++)
         {
             System.out.print("* ");
         }
        System.out.println(); 
   }

We can code the Second section easily using the code shown below.
  
   for(int i=4; i>=1; i--)
   {
         for(int k=1; k<=i-1; k++)
         {
              System.out.print(" ");
         }
         for(int j=i; j<=5; j++)
         {
             System.out.print("* ");
         }
        System.out.println(); 
        }
