
public class Numbers {
    private Numbers() throws IllegalAccessException {
        //sumLettersOfString()
    }

    public static int sumLettersOfString(String line) {
        return turningIntoNumbers(converter(line));
    }

    private static char[] converter (String line){
        String numbersOnly = line.replaceAll("\\D", "");
        return numbersOnly.toCharArray();
    }

    private static int turningIntoNumbers (char [] charArray){
        int sum = 0;
        for(int i: charArray){
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
}
