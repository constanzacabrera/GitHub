//10.29.15

/*
 ____________________________________________________________________________
|                                            		                         |
|   Test Scores                                   		                     |
|____________________________________________________________________________|
|                                            		                         |
| - score1: double                            			                     |
| - score2: double                             			                     |
| - score3: double                               			                 |
| - id1: int                                       			                 |   
| - id2: int                                       			                 |
| - id3: int                                       			                 |
|____________________________________________________________________________|
|                                                       		             |
| + TestScores(score1 : double, score2 : double, score3 : double) :          |
| + setScore1(score : double) : void        			                     |
| + setScore2(score : double) : void        			                     |
| + setScore3(score : double) : void        			                     |
| + getScore1() : double                 			                         |
| + getScore2() : double                 			                         |
| + getScore3() : double                 			                         |
| + getID1() : double                 			                             |
| + getID2() : double                 			                             |
| + getID3() : double                 			                             |
| + getAverageScore() : double                                               |
|____________________________________________________________________________|

 */

import java.text.DecimalFormat;

public class TestScores {

    private double score1;
    private double score2;
    private double score3;
    private int id1 = 34557;
    private int id2 = 34456;
    private int id3 = 78979;

    public TestScores(double score1, double score2, double score3) 
    {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public void setScore1(double score) 
    {
        score1 = score;
    }

    public void setScore2(double score) 
    {
        score2 = score;
    }

    public void setScore3(double score) 
    {
        score3 = score;
    }

    public double getScore1() 
    {
        return score1;
    }

    public double getScore2() 
    {
        return score2;
    }

    public double getScore3() 
    {
        return score3;
    }

    public int getID1() 
    {
        return id1;
    }

    public int getID2() 
    {
        return id2;
    }

    public int getID3() 
    {
        return id3;
    }

    public double getAverageScore() {
        return (score1 + score2 + score3) / 3;
    }

    public static void main(String[] args) 
    {
        DecimalFormat df = new DecimalFormat("###.##");
        
        System.out.println("ID" + "\t\t" + "Test 1" + "\t\t" + "Test 2" +
            "\t\t" + "Test 3" + "\t\t" + "AVERAGE");
        System.out.println("_________________________________" +
                            "_________________________________________");
                            
        TestScores scoreset1 = new TestScores(70,90,66);
        
        System.out.println(scoreset1.getID1() + "\t\t" + scoreset1.getScore1() + "\t\t" + 
                        scoreset1.getScore2() + "\t\t" + scoreset1.getScore3() + "\t\t" + 
                        df.format(scoreset1.getAverageScore()));
                        
        TestScores scoreset2 = new TestScores(80,90,75);
        
        System.out.println(scoreset2.getID2() + "\t\t" + scoreset2.getScore1() + "\t\t" + 
                        scoreset2.getScore2() + "\t\t" + scoreset2.getScore3() + "\t\t" + 
                        df.format(scoreset2.getAverageScore()));
                        
        TestScores scoreset3 = new TestScores(65,65,80);
        
        System.out.println(scoreset3.getID3() + "\t\t" + scoreset3.getScore1() + "\t\t" + 
                        scoreset3.getScore2() + "\t\t" + scoreset3.getScore3() + "\t\t" + 
                        df.format(scoreset3.getAverageScore()));
    }
}