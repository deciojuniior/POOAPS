package POOAPS.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import POOAPS.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class Tela_Main implements Initializable {

    @FXML
    private Button btnIniciarSimulacao;
    @FXML
    private Button btnConsultarResultados;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onClickbtnIniciarSimulacao(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/telas/Tela_Config_Inicial.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.show();
        } catch (IOException e) {
            System.out.println("ERRO AO ABRIR TELA DE CONFIG INICIAL");
        }
    }

    @FXML
    private void onClickbtnConsultarResultados(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/telas/Tela_Consulta_Resultados.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.show();
        } catch (IOException e) {
            System.out.println("ERRO AO ABRIR TELA DE RESULTADOS");
        }
    }

}
