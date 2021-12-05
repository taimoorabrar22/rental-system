package tasks;

import controllers.*;

public class Fee{
    private double fee;
    private String startDate;
    private String endDate;
    private boolean isPaid;
    private FeeController feeController; //don't forget to define this

    public void payFee(double fee, int period){
        System.out.println("payFee method called.");
    }

    public void setFee(double fee, int period){
        System.out.println("setFee method called.");
    }

}