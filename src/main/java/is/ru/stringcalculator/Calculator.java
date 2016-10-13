package is.ru.stringcalculator;

class Calculator {

    /**
     * Takes a string of comma-seperated integer values and returns their sum.
     * The empty string is equivalent to 0(what a crazy API)
     * @param input Comma-seperated integer values
     * @return The sum of the input
     */
    public static int add(String input) {
        if(input == "") {
            return 0;
        }

        int sum = 0;        
        for(String integer : input.split(",")) {
            sum += Integer.parseInt(integer);
        }

        return sum;
    }
}
