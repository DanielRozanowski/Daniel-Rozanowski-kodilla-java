package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum() {
        theForumList.add(new ForumUser(1, "Angela Dele", 'F',
                LocalDate.of(2003,12,03), 10));
        theForumList.add(new ForumUser(2, "Justin Biber", 'M',
                LocalDate.of(2012, 03, 02), 20));
        theForumList.add(new ForumUser(3, "Hamanta Halves", 'M',
                LocalDate.of(2000, 03, 02), 30));
        theForumList.add(new ForumUser(4, "JJ Harison", 'M',
                LocalDate.of(2001, 03, 02), 40));
        theForumList.add(new ForumUser(5, "Gangsters and kings", 'M',
                LocalDate.of(2002, 03, 02), 50));
        theForumList.add(new ForumUser(6, "Mona von Dona", 'F',
                LocalDate.of(2018, 03, 02), 60));
        theForumList.add(new ForumUser(7, "Enrique Gonzalez", 'M',
                LocalDate.of(2020, 03, 02), 70));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumList);
    }
}
