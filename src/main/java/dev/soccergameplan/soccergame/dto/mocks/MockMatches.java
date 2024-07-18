package dev.soccergameplan.soccergame.dto.mocks;

import dev.soccergameplan.soccergame.dto.Match;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class MockMatches {

    public static List<Match> matches = Arrays.asList(
            new Match(
                    "Notes for match 1",
                    "Match Title 1",
                    LocalDateTime.of(2024, 7, 18, 10, 0),
                    LocalDateTime.of(2024, 7, 18, 12, 0),
                    10,
                    "Location 1",
                    100,
                    Arrays.asList("Planner 1", "Planner 2"),
                    Arrays.asList("Player 1", "Player 2")
            ),
            new Match(
                    "Notes for match 2",
                    "Match Title 2",
                    LocalDateTime.of(2024, 7, 19, 14, 0),
                    LocalDateTime.of(2024, 7, 19, 16, 0),
                    8,
                    "Location 2",
                    150,
                    Arrays.asList("Planner 3", "Planner 4"),
                    Arrays.asList("Player 3", "Player 4")
            ),
            new Match(
                    "Notes for match 3",
                    "Match Title 3",
                    LocalDateTime.of(2024, 7, 20, 18, 0),
                    LocalDateTime.of(2024, 7, 20, 20, 0),
                    12,
                    "Location 3",
                    200,
                    Arrays.asList("Planner 5", "Planner 6"),
                    Arrays.asList("Player 5", "Player 6")
            ),
            new Match(
                    "Notes for match 4",
                    "Match Title 4",
                    LocalDateTime.of(2024, 7, 21, 9, 0),
                    LocalDateTime.of(2024, 7, 21, 11, 0),
                    11,
                    "Location 4",
                    130,
                    Arrays.asList("Planner 7", "Planner 8"),
                    Arrays.asList("Player 7", "Player 8")
            ),
            new Match(
                    "Notes for match 5",
                    "Match Title 5",
                    LocalDateTime.of(2024, 7, 22, 17, 0),
                    LocalDateTime.of(2024, 7, 22, 19, 0),
                    9,
                    "Location 5",
                    120,
                    Arrays.asList("Planner 9", "Planner 10"),
                    Arrays.asList("Player 9", "Player 10")
            )
    );
}
