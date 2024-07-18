package dev.soccergameplan.soccergame.service;

import dev.soccergameplan.soccergame.dto.Match;
import dev.soccergameplan.soccergame.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    private final MatchRepository matchRepository;


    @Autowired
    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public Match getMatchById(String id) {
        return matchRepository.findById(id).orElse(null);
    }

    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    /*public Match updateMatch(String id, Match match) {
        if (matchRepository.existsById(id)) {
            match = new Match(id, match.getNotes(), match.getTitle(), match.getStartedOn(), match.getCompletedOn(),
                    match.getCountOfPlayers(), match.getLocation(), match.getPrice(),
                    match.getPlanners(), match.getPlayers());
            return matchRepository.save(match);
        }
        return null;
    }*/

    public void deleteMatch(String id) {
        matchRepository.deleteById(id);
    }
}
