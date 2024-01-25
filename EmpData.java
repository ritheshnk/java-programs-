public class EmpData {
    private String  name;
    private int salary;
    private int phone_number;

    void setName(String name){
        this.name=name;
    }

    void setSalary(int salary){
        this.salary=salary;
    }

    void setPhone(int phone_number){
        this.phone_number=phone_number;
    }

    String getName(){
        return name;
    }
    int getSalary()
    {
        return salary;
    }

    int getPhone(){
        return phone_number;
    }


    void display(){
        System.out.println("Employee Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Phone Number: "+phone_number);
    }
}
