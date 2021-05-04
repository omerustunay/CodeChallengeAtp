import java.util.HashMap;

public class Main {
    private static char[] alphabet = {'a','b','c','ç','d','e','f','g','ğ','h','ı','i','j','k','l','m','n','o','ö','p','r','s','ş','t','u','ü','v','y','z'};
    private static final HashMap<Character, Character> capitalCities = new HashMap<Character, Character>();
    public static void main(String[] args) {
        letter_dictionary(7);
    }
    public static void letter_dictionary(int value)
    {
        int true_value = value % 29;
        for (int i = 0; i < 29; i++) {
            if(i+true_value >= 29){
                capitalCities.put(alphabet[i],alphabet[(i+true_value)-29]);
            }else{
                capitalCities.put(alphabet[i],alphabet[i+true_value]);
            }
            //System.out.println(capitalCities);
        }
        decode(value, "omer ustunay");
        //encode(value, "omer");
    }
    public static void decode(int value, String text){
        for (int i = 0; i < text.length(); i++) {
            System.out.println( text.charAt(i) + " => "+capitalCities.get(text.charAt(i)));
        }
    }
    public static void encode(int value, String text){
        for (int j = 0; j < text.length(); j++) {
        for (Character i : capitalCities.keySet()) {
                if(capitalCities.get(i).equals(text.charAt(j))){
                    System.out.println(text.charAt(j) + " => " + i);
                }
            }
        }
    }
}