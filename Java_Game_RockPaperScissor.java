package com.company;
import java.util.Scanner;
import java.util.Random;

public class Java_Game_RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Welcome To The Rock Paper Scissor Game");
        System.out.println("0 For Rock \n1 For Paper \n2 For Scissor");
        int i = 0;
        while(i<5)
        {
            System.out.printf("Please Choose Rock or Paper or Scissor\n",i++);
            Scanner a = new Scanner(System.in);
            int num = a.nextInt();
            switch (num){
                case 0 -> System.out.println("You Chose Rock");
                case 1 -> System.out.println("You Chose Paper");
                case 2 -> System.out.println("You Chose Scissor");
            }
            System.out.println("It's Computer's Turn Now");
            Random b = new Random();
            int num2 = b.nextInt(3);
            switch (num2){
                case 0 -> System.out.println("Computer Chose Rock");
                case 1 -> System.out.println("Computer Chose Paper");
                case 2 -> System.out.println("Computer Chose Scissor");
            }
            if(num2 == num){
                System.out.println("Match Draw!");
            }
            else if((num==0 && num2==2) || (num==1 && num2==0) || (num==2 && num2==1)){
                System.out.println("Congrats!! You Won");
            }
            else{
                System.out.println("You Lost!! Better Luck Next Time :)");
            }
        }
    }
}
