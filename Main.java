public class Main {
        public static void main(String[] args) throws FieldLengthLimitException,
                IncorrectSalaryException, EmployeeInRegistryException {
            Registry workers = Registry.getRegistry();
            workers.printList();

            Employee employee = new Employee("Kate",1000.0,31);
            workers.AddWorker(employee);
            workers.printList();

            Employee manager = new Manager("Nika", 1300.0,32, 500.0);
            workers.AddWorker(manager);
            workers.printList();

            workers.AddWorker(manager);// перевірка

        }
}