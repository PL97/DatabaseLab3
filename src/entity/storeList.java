package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class storeList {
	//table information
	public static final String tname_formID  = "formID";
	public static final String tname_ISBN  = "ISBN";
	public static final String tname_Num  = "Num";
	//record infromation
	private String formID;
	private String ISBN;
	private String Num;
	//constructor
	public storeList(){}
	storeList(String _formID, String _ISBN, String _Num){
		setFormID(_formID);
		setISBN(_ISBN);
		setNum(_Num);
	}
	public storeList(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setFormID(rs.getString(tname_formID));
			setISBN(rs.getString(tname_ISBN));
			setNum(rs.getString(tname_Num));
		}
	}
	public String getFormID() {
		return formID;
	}
	public void setFormID(String formID) {
		this.formID = formID;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
}
