package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {

    int score = 330;
    if (score >= 1 || score  <= 40) {
        System.out.println("Grade D");
    }else if(score >=41 && score <=60) {
        System.out.println("Grade C");
    }else if ( score <= 61 && score <=90) {
        System.out.println("Grade B");
    }else if (score <=91 && score <=100) {
        System.out.println("Grade A");
    }else {
        System.out.println("Incorrect entry, please try again");


        }
    }
}
