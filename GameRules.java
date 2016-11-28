import java.util.*;
/**
 * Write a description of class GameTitle here.
 * 
 * @group_d
 * @version (a version number or a date)
 */
public class GameRules
{  
    GridPlot grid;
    Radish testR;
    Potato testP;
    Carrot testC;
    Turnip testT;

    public GameRules()
    {
       grid = new GridPlot();
       testR = new Radish(grid);
       testP = new Potato(grid);
       testC = new Carrot(grid);
       testT = new Turnip(grid);
    }
    
    public void showRules()
    {
      System.out.println("=======================================================");
      System.out.println();
      System.out.println("        Allotment Game Development - Group D");
      System.out.println();
      System.out.println("            developers :  Alae Abouloula");
      System.out.println("                          Islam Dudaev");
      System.out.println("                          Ropafadzo Maphango");
      System.out.println("                          Yeonju Lee");
      System.out.println();
      System.out.println("=======================================================");
      System.out.println();
      System.out.println();
      System.out.println("        << Game rules for player 1>> ");
      System.out.println();
      System.out.println("        There are 4 vegetabels you can plant on the grid.");
      System.out.println("        Each vegetable has its own rule.");
      System.out.println("        Enter the row and column number to follow the rules given.");
      System.out.println("        No vegetable is allowed to touch any other.");
      System.out.println();
    }
    
    public void choiceVegetables()
    {
        System.out.println();
        System.out.println("        You can choose one of vegetables to plant.");
        System.out.println("        Radish (1), Potato (2), Carrot (3), Turnip (4)");
        System.out.println();
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("        Which vegetable would you like to plant?");
        System.out.print("        Enter the number: ");
        int choice = input.nextInt();
 
         switch(choice){
            case 1: 
                System.out.println();
                System.out.println("        Good choice! Let's plant Radishes.");
                testR.plantRadish();
                break;
                
            case 2: 
                System.out.println();
                System.out.println("        Good choice! Let's plant Potatoes.");
                testP.plantPotatoes();
                break;
            
            case 3: 
                System.out.println();
                System.out.println("        Good choice! Let's plant Carrots.");
                testC.plantCarrots();
                break;
            
            case 4: 
                System.out.println();
                System.out.println("        Good choice! Let's plant Turnips.");
                testT.plantTurnip();
                break;
               
            default :
                System.out.println();
                System.out.println("        Invalid number. Please enter number between 1 and 4.");
                break;
          }
      }
}
