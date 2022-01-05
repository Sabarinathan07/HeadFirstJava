// package chap05;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args)
    {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        
        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);
        
        // int[] locations = {randomNum, randomNum+1, randomNum+2};
        ArrayList<String> locations = new ArrayList<>();
        // String strRandom = Integer.toString(randomNum);
        locations.add(Integer.toString(randomNum));
        locations.add(Integer.toString(randomNum+1));

        locations.add(Integer.toString(randomNum+2));

        // locations.add(randomNum+1);
        // locations.add(randomNum+2);
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true)
        {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            System.out.println(result);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
