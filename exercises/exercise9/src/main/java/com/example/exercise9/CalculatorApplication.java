package com.example.exercise9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
    private TextField num1;
    private TextField num2;
    private Button btnAdd;
    private Button btnSub;
    private Button btnMultiply;
    private Button btnDivide;
    private Label labelAnswer;
    private Button btnClear;
    private static final String defaultAnswerText = "display answer";

    private void initElements() {
        num1 = new TextField();
        num2 = new TextField();

        btnAdd = new Button("+");
        btnSub = new Button("-");
        btnMultiply = new Button("*");
        btnDivide = new Button("/");

        labelAnswer = new Label(defaultAnswerText);
        labelAnswer.setAlignment(Pos.CENTER);

        btnClear = new Button("Clear");
    }

    private void setWidths() {
        num1.setPrefWidth(70);
        num2.setPrefWidth(70);

        btnAdd.setPrefWidth(70);
        btnSub.setPrefWidth(70);
        btnDivide.setPrefWidth(70);
        btnMultiply.setPrefWidth(70);

        labelAnswer.setPrefWidth(150);
        btnClear.setPrefWidth(150);
    }

    private void setOnActions() {
        btnClear.setOnAction(event -> clearAction());
        btnAdd.setOnAction(event -> operationAction(event));
        btnSub.setOnAction(event -> operationAction(event));
        btnMultiply.setOnAction(event -> operationAction(event));
        btnDivide.setOnAction(event -> operationAction(event));
    }

    private void clearAction() {
        num1.setText("");
        num2.setText("");
        labelAnswer.setText(defaultAnswerText);
    }

    private void operationAction(ActionEvent event) {
        try {
            int number1 = Integer.parseInt(num1.getText());
            int number2 = Integer.parseInt(num2.getText());
            int answer = 0;
            String symbol = "";
            if (event.getSource() == btnAdd) {
                answer = number1 + number2;
                symbol = " + ";
            } else if (event.getSource() == btnSub) {
                answer = number1 - number2;
                symbol = " - ";
            } else if (event.getSource() == btnMultiply) {
                answer = number1 * number2;
                symbol = " * ";
            } else {
                answer = number1 / number2;
                symbol = " / ";
            }
            labelAnswer.setText("" + number1 + symbol + number2 + " = " + answer);
        } catch (NumberFormatException e) {
            labelAnswer.setText("Input is not a number.");
        } catch (ArithmeticException e) {
            labelAnswer.setText("Can't be divided by Zero.");
        } catch (Exception e) {
            labelAnswer.setText("Error!");
        }
    }

    private GridPane createGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // add text field
        gridPane.add(num1, 0, 0);
        gridPane.add(num2, 1, 0);

        // add four function button
        gridPane.add(btnAdd, 0, 1);
        gridPane.add(btnSub, 1, 1);
        gridPane.add(btnMultiply, 0, 2);
        gridPane.add(btnDivide, 1, 2);

        // add label answer
        gridPane.add(labelAnswer, 0, 3, 2, 1);

        // add clear button
        gridPane.add(btnClear, 0, 4, 2, 1);

        return gridPane;
    }


    @Override
    public void start(Stage stage) throws IOException {
        initElements();
        setWidths();
        setOnActions();
        GridPane gridPane = createGridPane();
        Scene scene = new Scene(gridPane, 300, 250);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}