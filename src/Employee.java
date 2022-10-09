public class Employee {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;

    public Employee() {
    }
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    // Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    // Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    public Double tax() {
        Double taxSalary = 0.0;
        if (salary < 1000) {
            taxSalary = 0.0;
        }
        if (salary > 1000) {
            taxSalary = (salary * 3) / 1000;
        }
        return taxSalary;
    }

    // bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
    // her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    public Double bonus() {
        Double bonus = 0.0;
        if (workHours > 40) {
            int bonusHour = workHours - 40;
            bonus = 30.0 * bonusHour;
        }
        return bonus;
    }

    // raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın
    // Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    // Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    // Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    // Not: raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
    public Double raiseSalary() {
        int sumWorkYear = 2021 - hireYear;
        ;
        Double raiseWithSalary = 0.0;
        if (sumWorkYear < 10) {
            raiseWithSalary = ((salary + bonus() - tax())*5)/100;
        }
        if (sumWorkYear > 9 && sumWorkYear < 20) {
            raiseWithSalary = ((salary + bonus() - tax())*10)/100;
        }
        if (sumWorkYear > 19) {
            raiseWithSalary = ((salary + bonus() - tax())*15)/100;
        }
        return raiseWithSalary;
    }

    @Override
    public String toString() {
        return "Çalışanın Adı: " + name + "\n" +  "Çalışanın maaşı:" + salary + "\n" + "Haftalık çalışma saati" + workHours + "\n" +  "İşe başlangıç yılı :" + hireYear + "\n" + "Bonusla Birlikte Maaşı: " + (salary+bonus()) + "\n" + "Vergiyle birlikte Maaşı: " + (salary+tax()) + "\n" + "Zam ile birlikte Maaşı: " + (salary + raiseSalary());
    }
}