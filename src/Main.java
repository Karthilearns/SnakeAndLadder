import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        int min = 1;
        int max = 6;
        int diceValue;
        Scanner scanner = new Scanner(System.in);
        int playerPosition=0;
        int computerPosition=0;
        int choice =1;
        int playerTurn =0;
        while(choice!=0)
        {
            System.out.println("Enter 0 to exit");
            choice = scanner.nextInt();
            if(choice!=0)
            {
                if(playerTurn%2==0)
                {
                    System.out.println("Your turn");
                    System.out.println("Enter any key for rolling a die and Zero for exit");
                    int playerChoice = scanner.nextInt();
                    if(playerChoice!=0)
                    {
                         diceValue=(int) Math.floor(Math.random()*(max-min+1)+min);
                         System.out.println(diceValue);
                         playerPosition += diceValue;
                         playerTurn++;
                        if(playerPosition>=100)
                        {
                            System.out.println("YOU WON!!!!!!!!!!!!");
                            break;
                        }
                    }
                    else
                    {
                        break;
                    }

                    switch (playerPosition)
                    {
                        case 100:
                            System.out.println("You won");
                            break;
                        case 2:
                            playerPosition = 23;
                            System.out.println("wohoo u are advanced to 23rd cell");
                            break;

                        case 8:
                            playerPosition = 34;
                            System.out.println("wohoo u are advanced to 34th cell");
                            break;

                        case 20:
                            playerPosition = 77;
                            System.out.println("wohoo u are advanced to 77th cell");
                            break;
                        case 29:
                            playerPosition = 9;
                            System.out.println(" You are down to 9th cell");
                            break;

                        case 32:
                            playerPosition = 68;
                            System.out.println("wohoo u are advanced to 68th cell");
                            break;

                        case 38:
                            playerPosition = 15;
                            System.out.println("wohoo u are down to 15th cell");
                            break;
                        case 47:
                            playerPosition = 5;
                            System.out.println("wohoo u are down to 5th cell");
                            break;
                        case 53:
                            playerPosition = 33;
                            System.out.println("wohoo u are down to 33rd cell");
                            break;
                        case 62:
                            playerPosition = 37;
                            System.out.println("wohoo u are down to 37th cell");
                            break;
                        case 74:
                            playerPosition = 88;
                            System.out.println("wohoo u are advanced to 88th cell");
                            break;
                        case 92:
                            playerPosition = 90;
                            System.out.println("wohoo u are down to 90-th cell");
                            break;
                        case 97:
                            playerPosition = 25;
                            System.out.println("wohoo u are down to 25th cell");
                            break;

                        default:
                           // playerPosition+=diceValue;
                            System.out.println("You are not at "+playerPosition);
                            break;

                    }

                }
                else
                {
                    diceValue=(int) Math.floor(Math.random()*(max-min+1)+min);
                    System.out.println(diceValue);
                    computerPosition += diceValue;
                    playerTurn++;

                    if(computerPosition>=100)
                    {
                        System.out.println("COMPUTER WON !!!!!!!!!!!");
                        break;
                    }
                    switch (computerPosition)
                    {

                        case 2:
                            computerPosition = 23;
                            System.out.println("wohoo computer is advanced to 23rd cell");
                            break;

                        case 8:
                            computerPosition = 34;
                            System.out.println("wohoo computer is advanced to 34th cell");
                            break;

                        case 20:
                            computerPosition = 77;
                            System.out.println("wohoo computer is advanced to 77th cell");
                            break;
                        case 29:
                            computerPosition = 9;
                            System.out.println(" computer is down to 9th cell");
                            break;

                        case 32:
                            computerPosition = 68;
                            System.out.println("wohoo computer is advanced to 68th cell");
                            break;

                        case 38:
                            computerPosition = 15;
                            System.out.println("wohoo computer is down to 15th cell");
                            break;
                        case 47:
                            computerPosition = 5;
                            System.out.println("wohoo computer is down to 5th cell");
                            break;
                        case 53:
                            computerPosition = 33;
                            System.out.println("wohoo computer is down to 33rd cell");
                            break;
                        case 62:
                            computerPosition = 37;
                            System.out.println("wohoo computer is down to 37th cell");
                            break;
                        case 74:
                            computerPosition = 88;
                            System.out.println("wohoo computer is advanced to 88th cell");
                            break;
                        case 92:
                            computerPosition = 90;
                            System.out.println("wohoo computer is down to 90-th cell");
                            break;
                        case 97:
                            computerPosition = 25;
                            System.out.println("wohoo computer is down to 25th cell");
                            break;
                        default:
                           // computerPosition+=diceValue;
                            System.out.println("computer is now at "+computerPosition);
                            break;

                    }
                }
            }
            else
            {
                break;
            }

        }
    }
}
