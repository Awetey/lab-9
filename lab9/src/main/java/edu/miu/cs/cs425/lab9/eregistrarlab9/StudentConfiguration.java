//package edu.miu.cs.cs425.lab9.eregistrarlab9;
//
//
//import edu.miu.cs.cs425.lab9.eregistrarlab9.Model.Student;
//import edu.miu.cs.cs425.lab9.eregistrarlab9.repository.StudentRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Configuration
//public class StudentConfiguration {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository){
//        return args -> {
//            Student s1 = new Student("00-123-4","siku", "Goi", "Tesfie", 3.99, LocalDate.of(2019, 2, 15), "yes");
//            //Student s2 = new Student("00-115-5","Adam", "Kah", "Zeka", 3.99, LocalDate.of(2019, 2, 15), "no");
//            // Student s2 = new Student(1102L, "Yonas ", LocalDate.of(1981, 1, 1), "john@gmail.com");
//            //Student s3 = new Student(1103L, "Adam", LocalDate.of(1999, 2, 8), "jossy@gmail.com");
//
//            repository.saveAll(List.of(s1));
//        };
//
//    }
//}
//
