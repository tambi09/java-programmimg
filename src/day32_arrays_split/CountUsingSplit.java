package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catTypes = "bengal cat tabby cat persian cat no cat here";
        String[]catsArray = catTypes.split("cat");
        System.out.println("number of 'cat' = " + (catsArray.length -1) );
        }
    }

