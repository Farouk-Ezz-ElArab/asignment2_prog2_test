package question1;

public class Person {
    private String name;
    private double salary;
    private boolean isWorking;
    private double monthlyExpenses;

    static final double DEFAULT_SALARY = 1000;

    public Person(String name) {
        this.name = name;
        this.salary = 0;
        this.isWorking = false;
        this.monthlyExpenses = 0;
    }

    public Person(String name, double salary, boolean isWorking, double monthlyExpenses) {
        this.name = name;
        this.salary = salary;
        this.isWorking = isWorking;
        this.monthlyExpenses = monthlyExpenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        validateState();
    }

    public double getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(double monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
        validateState();
    }

    public boolean getIsWorking() {
        return isWorking;
    }

    public double netIncome() {
        return salary - monthlyExpenses;
    }

    private void validateState() {
        if (!isWorking) {
            this.salary = 0;
        } else if (this.salary <= 0) {
            this.salary = DEFAULT_SALARY;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alaa");
        System.out.println("Person 1: " + person1.getName() + ", Salary: " + person1.getSalary() + ", Is Working: "
                + person1.getIsWorking() + ", Net Income: " + person1.netIncome());

        Person person2 = new Person("mari", 2000, true, 500);
        System.out.println("Person 2: " + person2.getName() + ", Salary: " + person2.getSalary() + ", Is Working: "
                + person2.getIsWorking() + ", Net Income: " + person2.netIncome());

        person1.setIsWorking(true);
        //person1.setSalary(1500);
        person1.setMonthlyExpenses(300);
        System.out.println("Person 1 (after updates): " + person1.getName() + ", Salary: " + person1.getSalary()
                + ", Is Working: " + person1.getIsWorking() + ", Net Income: " + person1.netIncome());

        person2.setIsWorking(false);
        System.out.println("Person 2 (after updates): " + person2.getName() + ", Salary: " + person2.getSalary()
                + ", Is Working: " + person2.getIsWorking() + ", Net Income: " + person2.netIncome());
    }
}
