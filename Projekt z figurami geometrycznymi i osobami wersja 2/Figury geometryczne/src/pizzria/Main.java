package pizzria;
import com.company.Student;

public class Main {

    public static void main(String[] args) {

        Pizza piz = new Pizza("Vege", Rozmiar.Duza);

        Student stud = new Student("Arek","Nowicki","1991-08-11",3,"informatyka");

        Para<Student,Pizza> para = new Para<>(stud,piz);

    }
}