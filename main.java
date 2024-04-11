
public class main {
    public static void main(String[] args) {
        // Person ve Student sınıflarının nesnelerini oluşturalım
        Person person1 = new Person("Ali", 30);
        Student student1 = new Student("Veli", 20, "S001");
        Student student2 = new Student("Mehmet", 25, "S002");

        // Person sınıfındaki displayInfo metodu
        person1.displayInfo();

        // (overriding örneği)
        student1.displayInfo();

        // (overloading örneği)
        student1.study(); // Hiçbir konuya belirtilmemiş
        student2.study("Mathematics"); // Matematik çalışıyor
    }
}