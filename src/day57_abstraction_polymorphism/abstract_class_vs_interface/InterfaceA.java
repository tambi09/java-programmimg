package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {
    public static final String TYPE = "interface";
    double MAC_COUNT = 500;//this is also public static final
   public abstract void  absMethodD(int num);

   /**
   starting from Java 8 (jdk 1.8)
   interface can have static and default
    */



   public static void staticMethodE(String str){
       System.out.println("static methodE is called with str - " +str);
   }

   public default void defaultMethodF(){
       System.out.println("defaultMethodF is called");

   }
}
