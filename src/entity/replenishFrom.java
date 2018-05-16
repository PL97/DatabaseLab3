package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class replenishFrom {
	//table information
	public static final String tname_formID  = "formID";
	public static final String tname_libraryID  = "libraryID";
	public static final String tname_supplierID  = "supplierID";
	//record infromation
	private String formID;
	private String libraryID;
	private String supplierID;
	//constructor
	public replenishFrom(){}
	replenishFrom(String _formID, String _libraryID, String _supplierID){
		setFormID(_formID);
		setLibraryID(_libraryID);
		setSupplierID(_supplierID);
	}
	public replenishFrom(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setFormID(rs.getString(tname_formID));
			setLibraryID(rs.getString(tname_libraryID));
			setSupplierID(rs.getString(tname_supplierID));
		}
	}
	public String getFormID() {
		return formID;
	}
	public void setFormID(String formID) {
		this.formID = formID;
	}
	public String getLibraryID() {
		return libraryID;
	}
	public void setLibraryID(String libraryID) {
		this.libraryID = libraryID;
	}
	public String getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
}
