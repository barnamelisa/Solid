package com.solid.s.good;

public class EmployeeAdditionalPaymentService {
    // aceasta clasa se va ocupa STRICT de calcularea unor plati aditionale
    private static final int fullTimeBonus=200;
    private static final int partTimeBonus=100;
    public EmployeeAdditionalPaymentService(){

    }
    public int additionalBonusPayment(GoodEmployee employee){
        if (employee.getStatus().equalsIgnoreCase("Full-time")){
            return fullTimeBonus;
        } else if (employee.getStatus().equalsIgnoreCase("Part-time")){
            return partTimeBonus;
        }
        return 0;
    }

}
