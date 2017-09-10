package calculadorademédia;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculadoraDeMédia extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {

        VBox orquestradorVbox = new VBox();
        HBox orquestradorm1 = new HBox();
        HBox orquestradorm2 = new HBox();
        HBox orquestradorm3 = new HBox();
        orquestradorVbox.setSpacing(5);
        orquestradorVbox.setStyle("-fx-background-color: #babaca;");
        
        Label lbl1 = new Label("Sua nota da m1:");
        TextField m1 = new TextField("0");
        Label lbl2 = new Label("Sua nota da m2:");
        TextField m2 = new TextField("0");
        Label lbl3 = new Label("Sua nota da m3:");
        TextField m3 = new TextField("0");
        Label res = new Label("Pontos Restantes para passar: ");
        Button botao = new Button("Calcular");
        botao.setOnAction( new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                String mediam1 = m1.getText();
                String mediam2 = m2.getText();
                String mediam3 = m3.getText();
                double m1EmDouble = Double.parseDouble(mediam1);
                double m2EmDouble = Double.parseDouble(mediam2);
                double m3EmDouble = Double.parseDouble(mediam3);
                double Resultado = 17.25 - (m1EmDouble + m2EmDouble + m3EmDouble);
                res.setText( "Pontos Restantes para passar: "+Resultado);
            }
        } );
        
        orquestradorm1.getChildren().add(lbl1);
        orquestradorm1.getChildren().add(m1);
        
        orquestradorm2.getChildren().add(lbl2);
        orquestradorm2.getChildren().add(m2);
        
        orquestradorm3.getChildren().add(lbl3);
        orquestradorm3.getChildren().add(m3);
        
        orquestradorVbox.getChildren().add(orquestradorm1);
        orquestradorVbox.getChildren().add(orquestradorm2);
        orquestradorVbox.getChildren().add(orquestradorm3);
        orquestradorVbox.getChildren().add(res);
        orquestradorVbox.getChildren().add(botao);

        Scene cena = new Scene(orquestradorVbox, 300, 250);

        stage.setScene(cena);
        stage.setTitle("Calculadora de Média");
        stage.show();

    }

}
