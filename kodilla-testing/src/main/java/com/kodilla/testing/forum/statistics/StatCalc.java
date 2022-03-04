package com.kodilla.testing.forum.statistics;

public class StatCalc {
    private int numberOfPosts;
    private int numberOfComments;
    private int numberOfUsers;
    private double commentsPerPost;
    private double postsPerUser;
    private double commentsPerUser;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        numberOfUsers = statistics.usersNames().size();

        if (numberOfPosts != 0) {
            commentsPerPost = numberOfComments / (double)numberOfPosts;
        } else {
            commentsPerPost = 0;
        }

        if (numberOfUsers != 0) {
            postsPerUser = numberOfPosts / (double)numberOfUsers;
        } else {
            postsPerUser = 0;
        }

        if (numberOfUsers != 0) {
            commentsPerUser = numberOfComments / (double)numberOfUsers;
        } else {
            commentsPerUser = 0;
        }
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }
}