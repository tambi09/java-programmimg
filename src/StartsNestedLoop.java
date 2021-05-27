public class StartsNestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("\uD83C\uDF54 ");
                }


                System.out.println();
            }
        }
    }
