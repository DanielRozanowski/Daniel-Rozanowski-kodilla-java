package com.kodilla.stream.forumuser;



import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate bDate;
    private final int numberOfPost;

    public ForumUser(final int id, final String userName, final char sex, final LocalDate bDate, final int numberOfPost) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.bDate = bDate;
        this.numberOfPost = numberOfPost;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBDate() {
        return bDate;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", title='" + userName + '\'' +
                ", yearOfPublication=" + sex +
                ", signature='" + bDate + '\'' +
                ", numberOfPost='" + numberOfPost + '\'' +
                '}';
    }
}
