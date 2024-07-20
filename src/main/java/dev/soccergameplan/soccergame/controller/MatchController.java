package dev.soccergameplan.soccergame.controller;

import dev.soccergameplan.soccergame.dto.Match;
import dev.soccergameplan.soccergame.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping("/all")
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @GetMapping("/{id}")
    public Match getMatchById(@PathVariable String id) {
        return matchService.getMatchById(id);
    }

    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }

    /*@PutMapping("/{id}")
    public Match updateMatch(@PathVariable String id, @RequestBody Match match) {
        return matchService.updateMatch(id, match);
    }*/

    @DeleteMapping("/{id}")
    public void deleteMatch(@PathVariable String id) {
        matchService.deleteMatch(id);
    }
}
