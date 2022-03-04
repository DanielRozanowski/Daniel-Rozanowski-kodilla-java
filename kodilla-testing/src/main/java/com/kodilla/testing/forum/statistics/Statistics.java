package com.kodilla.testing.forum.statistics;

import java.util.List;

interface Statistics {
    List<String> usersNames();
    int postsCount();
    int commentsCount();
}
