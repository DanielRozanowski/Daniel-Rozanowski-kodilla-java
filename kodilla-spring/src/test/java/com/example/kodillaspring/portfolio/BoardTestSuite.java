package com.example.kodillaspring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Task toDoList");
        board.getInProgressList().addTask("Task inProgressList");
        board.getDoneList().addTask("Task doneList");

        boolean resultToDoList = board.getToDoList().getTasks().contains("Task toDoList");
        boolean resultInProgressList = board.getInProgressList().getTasks().contains("Task inProgressList");
        boolean resultDoneList = board.getDoneList().getTasks().contains("Task doneList");

        //Then
        Assertions.assertEquals(true, resultToDoList);
        Assertions.assertEquals(true, resultInProgressList);
        Assertions.assertEquals(true, resultDoneList);
    }

}
