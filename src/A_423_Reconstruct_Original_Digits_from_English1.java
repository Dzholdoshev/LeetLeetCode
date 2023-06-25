import java.util.*;
import java.util.stream.Collectors;

public class A_423_Reconstruct_Original_Digits_from_English1 {
    public static void main(String[] args) {
       // System.out.println(originalDigits("rie"));
        test("ninenine");
    }
    public static boolean test(String str){
        String digit = "nine";
      String noDuplicates = Arrays.stream(digit.split("")).distinct().collect(Collectors.joining());
      char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < noDuplicates.length(); j++ ){
                if(arr[i]==noDuplicates.charAt(j)){
                   // Collections.frequency(Arrays.stream(str.split("")).collect(Collectors.toList()), )
                    System.out.println(arr[i] +" : " + noDuplicates.charAt(j));

                }

            }

            }return true;
        }




    public static String originalDigits(String s) {
        Map<String,Integer> stringDigits = new HashMap<>();
        stringDigits.put("zero",0);
        stringDigits.put("one",0);
        stringDigits.put("two",0);
        stringDigits.put("three",0);
        stringDigits.put("four",0);
        stringDigits.put("five",0);
        stringDigits.put("six",0);
        stringDigits.put("seven",0);
        stringDigits.put("eight",0);
        stringDigits.put("nine",0);

        return null;
    }
}
