package home.train.init;

import home.train.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;

public class Startup implements CommandLineRunner {

    private final StudentRepository repository;

    public Startup(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
