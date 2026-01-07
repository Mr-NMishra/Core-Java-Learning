package CodeBlock_MethodOverloading;

/*
    In this challenge we're going to create two methods:
    The first method should be named displayHighScorePosition.
    This method should have two parameters, one for a player's name, and one for a player's position in a high score list.
    This method should print a message like "Tim managed to get into position 2 on the high score list".



    Score greater than or equal to 1000                     1
    Score greater than or equal to 500 but less than 1000   2
    Score greater than or equal to 100 but less than 500    3
    All Other scores                                        4



*/

public class  Method_Overloading_Challange {

    public void displayHighScorePosition(String playerName, int score){
       int position=calculateHighScore(score);
       System.out.println(playerName+" managed to get into position "+position+" on the high score list");
    }

    public int calculateHighScore(int score){
        int position=4;
        if(score>=1000)
            position=1;
        else if(score>=500 )
            position=2;
        else if(score>=100 )
            position=3;

        return position;
    }

}
