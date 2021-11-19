package com.example.todolist;

import datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;
    @FXML
    private ListView todoListView;

    public void initialize() {
        TodoItem item1 = new TodoItem("Fix the sink",
                "Broken fasset in the toilet",
                LocalDate.of(2021, Month.DECEMBER, 2));
        TodoItem item2 = new TodoItem("Doctors appointment",
                "See Dr John at seal street",
                LocalDate.of(2021, Month.DECEMBER, 22));
        TodoItem item3 = new TodoItem("Fix the bathroom",
                "paint job",
                LocalDate.of(2021, Month.DECEMBER, 8));
        TodoItem item4 = new TodoItem("Pick up laundry",
                "Clothes must be ready",
                LocalDate.of(2021, Month.NOVEMBER, 21));
        TodoItem item5 = new TodoItem("Complete report",
                "Work report due in this date",
                LocalDate.of(2021, Month.NOVEMBER, 29));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }

    @FXML
    public void handleClickListView(){
        TodoItem item = (TodoItem) todoListView.getSelectionModel().getSelectedItem();
//        System.out.println("The selected item is: " + item);
    }










}