package Modulo_I.Submodulos;

import Inicio.Modelo;
import Modulo_I.InterfazDiagramasSintaxisController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author Martha
 */
public class DiagramasController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private WebView elementos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        cargarAnimacion(elementos, "elementos_Canvas");

    }

    public void cargarAnimacion(WebView wb, String file) {
        
      
                WebEngine engine = wb.getEngine();
                URL webpage = this.getClass().getResource("/Animate/" + file + ".html");
                engine.load(webpage.toString());
                wb.setCache(true);
                wb.setZoom(0.8);
            }

    @FXML
    void regresarIndice(ActionEvent event) {
        InterfazDiagramasSintaxisController.getExplicacionController().indice();
    }
    
      @FXML
    void Gramatica2(ActionEvent event) {
        InterfazDiagramasSintaxisController.getExplicacionController().gramatica(event);
    }
    
    @FXML
    void Operaciones2(ActionEvent event) {
        InterfazDiagramasSintaxisController.getExplicacionController().operaciones(event);
    }
      @FXML
    void guardarPDF(ActionEvent event) {
        Modelo.guardarArchivo("diagramas.pdf");
    }

}
