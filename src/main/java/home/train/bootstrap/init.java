package home.train.bootstrap;

import home.train.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;

public class init implements CommandLineRunner {

    private final StudentRepository repository;

    public init(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
