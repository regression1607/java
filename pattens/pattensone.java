package pattens;

public class pattensone{

    public static void main(String[] args) {
        patten(5, 5);
    }
    public static void patten(int x,int y){

        // Output


        /*  * * * * * * 
             * * * * * 
              * * * * 
               * * * 
                * * 
                 * 
                 * 
                * * 
               * * * 
              * * * * 
             * * * * * 
            * * * * * *     */


        //Code
        
            for(int i=0;i<=x;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=y-i;j++){
                    System.out.print("* ");
                }
                
                System.out.println();
            }
            for(int i=0;i<=x;i++){
                for(int j=0;j<=y-i;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }    
}