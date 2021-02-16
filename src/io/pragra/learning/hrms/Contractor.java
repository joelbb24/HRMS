package io.pragra.learning.hrms;

public class Contractor extends BaseEmployee implements IEmployee{

    private static String type = "CONTRACTOR";


    public Contractor(String name, String type, double weeklySalary, double bonus) {
        super(name, type, weeklySalary, bonus);
    }

    @Override
    public void hire() {
        System.out.println("Doing 1st round...");
        System.out.println("Doing 2nd round...");
        System.out.println("HIRED");
    }

    @Override
    public void terminate() {
        System.out.println("Terminated");
    }

    @Override
    public double bonus() {
        return 0;
    }

    @Override
    public void display() {
        System.out.printf("%s Name       : %s \n ", getName(), getName());
        System.out.printf("%s Employee Salary/wk   : %f \n", getType(), getWeeklySalary());
        System.out.printf("%s Employee Bonus     : %f \n  ", getType(), getBonus());
        System.out.printf("%s Employee type        : %s", getType(), getType());
    }
}
