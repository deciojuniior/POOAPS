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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class Tela_Consulta_Resultados implements Initializable {

    @FXML
    private TableView<?> tvTableView;
    @FXML
    private TableColumn<?, ?> tbNumPessoas;
    @FXML
    private TableColumn<?, ?> tcPratos;
    @FXML
    private TableColumn<?, ?> tcSalada;
    @FXML
    private TableColumn<?, ?> tcCarboidrato;
    @FXML
    private TableColumn<?, ?> tcProteina;
    @FXML
    private TableColumn<?, ?> tcSuco;
    @FXML
    private TableColumn<?, ?> tcTempMin;
    @FXML
    private TableColumn<?, ?> tcTempMedio;
    @FXML
    private Button btnVoltar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickbtnVoltar(ActionEvent event) {
                        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Telas/Tela_Main.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.show();
        } catch (IOException e) {
            System.out.println("ERRO AO ABRIR TELA INICIAL");
        }
    }
    
}
