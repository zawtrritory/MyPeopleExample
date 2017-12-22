public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Tom Jones");
        
        Student student = new Student();
        student.setName("CCR");
        student.setSchool("Lexington High");
        
        InternationalStudent internationalStudent=new InternationalStudent();
        internationalStudent.setName("Bill Clington");
        internationalStudent.setSchool("Lexington High");
        internationalStudent.setCountry("Korea");
        
        Teacher teacher = new Teacher();
        teacher.setName("Rachel");
        teacher.setSubject("History");
        
        System.out.println("Person Name:"+ person.getName());
        System.out.println("Sudent Name:"+ student.getName());
        System.out.println("InternationalStudent Name:"+ internationalStudent.getName());
        System.out.println("Teacher Name:"+ teacher.getName());
        
        
}
    
}
