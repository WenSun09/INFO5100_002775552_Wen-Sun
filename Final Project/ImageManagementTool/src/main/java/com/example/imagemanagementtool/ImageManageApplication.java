package com.example.imagemanagementtool;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.embed.swing.SwingFXUtils;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;
import java.awt.Image;

public class ImageManageApplication extends Application {
    // GUI elements
    private Button btnUpload;
    private GridPane imagesPane;
    private GridPane root;
    private Stage mainStage;

    private void iniElement() {
        // create upload button
        btnUpload = new Button("Upload Images");
        btnUpload.setPrefWidth(100);
        btnUpload.setOnAction(event -> {
            try {
                uploadAction();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        // create uploaded images GridPane
        imagesPane = new GridPane();
        imagesPane.setAlignment(Pos.TOP_CENTER);
        imagesPane.setHgap(10);
        imagesPane.setVgap(10);

        // create root GridPane
        root = new GridPane();
        root.setAlignment(Pos.TOP_CENTER);
        root.setHgap(10);
        root.setVgap(10);
    }

    private void uploadAction() throws IOException {
        // create file chooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select one or more images");

        imagesPane.getChildren().clear();
        List<File> fileList = fileChooser.showOpenMultipleDialog(mainStage);
        int row = 0;
        for (File file : fileList) {
            // display thumbnail
            MyImage image = new MyImage(file);
            ImageView imageView = new ImageView();
            imageView.setImage(SwingFXUtils.toFXImage(image.getThumbnail(), null));
            imagesPane.add(imageView, 0, row, 1, 3);

            // display properties
            Label labelWidth = new Label("Width : " + image.getWidth());
            Label labelHeight = new Label("Height : " + image.getHeight());
            Label labelFormat = new Label("Format : "+ image.getImageFormat());
            imagesPane.add(labelWidth, 1, row, 1, 1);
            imagesPane.add(labelHeight, 1, row+1, 1, 1);
            imagesPane.add(labelFormat, 1, row+2, 1, 1);

            // convert format button
            Button btnConvertJPG = new Button("Convert to JPG");
            btnConvertJPG.setOnAction(event -> {
                try {
                    image.convertFormat("jpg");
                    labelFormat.setText("Format : jpg");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            imagesPane.add(btnConvertJPG, 2, row, 1, 1);

            Button btnConvertPNG = new Button("Convert to PNG");
            btnConvertPNG.setOnAction(event -> {
                try {
                    image.convertFormat("png");
                    labelFormat.setText("Format : png");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            imagesPane.add(btnConvertPNG, 2, row+1, 1, 1);

            // download button
            Button btnDownload = new Button("Download");
            btnDownload.setOnAction(event -> {
                try {
                    downloadImage(image);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            imagesPane.add(btnDownload, 2, row+2, 1, 1);
            row += 3;
        }
    }

    private void downloadImage(MyImage dlImage) throws IOException {
        // create directory chooser
        DirectoryChooser dirChooser = new DirectoryChooser();
        dirChooser.setTitle("Select a folder");

        // read download image
        File imageFile = new File(dlImage.getImageName());
        BufferedImage image = ImageIO.read(imageFile);

        // choose folder
        File selectedDir = dirChooser.showDialog(mainStage);
        String selectedDirPath = selectedDir.getAbsolutePath();

        // save file
        File downloadedFile = new File(selectedDirPath + "/" + dlImage.getImageName());
        ImageIO.write(image, dlImage.getImageFormat(), downloadedFile);
    }

    @Override
    public void start(Stage stage) throws IOException {
        try {
            iniElement();
            root.add(btnUpload, 0, 0, 1, 1);
            root.add(imagesPane, 0, 1, 1, 1);

            Scene scene = new Scene(root, 800, 500);
            mainStage = stage;
            stage.setTitle("FileChooser");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}