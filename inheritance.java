class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    
    public void printSalary(){
        System.out.println("Salary : "+ salary);
    }
}


class Officer extends Employee{
    String specialization;
    
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phoneNumber);
        System.out.println("Address: "+address);
        printSalary();
        System.out.println("Specialization: "+specialization);
    }
}

class Manager extends Employee{
    String department;
    
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phoneNumber);
        System.out.println("Address: "+address);
        printSalary();
        System.out.println("Department: "+department);
    }
}


public class inheritance{
    public static void main(String[] args){
        
        Officer officer = new Officer();
        Manager manager = new Manager();
        
        officer.name = "Asna";
        officer.age = 12;
        officer.phoneNumber = "859475345";
        officer.address = "Abc";
        officer.salary = 50000;
        officer.specialization = "Computer Science";
        
        manager.name = "Aparna";
        manager.age = 14;
        manager.phoneNumber = "9999000909";
        manager.address = "123 St";
        manager.salary = 70000;
        manager.department = "Finance";
        
        System.out.println("Officer details");
        officer.displayInfo();
        System.out.println();
        System.out.println("Manager details");
        manager.displayInfo();
    }
}


