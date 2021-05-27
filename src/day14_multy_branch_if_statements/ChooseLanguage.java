package day14_multy_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");
        int selection =2;
        if (selection ==1) {
            System.out.println("hello, thank you for your call");
        }else if (selection == 2) {
            System.out.println("hola, gracias para llamar");
        }else if(selection == 3) {
            System.out.println("Meraba, aragidiniz icin tesekkurlar");
        }else if(selection ==4) {
            System.out.println("Privet,spasibo za zvonok");
        }else if (selection ==5){
            System.out.println("Merci, pour votre appel");

        }
    }
}
