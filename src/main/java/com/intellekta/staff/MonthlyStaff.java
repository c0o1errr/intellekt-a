package com.intellekta.staff;

public class MonthlyStaff implements Staff {
    int workDays;
    int premium;

    public int getWorkDays() {
        return workDays;
    }

    public int getPremium() {
        return premium;
    }

    public MonthlyStaff() {
    }

    public MonthlyStaff(int workDays, int premium) {
        if (workDays <= 0 || workDays > 30) {
            workDays = 0;
        } else if (premium < 0 || premium > 10000) {
            premium = 0;
        } else {
            this.workDays = workDays;
            this.premium = premium;
        }
    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0){
            return premium;
        }
        int salaryMonth = salary * workDays + premium;
        return salaryMonth;
    }
}
