package Ex;

public class HourlyEmployee extends Employee{
    private double wage;
    private double workingHours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, String mail, double wage, double workingHours) {
        super(ssn, firstName, lastName, birthDate, phone, mail);
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    @Override
    public void display(){
        System.out.println("Thong tin nhan vien Part");
        System.out.println("SNN:" + this.getSsn());
        System.out.println("Ho va ten:" +this.getFirstName() +this.getLastName());
        System.out.println("DOB:" +this.getBirthDate());
        System.out.println("Phone:"+ this.getBirthDate());
        System.out.println("Mail:"+ this.getMail());
        System.out.println("CommissionRate:" + this.wage);
        System.out.println("grossSale:"+ this.workingHours);
    }
}

