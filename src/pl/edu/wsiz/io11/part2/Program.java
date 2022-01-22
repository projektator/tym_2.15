package pl.edu.wsiz.io11.part2;

public class Program {
    public static void main(String[] args) {

        Company company = new Company();

        company.add(new Employee("Jan", "Zwolski", (byte) 32));
        company.add(new Employee("Anna", "Piątek", (byte) 36));
        company.add(new Employee("Anna", "Wiącek", (byte) 46));

        Employee e1 = new Employee("Gośka", "Kurda",(byte) 47);
        Employee e2 = new Employee("Przemek", "Wlazi", (byte) 44);
    }
}