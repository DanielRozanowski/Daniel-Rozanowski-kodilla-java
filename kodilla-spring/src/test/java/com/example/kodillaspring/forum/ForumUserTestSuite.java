package com.example.kodillaspring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ForumUserTestSuite  {
    @Test
    void testGetUserName() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.kodillaspring.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String result = forumUser.getUserName();

        //Then
        assertEquals("John Smith", result);
        assertNotEquals("Merry Smith", result);
    }
}
