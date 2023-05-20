package com.intellekta.staff;

public class WeeklyStaff extends MonthlyStaff implements Staff {
    private static int workWeeks;
    private static int salary;

    public int getWorkWeeks() {
        return workWeeks;
    }

    public WeeklyStaff() {
    }

    public WeeklyStaff(int workWeeks, int workDays, int premium) {
        if (workWeeks < 2 || workWeeks > 4) {
            workWeeks = 0;
        } else {
            this.workWeeks = workWeeks;
        }
    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0) {
            return 0;
        }
        int salaryWeek = workWeeks * salary;
        return salaryWeek;
    }

    public static void printYearSalary() {
        System.out.println(workWeeks * salary * 26);
    }
}
