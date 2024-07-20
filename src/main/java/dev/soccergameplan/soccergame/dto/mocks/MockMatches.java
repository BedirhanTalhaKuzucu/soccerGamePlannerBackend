package dev.soccergameplan.soccergame.dto.mocks;

import dev.soccergameplan.soccergame.dto.Match;
import dev.soccergameplan.soccergame.dto.User;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class MockMatches {


    public static List<Match> matches(List<User> players, List<User> planners){
        return Arrays.asList(
                new Match(
                        "notesssss",
                        "Match Title 1",
                        LocalDateTime.of(2024, 7, 18, 10, 0),
                        LocalDateTime.of(2024, 7, 18, 12, 0),
                        10,
                        "Location 1",
                        100,
                        planners,
                        players
                ),
                new Match(
                        "Notes for match 2",
                        "Match Title 2",
                        LocalDateTime.of(2024, 7, 19, 14, 0),
                        LocalDateTime.of(2024, 7, 19, 16, 0),
                        8,
                        "Location 2",
                        150,
                        planners,
                        players
                ),
                new Match(
                        "Notes for match 3",
                        "Match Title 3",
                        LocalDateTime.of(2024, 7, 20, 18, 0),
                        LocalDateTime.of(2024, 7, 20, 20, 0),
                        12,
                        "Location 3",
                        200,
                        planners,
                        players
                )
        );
    }
}
