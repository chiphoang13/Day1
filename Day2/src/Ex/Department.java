package Ex;

import java.util.ArrayList;

public class Department {
    private String deparmentName;
    private ArrayList<Employee> listEmployee;

    public Department() {
    }

    public Department(String deparmentName, ArrayList<Employee> listEmployee) {
        this.deparmentName = deparmentName;
        this.listEmployee = listEmployee;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deparmentName='" + deparmentName + '\'' +
                ", listEmployee=" + listEmployee +
                '}';
    }
}
