package home.train.bootstrap;

import home.train.model.Status;
import home.train.model.Student;
import home.train.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class init implements CommandLineRunner {

    private final StudentRepository repository;

    public init(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student= new Student();
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setStatus(Status.ACTIVE);

        Student student1= new Student();
        student1.setFirstName("mary");
        student1.setLastName("public");
        student1.setStatus(Status.INACTIVE);

        repository.save(student);
        repository.save(student1);

        repository.findAll().forEach(s-> System.out.println(s));


    }
}
