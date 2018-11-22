package POOAPS.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import POOAPS.Entidades.Pessoa;
import POOAPS.Entidades.Retaurante;
import POOAPS.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Tela_Config_Inicial implements Initializable {

    @FXML
    private Button btnSimular;
    @FXML
    private TextField txtPratos;
    @FXML
    private Button btnVoltar;
    @FXML
    private TextField txtNumPessoas;
    @FXML
    private TextField txtSalada;
    @FXML
    private TextField txtProteina;
    @FXML
    private TextField txtCarboidrato;
    @FXML
    private TextField txtSuco;
    @FXML
    private TextField txtTempMin;
    @FXML
    private TextField txtTempMax;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void onClickbtnSimular(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/telas/Tela_Resultados.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.show();
        } catch (IOException e) {
            System.out.println("ERRO AO ABRIR TELA DE RESULTADOS");
        }
    }

    @FXML
    private void onClickbtnVoltar(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/telas/Tela_Main.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.show();
        } catch (IOException e) {
            System.out.println("ERRO AO ABRIR TELA DE INICIAL");
        }
    }

    private void logica() {

        //Inicializar variaveis para o teste
        int numPessoas = 5;
        int pratos = 100, numPratos = pratos;
        int salada = 2, numSalada = salada;
        int carboidratos = 10, numCarboidratos = carboidratos;
        int proteinas = 5, numProteinas = proteinas;
        int suco = 3, numSuco = suco;
        int tempoMin = 10;
        int tempoMax = 26;
        List<Pessoa> comendo = new ArrayList<Pessoa>();
        List comendo2 = new ArrayList();
        int matriz[][]
                = {{0, 00, 000}, {0, numPratos, pratos}, {0, numSalada, salada},
                {0, numCarboidratos, carboidratos}, {0, numProteinas, proteinas}, {0, numSuco, suco}};

        //Inicializar variaveis de controle
        int numPessoa = 100;
        int ocupado = 1;
        int livre = 0;
        int i = 0, servindo;
        int tempoTotal = 0;
        double tempoMedio = 0.0;

        //Verifica Posição E Avança Fila E Pega Comida E Repõe Comida
        while (numPessoa > 0) {
            //colocar uns OR de lista(comendo) !vazia
            //fazerum verificador para pessoas se servindo para garantir que
            //o programa não termine antes de alguem não se servir

            System.out.println("Execucao: " + i++);
            //Percorre os que tao no 'Refeitorio comendo'
            for (int j = 0; j < comendo.size(); j++) {
                //Faz os que tao no refeitorio comer
                comendo.get(j).comer();
                //Retira os que ja terminaram de comer
                if (comendo.get(j).getTempo() < 1) {
                    //comendo.remove(j);
                    //comendo2.add(1);
                }
                System.out.println("Pessoa " + j + " Tempo " + comendo.get(j).getTempo());
            }
            //Final da fila para o refeitorio comer
            if (matriz[5][0] == ocupado) {
                matriz[5][0] = livre;
                Pessoa p = new Pessoa(tempoMin, tempoMax);
                comendo.add(p);
            }

            //Principal
            for (int linha = 5; linha > 0; linha--) {
                //for (int coluna = 0; coluna < 2; coluna++) {    // P/Controle

                //Verifica Posicoes e avanca fila
                if (((matriz[linha][0] == livre) && (matriz[linha - 1][0] == ocupado))) {
                    if (matriz[linha][1] > 0) {
                        matriz[linha - 1][0] = 0;
                        matriz[linha][0] = 1;
                        matriz[linha][1] = matriz[linha][1] - 1;
                    } else if (matriz[linha][1] <= 0) {
                        //Repoe comida
                        System.out.print("sem comida  ");
                        matriz[linha][1] = matriz[linha][2];
                    }
                }
                //Inserir Pessoas na fila

                //Imprimi fila de pessoas se servindo
                System.out.println(matriz[linha][0]);
                //fecha parente do sengundo for para controle das comidas}
                //Imprimi fila de espera para se servir

            }

            if ((matriz[0][0] == livre) && (numPessoas > 0)) {
                matriz[0][0] = ocupado;
                numPessoas = numPessoas - 1;

            }

            servindo = 0;
            for (int v = 0; v < 6; v++) {

                if (matriz[v][0] == 1) {
                    servindo++;
                }

            }
            System.out.println("pegando comida " + servindo);
            System.out.println("na fila  " + numPessoas);
            System.out.println("comendo  " + comendo.size());
            tempoTotal += servindo + (comendo.size() - comendo2.size());
            //System.out.println("tempo total = "+ tempoTotal);
            numPessoa--;
        }
    }
}
