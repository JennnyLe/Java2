package student;

public class PrintStudent {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setAge(20);
        Student s2 = new Student();
        s2.setName("John");
        s2.setAge(21);
        Student s3 = new Student();
        s3.setName("Radwan");
        s3.setAge(19);
        
        Student[] list = new Student[3];
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i=0; i<=list.length-1; i++)
        {
            System.out.println(list[i].getName()+" "+list[i].getAge());
            //testing fetch
        }
    }   
}
