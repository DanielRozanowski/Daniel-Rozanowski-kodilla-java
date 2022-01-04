package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        String theResultForumUserList = theForum.getUserList().stream()
                .filter(User -> User.getSex() == 'M')
                .filter(User -> User.getBDate() > 20)
                .filter(User -> User.getNumberOfPost() > 1)
                .collect(Collectors.toMap(User::getId, User -> User));
        System.out.println("# elements: " + theResultForumUserList.size());
        theResultForumUserList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);



    }
}