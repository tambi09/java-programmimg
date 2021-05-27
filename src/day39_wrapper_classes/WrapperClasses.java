package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = " + num);
        num +=10;
        System.out.println(num);

        Integer n = new Integer(500);
        System.out.println("Is n 500? = "+n.equals(500));
        System.out.println(n + 300);

        Integer n2 = 1000;
        System.out.println(n2/ 50);
        String numStr = n2+"";
        String numSt = n2.toString();

        System.out.println("numStr = " +numStr);
        System.out.println("numSt = " + numSt);

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;
        Short sh1 = new Short((short)40);
        Short sh2 = 50;
        Integer i1 = new Integer((int)100);
        Integer i2 = new Integer((int)200);
        Long l1 = new Long((long)300L);
        Long l2 = new Long((long)3455L);
        Float fl1 = new Float((float)5.2F);
        Float fl2 = new Float((float)45.3f);
        Double d1 = new Double(345.3);
        Double d2 = new Double(234.5);
        Character ch1 = new Character('Q');
        Character ch2 = new Character('V');
        Boolean bl1 = new Boolean(true);
        Boolean bl2 = new Boolean(false);

    }
}
