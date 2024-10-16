package com.solid.s.good;

public class EmployeePaymentService {
    private EmployeeAdditionalPaymentService additionalPaymentService;
    public EmployeePaymentService(EmployeeAdditionalPaymentService additionalPaymentService){
        this.additionalPaymentService=additionalPaymentService;
    }

    /**
     * Am creat 2 metode noi care returneaza plata pe ora a angajatului in functie de
     * status, iar alta care returneaza nr de ore lucrate de angajat tot in functie de status.
     * Aceste 2 metode a trebuit sa le scriu in clasa EmployeePaymentService pentru ca aceasta clasa este
     * responsabila de a calcula salariul, inclusiv logica pentru orele lucrate.
     */
    private int workedHours(GoodEmployee employee) {
        if (employee.getStatus().equalsIgnoreCase("full-time")) {
            return 40;
        } else if (employee.getStatus().equalsIgnoreCase("part-time")) {
            return 30;
        }
        return 0;
    }

    private int hourlyWage(GoodEmployee employee) {
        if (employee.getStatus().equalsIgnoreCase("full-time")) {
            return 40;
        } else if (employee.getStatus().equalsIgnoreCase("part-time")) {
            return 20;
        }
        return 0;
    }
    public int calculatePay(GoodEmployee employee){
        // aici o sa folosesc si o metoda de calc a platilor aditionale din clasa EmployeeAdditionalPaymentService

        int hourlyWage=hourlyWage(employee);
        int workedHours=workedHours(employee);

        int bonus= additionalPaymentService.additionalBonusPayment(employee);

        return hourlyWage*workedHours + bonus;
    }

}
