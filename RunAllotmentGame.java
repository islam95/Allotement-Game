
/**
 * Write a description of class RunTestRadish here.
 * 
 * @group_d 
 * @version (a version number or a date)
 */

public class RunAllotmentGame
{
   
    public static void main(String[] args)
   { 
       GameRules rules = new GameRules();
       GridPlot grid = new GridPlot();

       rules.showRules();
       grid.showGrid();
       rules.choiceVegetables();
       rules.choiceVegetables();
       rules.choiceVegetables();
       rules.choiceVegetables();
    }
 
}
