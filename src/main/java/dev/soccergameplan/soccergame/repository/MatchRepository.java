package dev.soccergameplan.soccergame.repository;

import dev.soccergameplan.soccergame.dto.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match, String> {
    // Gerekirse özel sorgular buraya eklenebilir

}
