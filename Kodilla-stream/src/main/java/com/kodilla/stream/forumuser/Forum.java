package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<Forum> theForumList = new ArrayList<>();

    public Forum() {
        theForumList.add(new ForumUser(1, "Angela Dele", 'F',
                2003, 10));
        theForumList.add(new ForumUser(2, "Justin Biber", 'M',
                2012, 20));
        theForumList.add(new ForumUser(3, "Hamanta Halves", 'F',
                2001, 30));
        theForumList.add(new ForumUser(4, "JJ Harison", 'M',
                2015, 40));
        theForumList.add(new ForumUser(5, "Gangsters and kings", 'M',
                2007, 50));
        theForumList.add(new ForumUser(6, "Mona von Dona", 'F',
                2007, 60));
        theForumList.add(new ForumUser(7, "Enrique Gonzalez", 'M',
                1900, 70));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumList);
    }
}
