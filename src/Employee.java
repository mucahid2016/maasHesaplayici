public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (this.salary > 0 && this.salary < 1000) {
            this.tax = this.salary * 0;
        } else {
            this.tax = this.salary * 0.03;
        }
    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus = 30 * (this.workHours - 40);
        }
    }

    void raiseSalary() {
        if (2021 - raiseSalary < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (2021 - this.raiseSalary > 9 && 2021 - this.raiseSalary < 20) {
            this.raiseSalary = this.salary * 0.10;
        } else {
            this.raiseSalary = this.salary * 0.15;
        }
    }

    void personalBilgi() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı :" + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı : " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus - this.tax));
        System.out.println("Toplam Maaş : " + (this.salary + this.bonus - this.tax) + this.raiseSalary);
    }

}
