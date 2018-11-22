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
import javafx.scene.control.Label;

public class Tela_Resultado implements Initializable {

    @FXML
    private Button btnSalvar;
    @FXML
    private Label lblNumPessoas;
    @FXML
    private Label lblPrato;
    @FXML
    private Label lblSalada;
    @FXML
    private Label lblProteina;
    @FXML
    private Label lblCarboidrato;
    @FXML
    private Label lblSuco;
    @FXML
    private Label lblTempMin;
    @FXML
    private Label lblTempMax;
    @FXML
    private Button btnVoltar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Todo
    }

    //*
    @FXML//Original
    private void onClickbtnSalvar(ActionEvent event){

    }

    /*Teste do Banco
    @FXML   //Salvar com DAO //Inoperante
    private void onClickbtnSalvar(ActionEvent event) {        
        Endereco endereco = new Endereco();
        endereco.setBairro("Centro");
        endereco.setNumero(666);
        endereco.setRua("Ae Porra");
        
        DAOEndereco dao = new DAOEndereco();
        dao.salvar(endereco);        
    }
    //
    @FXML   //Com Insert
    private void onClickbtnSalvar(ActionEvent event) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        Conexao conexao = new Conexao();
        Statement stm = conexao.getConnection().createStatement();
        stm.execute("INSERT INTO endereco (rua, numero, bairro) VALUES ('Deu',999,'N como queria');");
    }*/

    @FXML
    private void onClickbtnVoltar(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Telas/Tela_Config_Inicial.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.show();
        } catch (IOException e) {
            System.out.println("ERRO AO ABRIR TELA DE CONFIG INICIAL");
        }
    }

}
