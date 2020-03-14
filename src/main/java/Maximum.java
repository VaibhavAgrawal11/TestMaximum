//GENERIC CLASS
public class Maximum<E extends Comparable> {
    private E firstValue;
    private E secondValue;
    private E thirdValue;

    //PARAMETERIZED CONSTRUCTOR
    public Maximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    //METHOD TO COMPARE GENERIC PARAMETERS AND RETURN MAXIMUM
    public <E extends Comparable> E testMaximum(E firstValue, E secondValue, E thirdValue) {
        if (firstValue.compareTo(secondValue) >= 0 && firstValue.compareTo(thirdValue) >= 0) {
            return (E) firstValue;
        } else if (secondValue.compareTo(firstValue) >= 0 && secondValue.compareTo(thirdValue) >= 0) {
            return (E) secondValue;
        } else {
            return (E) thirdValue;
        }
    }

    //METHOD OVERRIDEN TO INITIALISE PARAMETERS OF METHOD
    public E testMaximum() {
        printMax(testMaximum(firstValue, secondValue, thirdValue));
        return testMaximum(firstValue, secondValue, thirdValue);
    }

    //METHOD TO PRINT MAXIMUM GENERIC ELEMENT
    public void printMax(E max) {
        System.out.println("Maximum Value : " + max);
    }
}
