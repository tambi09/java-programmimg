package day27_forLoop;

public class eadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,cat,red_car,java,selenium";
        for (int i = 0; i < list.length()-2; i++ ){
            System.out.println(list.substring(i,i+3));
            if (list.substring(i,i+3).equals("cat") || list.substring(i,i+3).equals("cars")){
                System.out.println("cat or car found");

            }
        }

    }
}
