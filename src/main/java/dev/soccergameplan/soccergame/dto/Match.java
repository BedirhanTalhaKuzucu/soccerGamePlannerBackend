package dev.soccergameplan.soccergame.dto;

import jakarta.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Matches")
public class Match {
    @Id private String _id;
    private String notes;
    @NotEmpty private String title;
    @NotEmpty private LocalDateTime startedOn;
    @NotEmpty private LocalDateTime completedOn;
    @NotEmpty private Integer countOfPlayers;
    private String location;
    private Integer price;
    @DBRef @NotEmpty private List<User> planners;
    @DBRef private List<User> players;



    public Match() {}

    public Match(String notes, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer countOfPlayers, String location, Integer price, List<User> planners, List<User> players) {
        this.notes = notes;
        this.title = title;
        this.startedOn = startedOn;
        this.completedOn = completedOn;
        this.countOfPlayers = countOfPlayers;
        this.location = location;
        this.price = price;
        this.planners = planners;
        this.players = players;
        if (!completedOn.isAfter(startedOn)) {
           throw new IllegalArgumentException("Completed On must be after Started On");
        }
    }


    public String getId() {
        return _id;
    }

    public String getNotes() {
        return notes;
    }

    public @NotEmpty String getTitle() {
        return title;
    }

    public @NotEmpty LocalDateTime getStartedOn() {
        return startedOn;
    }

    public @NotEmpty LocalDateTime getCompletedOn() {
        return completedOn;
    }

    public @NotEmpty Integer getCountOfPlayers() {
        return countOfPlayers;
    }

    public String getLocation() {
        return location;
    }

    public Integer getPrice() {
        return price;
    }

    public  List<User> getPlanners() {
        return planners;
    }

    public List<User> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "Match{" +
                "notes='" + notes + '\'' +
                ", _id='" + _id + '\'' +
                ", title='" + title + '\'' +
                ", startedOn='" + startedOn + '\'' +
                ", completedOn='" + completedOn + '\'' +
                ", countOfPlayers=" + countOfPlayers +
                ", price=" + price +
                ", location='" + location + '\'' +
                ", planners=" + planners +
                ", players=" + players +
                '}';
    }

}
