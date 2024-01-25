//import programs.EmpData;

public class EncapculationDemo {

    public static void main(String[] args) {
        EmpData emp=new EmpData();

        emp.setName("Narayan");
        emp.setSalary(1000);
        emp.setPhone(123);

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.getPhone());

        emp.display();
    }
  


    
}
