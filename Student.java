
// inheritance
class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }

    // Overloading
    public void study() {
        System.out.println(name + " fizik çalışıyor.");
    }

    public void study(String subject) {
        System.out.println(name +  subject + " çalışıyor");
    }
}