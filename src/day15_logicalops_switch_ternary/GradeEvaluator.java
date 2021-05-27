package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {

        char grade = 'A';
        if(grade == 'A' || grade == 'B' || grade == 'C' ) {
            System.out.println("You passed with grade " + grade);
        }else if (grade == 'D') {
            System.out.println("You need to retake the exam. Grade - " + grade);
        }else if (grade == 'E') {
            System.out.println("Fail. Grade -" + grade);
        }else{
            System.out.println("Invalid grade. Please contact IT support");
        }
        }
    }

