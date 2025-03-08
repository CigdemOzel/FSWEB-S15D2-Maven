package org.example;

import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks = new HashSet<>();
        Set<Task> bobsTasks = new HashSet<>();
        Set<Task> carolsTasks = new HashSet<>();
        Set<Task> unassignedTasks = new HashSet<>();
        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks,unassignedTasks);

    }
}