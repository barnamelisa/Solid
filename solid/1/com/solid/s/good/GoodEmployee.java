package com.solid.s.good;

public class GoodEmployee {
    private String status; // daca munceste part-time sau full time
    private String name;
    private int hours;
    public GoodEmployee(String status, String name, int hours){
        this.status=status;
        this.name=name;
        this.hours=hours;
    }

    /** Ca sa nu incalc principiul Single Responsibility, nu trebuie sa fac
     *  metodele de getPay etc in employee, ci trebuie sa fac o clasa separata care se
     *  ocupa strict de acest lucru.
     *
     *  Clasele respective vor fi:
     *  ->EmployeeAdditionalPaymentService
     *  ->EmployeePaymentService
     *  ->EmployeeTimetrackingService
     *  ->EmployeeRepository
    */

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

}
