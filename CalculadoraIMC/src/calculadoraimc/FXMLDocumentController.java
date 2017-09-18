/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author gusta
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private Label resposta;

    @FXML
    private TextField peso;

    @FXML
    private TextField altura;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        double pesoDouble = Double.parseDouble(peso.getText());
        double alturaDouble = Double.parseDouble(altura.getText());
        double resultado;

        resultado = pesoDouble / (alturaDouble * alturaDouble);

        if (resultado <= 17) {
            resposta.setText("Muito abaixo do peso");
        }
        if (resultado >= 17 && resultado < 18.5) {
            resposta.setText("Abaixo do peso");
        }
        if (resultado >= 18.5 && resultado < 25) {
            resposta.setText("Peso Normal");
        }
        if (resultado >= 25 && resultado < 30) {
            resposta.setText("Acima do peso");
        }
        if (resultado >= 30 && resultado < 35) {
            resposta.setText("Obesidade I");
        }
        if (resultado >= 35 && resultado <40) {
            resposta.setText("Obesidade II(Severa)");
        }
        if (resultado >= 40) {
            resposta.setText("Obesidade III(Mórbida)");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * @return the label
     */
    public Label getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * @return the peso
     */
    public TextField getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(TextField peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public TextField getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(TextField altura) {
        this.altura = altura;
    }

}
