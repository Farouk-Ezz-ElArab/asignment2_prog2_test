package question1;
import question1.Person;
public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        System.out.println("Person 1: " + person1.getName() + ", Salary: " + person1.getSalary() + ", Is Working: "
                + person1.getIsWorking() + ", Monthly Expenses: " + person1.getMonthlyExpenses());
        System.out.println("Net Income: " + person1.netIncome());

        Person person2 = new Person("Bob", 2000, true, 500);
        System.out.println("Person 2: " + person2.getName() + ", Salary: " + person2.getSalary() + ", Is Working: "
                + person2.getIsWorking() + ", Monthly Expenses: " + person2.getMonthlyExpenses());
        System.out.println("Net Income: " + person2.netIncome());

        person1.setSalary(1500);
        person1.setIsWorking(true);
        person1.setMonthlyExpenses(300);
        System.out.println("After updates, Person 1: " + person1.getName() + ", Salary: " + person1.getSalary()
                + ", Is Working: " + person1.getIsWorking() + ", Monthly Expenses: " + person1.getMonthlyExpenses());
        System.out.println("Net Income: " + person1.netIncome());

        try {
            person2.setSalary(0);
            person2.setIsWorking(true);
        } catch (IllegalStateException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
