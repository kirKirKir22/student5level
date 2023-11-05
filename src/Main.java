public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Kir", 31);
        Student student2 = new Student("Kir", 30);

        if (student1.equals(student2)){
            System.out.println("Студенты равны");
        }else {
            System.out.println("Студенты не равны");

        }
        if (student1.hashCode()==student2.hashCode()){
            System.out.println("Студенты равны");
        }else {
            System.out.println("Студенты не равны");
        }

    }
}

