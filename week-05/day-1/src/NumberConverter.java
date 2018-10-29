import java.util.ArrayList;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(convertNumberToString(23999));
    }
    public static String convertNumberToString(int number) {
        ArrayList<String> decimals = new ArrayList<>();
        decimals.add("");
        decimals.add("Thousand");
        decimals.add("Million");

        String stringNumber = String.valueOf(number);

        if (stringNumber.length() > 3 && stringNumber.length() < 6) {
            return hundreds(number / 1000) + decimals.get + hundreds(number % 1000);
        }
        String toReturn = "";
         int count = 0;
        for (int i = 1000; i < number; i*=1000) {
            toReturn = hundreds(Integer.parseInt(stringNumber.substring()) % i) + decimals.get(count);
            count++;
        }

    }
    public static String tens (int number) {
        ArrayList<String> ones = new ArrayList<>();
        ones.add("Zero");
        ones.add("One");
        ones.add("Two");
        ones.add("Three");
        ones.add("Four");
        ones.add("Five");
        ones.add("Six");
        ones.add("Seven");
        ones.add("Eight");
        ones.add("Nine");
        ones.add("Ten");
        ones.add("Eleven");
        ones.add("Twelve");
        ones.add("Thirteen");
        ones.add("Fourteen");
        ones.add("Fifteen");
        ones.add("Sixteen");
        ones.add("Seventeen");
        ones.add("Eighteen");
        ones.add("Nineteen");

        ArrayList<String> tens = new ArrayList<>();
        tens.add("");
        tens.add("Ten");
        tens.add("Twenty");
        tens.add("Thirty");
        tens.add("Forty");
        tens.add("Fifty");
        tens.add("Sixty");
        tens.add("Seventy");
        tens.add("Eighty");
        tens.add("Ninety");

        String toReturn = "";

        if (number>=20) {
            for (int i = number; i >= 1; i/=10) {
                if (i<100) {
                    if (i<10) {
                        toReturn = tens.get(i%10)+ " " + toReturn;
                    } else {
                        toReturn = ones.get(i%10)+" "+toReturn;
                    }
                }
            }
        } else {
            toReturn = ones.get(number);
        }
        return toReturn;
    }
    public static String hundreds (int number) {
        ArrayList<String> ones = new ArrayList<>();
        ones.add("Zero");
        ones.add("One");
        ones.add("Two");
        ones.add("Three");
        ones.add("Four");
        ones.add("Five");
        ones.add("Six");
        ones.add("Seven");
        ones.add("Eight");
        ones.add("Nine");

        String stringNumber = String.valueOf(number);

        if (stringNumber.length() < 3) {
            return tens(number);
        }

        else return ones.get(number/100)+" hundred "+tens(number%100);

    }
}