import java.util.ArrayList;

public class Registry {
    private static Registry instance = null;
    private final ArrayList<Employee> workers = new ArrayList<Employee>();
    private Registry() {

    }

    public static Registry getRegistry() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

    public void AddWorker(Employee employee) throws EmployeeInRegistryException {
        if (workers.size() == 0) {
            workers.add(employee);
        } else {
            for (Employee emp : workers) {
                if (emp.getId() == employee.getId()) {
                    throw new EmployeeInRegistryException("This worker is on the list already");
                }
            }
            workers.add(employee);
        }
    }

    public void printList() {
        if (workers.size() == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println("In list are:");
            for (Employee employee : workers) {
                employee.outputEmployee();
            }
        }
    }
}
