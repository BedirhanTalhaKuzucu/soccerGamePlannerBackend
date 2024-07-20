package dev.soccergameplan.soccergame.dto.mocks;

import dev.soccergameplan.soccergame.dto.User;

import java.util.Arrays;
import java.util.List;

public class MockUsers {

    public static List<User> users = Arrays.asList(
            new User("username1", "password1", "FC", 88),
            new User("username2", "password2", "FC", 90),
            new User("username3", "password3", "FC", 95)
    );
}
