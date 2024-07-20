package dev.soccergameplan.soccergame.dto;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("Users")
public class User {
    @Id private String _id;
    @NotEmpty private String userName;
    @NotEmpty private String pasword;
    private String position;
    private Integer score;

    public User(String userName, String pasword, String position, Integer score) {
        this.userName = userName;
        this.pasword = pasword;
        this.position = position;
        this.score = score;
    }


    public String getId() {
        return _id;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public @NotEmpty String getUserName() {
        return userName;
    }

    public void setUserName(@NotEmpty String userName) {
        this.userName = userName;
    }

    public @NotEmpty String getPasword() {
        return pasword;
    }

    public void setPasword(@NotEmpty String pasword) {
        this.pasword = pasword;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void update(User user) {
        if (user.getUserName() != null && !user.getUserName().isEmpty()) {
            this.userName = user.getUserName();
        }
        if (user.getPasword() != null && !user.getPasword().isEmpty()) {
            this.pasword = user.getPasword();
        }
        if (user.getPosition() != null && !user.getPosition().isEmpty()) {
            this.position = user.getPosition();
        }
        if (user.getScore() != null) {
            this.score = user.getScore();
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "_id='" + _id + '\'' +
                ", userName='" + userName + '\'' +
                ", pasword='" + pasword + '\'' +
                ", position='" + position + '\'' +
                ", score=" + score +
                '}';
    }
}
