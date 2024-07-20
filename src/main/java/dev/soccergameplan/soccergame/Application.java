package dev.soccergameplan.soccergame;

import dev.soccergameplan.soccergame.repository.MatchRepository;
import dev.soccergameplan.soccergame.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@SpringBootApplication
@EnableMongoRepositories
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext contex = SpringApplication.run(Application.class, args);

        log.info("Application started now");
    }

    @Bean
    CommandLineRunner runner(MatchRepository matchRepository, UserRepository userRepository) {
        return args -> {

//            List<User> users = MockUsers.users;
//            List<Match> matches = MockMatches.matches;
//            userRepository.saveAll(users);

//            matchRepository.saveAll(matches);

       /*     List<User> users = userRepository.findAll();

            List<Match> matches = MockMatches.matches(users, users);
            matchRepository.saveAll(matches);
            log.info("Sample matches added to the database.");*/




//            List<Match> matches = matchRepository.findAll();
//            System.out.println(matches);


            log.info("DataBase is ready!!!!!!!!!");
        };
    }


}
