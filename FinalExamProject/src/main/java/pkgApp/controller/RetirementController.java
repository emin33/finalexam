package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtSaveEachMonth;
	@FXML
	private TextField txtYearsToWork;
	@FXML
	private TextField txtAnnualReturnW;
	@FXML
	private TextField txtWhatSave;
	@FXML
	private TextField txtYearsRetired;
	@FXML
	private TextField txtAnnualReturnR;
	@FXML
	private TextField txtRequiredIncome;
	@FXML
	private TextField txtMonthlySSI;
	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {	
		txtSaveEachMonth.setEditable(false);
		txtWhatSave.setEditable(false);
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		txtSaveEachMonth.clear();
		txtYearsToWork.clear();
		txtAnnualReturnW.clear();
		txtWhatSave.clear();
		txtYearsRetired.clear();
		txtAnnualReturnR.clear();
		txtRequiredIncome.clear();
		txtMonthlySSI.clear();
		System.out.println("Entries Cleared");
		
		//	TODO: Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		try {
			Retirement r1 = new Retirement(Integer.parseInt(txtYearsToWork.getText()), Integer.parseInt(txtAnnualReturnW.getText()), 
				Integer.parseInt(txtYearsRetired.getText()), Integer.parseInt(txtAnnualReturnR.getText()), 
				Integer.parseInt(txtRequiredIncome.getText()), Integer.parseInt(txtMonthlySSI.getText()));
			txtSaveEachMonth.setText("" + r1.AmountToSave());
			txtWhatSave.setText("" + r1.TotalAmountSaved());
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Not number");
            alert.setHeaderText("No Number Entered");
            alert.setContentText("Please enter a proper number");

            alert.showAndWait();
		}
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
	}
	
}
