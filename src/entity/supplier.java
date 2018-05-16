package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class supplier {
	public static final String tname_supplierID  = "supplierID";
	public static final String tname_supplierName  = "supplierName";
	public static final String tname_phoneNumber  = "phoneNumber";
	//record infromation
	private String supplierID;
	private String supplierName;
	private String phoneNumber;
	//constructor
	public supplier(){}
	supplier(String _supplierID, String _supplierName, String _phoneNumber){
		setSupplierID(_supplierID);
		setSupplierName(_supplierName);
		setPhoneNumber(_phoneNumber);
	}
	public supplier(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setSupplierID(rs.getString(tname_supplierID));
			setSupplierName(rs.getString(tname_supplierName));
			setPhoneNumber(rs.getString(tname_phoneNumber));
		}
	}
	public String getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
