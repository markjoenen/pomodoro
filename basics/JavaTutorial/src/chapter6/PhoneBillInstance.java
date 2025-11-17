package chapter6;

public class PhoneBillInstance {
    public static void main(String args[]) {
        /*
        * Phone Bill 1
        * */
        EnhancedPhoneBillCalculator maria = new EnhancedPhoneBillCalculator();
        maria.setId("Maria");
        maria.setNumberOfMinutesUsed(10);
        maria.setBaseCost(350.2);
        maria.printTotalBill();

        /*
        * Phone Bill 2
        * */
        EnhancedPhoneBillCalculator john = new EnhancedPhoneBillCalculator("John");
        john.setBaseCost(289.67);
        john.setOverageFee(3.5);
        john.setNumberOfMinutesUsed(350);
        john.setBaseCost(430.69);
        john.printTotalBill();

        /*
        * Phone Bill 3
        * */
        EnhancedPhoneBillCalculator jerry = new EnhancedPhoneBillCalculator("Jerry", 500.1, 60, 39, 0.15, 0.25);
        jerry.printTotalBill();
    }
}
