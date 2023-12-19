class Student{
    int rollNo;
    String name;
}

public class garbageCollector{
    public static void main(String[] args){
    
        Student std1 = new Student();
        Student std2 = new Student();
        
        std1 = null;
        std2 = null;
        
        System.gc();
        System.out.println("Garabage collection requested");
    }
}
