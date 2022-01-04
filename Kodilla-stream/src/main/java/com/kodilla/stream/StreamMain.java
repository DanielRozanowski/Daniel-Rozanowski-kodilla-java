package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map< Integer , ForumUser> theResultForumUserList = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getBDate(), LocalDate.now()).getYears() > 20)
                .filter(User -> User.getNumberOfPost() > 1)
                .collect(Collectors.toMap(user -> user.getId(), user -> user));
        System.out.println("# elements: " + theResultForumUserList.size());
        theResultForumUserList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);



    }
}