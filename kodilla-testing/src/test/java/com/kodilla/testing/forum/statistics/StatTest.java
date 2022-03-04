package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatTest {
    @BeforeEach
    public void before() {
        System.out.println("Test case starts.");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case ends.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("All tests done.");
    }

    @Test
    public void test0Posts() {
        //Given
        StatCalc calculator = new StatCalc();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculator.getNumberOfPosts());
        assertEquals(10, calculator.getNumberOfComments());
        assertEquals(3, calculator.getNumberOfUsers());
        assertEquals(0, calculator.getCommentsPerPost());
        assertEquals(0, calculator.getPostsPerUser());
        assertEquals(3.33, calculator.getCommentsPerUser(), 0.01);
    }

    @Test
    public void test1000Posts() {
        //Given
        StatCalc calculator = new StatCalc();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(999);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(999, calculator.getNumberOfPosts());
        assertEquals(0, calculator.getNumberOfComments());
        assertEquals(3, calculator.getNumberOfUsers());
        assertEquals(0, calculator.getCommentsPerPost());
        assertEquals(333, calculator.getPostsPerUser());
        assertEquals(0, calculator.getCommentsPerUser());
    }

    @Test
    public void test0Comments() {
        //Given
        StatCalc calculator = new StatCalc();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(9);
        when(statisticsMock.commentsCount()).thenReturn(9);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(9, calculator.getNumberOfPosts());
        assertEquals(9, calculator.getNumberOfComments());
        assertEquals(3, calculator.getNumberOfUsers());
        assertEquals(1, calculator.getCommentsPerPost());
        assertEquals(3, calculator.getPostsPerUser());
        assertEquals(3, calculator.getCommentsPerUser());
    }

    @DisplayName("Tests what if there are more posts than comments.")
    @Test
    public void testLessCommants() {
        //Given
        StatCalc calculator = new StatCalc();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(6);
        when(statisticsMock.commentsCount()).thenReturn(3);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(6, calculator.getNumberOfPosts());
        assertEquals(3, calculator.getNumberOfComments());
        assertEquals(3, calculator.getNumberOfUsers());
        assertEquals(0.5, calculator.getCommentsPerPost());
        assertEquals(2, calculator.getPostsPerUser());
        assertEquals(1, calculator.getCommentsPerUser());
    }

    @DisplayName("Tests what if there are more comments than posts.")
    @Test
    public void testMoreCommants() {
        //Given
        StatCalc calculator = new StatCalc();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(6);
        when(statisticsMock.commentsCount()).thenReturn(12);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(6, calculator.getNumberOfPosts());
        assertEquals(12, calculator.getNumberOfComments());
        assertEquals(3, calculator.getNumberOfUsers());
        assertEquals(2, calculator.getCommentsPerPost());
        assertEquals(2, calculator.getPostsPerUser());
        assertEquals(4, calculator.getCommentsPerUser());
    }

    @DisplayName("Tests if total users == 0")
    @Test
    public void test0Users() {
        //Given
        StatCalc calculator = new StatCalc();
        Statistics statisticsMock = mock(Statistics.class); //to w nawiasie to kontrakt
        when(statisticsMock.postsCount()).thenReturn(2);  //nieskonfigurowany mock zwraca puste wartosci
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> userList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2, calculator.getNumberOfPosts());
        assertEquals(10, calculator.getNumberOfComments());
        assertEquals(0, calculator.getNumberOfUsers());
        assertEquals(5, calculator.getCommentsPerPost());
        assertEquals(0, calculator.getPostsPerUser());
        assertEquals(0, calculator.getCommentsPerUser());
    }

    @Test
    public void test100Users() {
        //Given
        StatCalc calculator = new StatCalc();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> userList = new ArrayList<>();
        for (int i=0; i< 100; i++){
            userList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        calculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(50, calculator.getNumberOfPosts());
        assertEquals(10, calculator.getNumberOfComments());
        assertEquals(100, calculator.getNumberOfUsers());
        assertEquals(0.2, calculator.getCommentsPerPost());
        assertEquals(0.5, calculator.getPostsPerUser());
        assertEquals(0.1, calculator.getCommentsPerUser());
    }
}