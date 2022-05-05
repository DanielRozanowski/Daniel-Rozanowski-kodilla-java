package com.example.kodillaspring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

    @Bean(name = "toDoList")
    public TaskList makeToDoList() {
        return new TaskList();
    }

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Bean(name = "inProgressList")
    public TaskList makeInProgressList() {
        return new TaskList();
    }

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean(name = "doneList")
    public TaskList makeDoneList() {
        return new TaskList();
    }

    @Bean
    public Board makeBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
}
