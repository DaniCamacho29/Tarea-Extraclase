/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraclase_daniel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


/**
 *
 * @author Daniel
 */

public class FXMLDocumentController implements Initializable {
    
    public List<List<String>> lista;
    
    @FXML
    private GridPane grid;
    
    @FXML
    private TableView tableview;
    
    @FXML
    private Button load;
    
    @FXML
    private void onLoad(ActionEvent event) throws IOException{
       
        FileChooser filechooser = new FileChooser();
        File selectedFile = filechooser.showOpenDialog((Stage) load.getScene().getWindow());
        String ruta = selectedFile.toString(); //ejemplo.csv
       
        if(!(ruta.substring(ruta.length()-4, ruta.length()).equalsIgnoreCase(".csv")) &&
               !(ruta.substring(ruta.length()-4, ruta.length()).equalsIgnoreCase(".txt"))){
            throw new IllegalArgumentException("El archivo debe ser .csv o .txt");
            
        }
        FileInputStream fstream= null;
        try {
            fstream = new FileInputStream(ruta);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        
        
        
        try{  
            //Read File Line By Line 
            if (br.readLine() == null){Alert alert = new Alert(AlertType.INFORMATION);
					
					
		alert.setTitle("Warning");
		alert.setHeaderText("El archivo seleccionado está vacío");
		alert.showAndWait();}
            else{
            while ((strLine = br.readLine()) != null){ //Filas
                
                
                lista.add(new ArrayList<String>());
                String[] aux = strLine.split(","); 
                for(int i = 0; i < aux.length; i++){ //columnas
                    lista.get(lista.size()-1).add(aux[i]);
                }
            }
        }}catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
           
        }        
        try {
            //Close the input stream
            fstream.close();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0; i < lista.size();i++){
            if(lista.size() != lista.get(i).size()){
                throw new IllegalArgumentException("La cantidad de filas debe ser igual a la cantidad de columnas");
                
            }
        }
        for (int i = 0; i < lista.size(); i++){ //For de las filas
            for(int j = 0; j < lista.get(i).size(); j++){ //For de las columnas
                grid.addColumn(j, new Label("\n" + lista.get(i).get(j) + "\t"));
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Crea un array o matriz de dos dimensiones
        lista = new ArrayList<List<String>>();
    }
}
