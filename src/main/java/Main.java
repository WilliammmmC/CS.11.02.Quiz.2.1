public class Main {

    public static void main(String[] args) {

        // call the first add method and store the result into a variable called resultOne.
        int resultOne = add(23,7);
        // print resultOne.
        System.out.println(resultOne);
        // call the greeting method and store the result into a variable called resultTwo.
        String resultTwo = greeting("William");
        // print resultTwo.
        System.out.println(resultTwo);
        // call the second add method and store the result into a variable called resultThree.
        int resultThree = add(3,7,6,5);
        // print resultThree.
        System.out.println(resultThree);
        // call the printCapitalised method.
        String resultFour = printCapitalised("william");

    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @return the sum of numOne and numTwo (an integer)
     */
    public static int add(int numOne,int numTwo){
        return numOne + numTwo;
    }
    /**
     * greeting
     * @param name - the name of a person (a String)
     * @return a greeting in the format of "Bonjour, [name]!" (a String)
     */
    public static String greeting(String name){
        return "Bonjour, " + name + "!";
    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @param numThree - an integer
     * @param numFour - an integer
     * @return the sum of numOne, numTwo, numThree, and numFour (an integer)
     */
    public static int add(int numOne,int numTwo,int numThree,int numFour){
        return numOne + numTwo + numThree + numFour;
    }


    /**
     * printCapitalised
     * @param toBePrinted - a String that the user wishes to be printed in all caps.
     */
    public static String printCapitalised(String toBePrinted){
        return toBePrinted.toUpperCase();
    }




}
