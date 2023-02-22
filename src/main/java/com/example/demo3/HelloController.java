package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController
{
    @FXML Label counter;
    public void reduce()
    {
        counter.setText("" + (Integer.parseInt(counter.getText()) - 1));
    }
    public void increase()
    {
        counter.setText("" + (Integer.parseInt(counter.getText()) + 1));
    }
}