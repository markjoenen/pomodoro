package chapter6;

//Enhance the Phone Bill exercise by redoing it in an object-oriented style.
//A phone bill should have an id, base cost, number of allotted minutes, and
//number of minutes used. One should also be able to calculate the overage,
//tax, and total on a phone bill, and also be able to print an itemized bill.
//Include the following constructors: default, id-only, all fields. No matter
//which constructor is used, all fields should be set.
//Create a class that instantiates a phone bill and prints the itemized bill.

public class EnhancedPhoneBillCalculator {
    private String id;
    private double baseCost;

    private int numberOfAllotMinutes;
    private int numberOfMinutesUsed;
    private double taxPercentage;
    private double overageFee;

    // Set and Get Methods for each fields.
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public double getTaxPercentage(){
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage){
        this.taxPercentage = taxPercentage;
    }

    public double getOverageFee(){
        return overageFee;
    }

    public void setOverageFee(double overageFee){
        this.overageFee = overageFee;
    }

    public int getNumberOfAllotMinutes(){
        return numberOfAllotMinutes;
    }

    public void setNumberOfAllotMinutes(int allotMinutes){
        this.numberOfAllotMinutes = allotMinutes;
    }

    public int getNumberOfMinutesUsed() {
        return numberOfMinutesUsed;
    }

    public void setNumberOfMinutesUsed(int minutesUsed){
        this.numberOfMinutesUsed = minutesUsed;
    }

    // Constructor instantiate
    public EnhancedPhoneBillCalculator(){
        setTaxPercentage(0.15);
        setOverageFee(0.25);
        setNumberOfAllotMinutes(999);
    }

    public EnhancedPhoneBillCalculator(String id){
        setId(id);
        setTaxPercentage(0.15);
        setOverageFee(0.25);
        setNumberOfAllotMinutes(999);
    }

    public EnhancedPhoneBillCalculator(String id, double baseCost, int numberOfAllotMinutes, int numberOfMinutesUsed, double taxPercentage, double overageFee){
        setId(id);
        setBaseCost(baseCost);
        setNumberOfAllotMinutes(numberOfAllotMinutes);
        setNumberOfMinutesUsed(numberOfMinutesUsed);
        setTaxPercentage(taxPercentage);
        setOverageFee(overageFee);
    }

    // Calculations
    public double calculateOverageFees(){
        return numberOfMinutesUsed * overageFee;
    }

    public double calculateTax(){
        return (baseCost + calculateOverageFees()) * taxPercentage;
    }

    public double calculateTotalBill(){
        return baseCost + this.calculateTax() + this.calculateOverageFees();
    }

    public void printTotalBill(){
        System.out.println("Phone Bill Statement");
        System.out.println("User Id: " + getId());
        System.out.println("Plan: " + getBaseCost());
        System.out.println("Number Of Minutes Used: " + getNumberOfMinutesUsed());
        System.out.println("Number Of Allot Minutes: " + getNumberOfAllotMinutes());
        System.out.println("Overage Fee: " + calculateOverageFees());
        System.out.println("Taxes: " + calculateTax());
        System.out.println("Total: " + calculateTotalBill());
        System.out.println("");
    }
}
