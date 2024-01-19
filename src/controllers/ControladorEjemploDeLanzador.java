package controllers;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


import javafx.scene.control.Tab;

public class ControladorEjemploDeLanzador {

    @FXML
    private Button btnLanzarGraficos;

    @FXML
    private Button btnLanzarProductos;

    @FXML
    private Button btnLanzarSecciones;

    @FXML
    private Button btnLanzarTablaProductos;

    @FXML
    private Tab tabGra;

    @FXML
    private Tab tabPro;

    @FXML
    private Tab tabSec;

    @FXML
    void lanzarGra(ActionEvent event) throws SQLException {
		ConnectionDB con = new ConnectionDB();
		try {
			JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource("Graficos.jasper"));
	        JasperPrint jprint = JasperFillManager.fillReport(report, null, con.getConexion());
	        JasperViewer viewer = new JasperViewer(jprint, false);
	        viewer.setVisible(true);
		} catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Ha ocurrido un error");
            alert.showAndWait();
            e.printStackTrace();
        }
    }

    @FXML
    void lanzarPro(ActionEvent event) throws SQLException {
    	ConnectionDB con = new ConnectionDB();
		try {
			JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource("Productos.jasper"));
	        JasperPrint jprint = JasperFillManager.fillReport(report, null, con.getConexion());
	        JasperViewer viewer = new JasperViewer(jprint, false);
	        viewer.setVisible(true);
		} catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Ha ocurrido un error");
            alert.showAndWait();
            e.printStackTrace();
        }

    }

    @FXML
    void lanzarSec(ActionEvent event) throws SQLException {
    	ConnectionDB con = new ConnectionDB();
		try {
			JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource("Seccion.jasper"));
	        JasperPrint jprint = JasperFillManager.fillReport(report, null, con.getConexion());
	        JasperViewer viewer = new JasperViewer(jprint, false);
	        viewer.setVisible(true);
		} catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Ha ocurrido un error");
            alert.showAndWait();
            e.printStackTrace();
        }

    }

    @FXML
    void lanzarTabPro(ActionEvent event) throws SQLException {
    	ConnectionDB con = new ConnectionDB();
		try {
			JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource("TablaProductos.jasper"));
	        JasperPrint jprint = JasperFillManager.fillReport(report, null, con.getConexion());
	        JasperViewer viewer = new JasperViewer(jprint, false);
	        viewer.setVisible(true);
		} catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Ha ocurrido un error");
            alert.showAndWait();
            e.printStackTrace();
        }

    }

}
