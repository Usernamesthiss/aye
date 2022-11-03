package um.test3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class L01Q04 extends Application {

    @Override
    public void start(Stage stage) {
    Scene scene = new Scene(new Group());
        stage.setTitle("Product A");
        stage.setWidth(500);
        stage.setHeight(500);
 
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("January ", 2500),
                new PieChart.Data("February", 1600),
                new PieChart.Data("March", 2000),
                new PieChart.Data("April", 2700),
                new PieChart.Data("May",3200 ),
                new PieChart.Data("Jun",800 ));
             final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Total Sales of Product A in Year 2016");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
