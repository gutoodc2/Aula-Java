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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculadoraDeMédia extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {

        VBox orquestrador = new VBox();
        orquestrador.setSpacing(5);
        TextField m1 = new TextField("0");
        TextField m2 = new TextField("0");
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

        orquestrador.getChildren().add(m1);
        orquestrador.getChildren().add(m2);
        orquestrador.getChildren().add(m3);
        orquestrador.getChildren().add(res);
        orquestrador.getChildren().add(botao);

        Scene cena = new Scene(orquestrador, 300, 200);

        stage.setScene(cena);
        stage.setTitle("Calculadora de Média");
        stage.show();

    }

}
