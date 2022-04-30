package ma.benaicha.patientsmvc;

import ma.benaicha.patientsmvc.entities.Patient;
import ma.benaicha.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null,"Hassan",new Date(),false,15));
            patientRepository.save(
                    new Patient(null,"Sami",new Date(),true,120));
            patientRepository.save(
                    new Patient(null,"Youssef",new Date(),false,56));
            patientRepository.save(
                    new Patient(null,"Saad",new Date(),true,87));
            patientRepository.findAll().forEach(p ->{
                System.out.println(p.getNom());

            });
        };
    }
}
