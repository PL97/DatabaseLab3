package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class storeAccount {
	//table information
	public static final String tname_accountID  = "accountID";
	public static final String tname_libraryID  = "libraryID";
	public static final String tname_ISBN  = "ISBN";
	public static final String tname_bookNum  = "bookNum";
	public static final String tname_formID  = "formID";
	//record infromation
	private String accountID;
	private String libraryID;
	private String ISBN;
	private String bookNum;
	private String formID;
	//constructor
	public storeAccount(){}
	storeAccount(String _accountID, String _libraryID, String _ISBN, String _bookNum, String _formID){
		setAccountID(_accountID);
		setLibraryID(_libraryID);
		setISBN(_ISBN);
		setBookNum(_bookNum);
		setFormID(_formID);
	}
	public storeAccount(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setAccountID(rs.getString(tname_accountID));
			setLibraryID(rs.getString(tname_libraryID));
			setISBN(rs.getString(tname_ISBN));
			setBookNum(rs.getString(tname_bookNum));
			setFormID(rs.getString(tname_formID));
		}
	}
	public String getLibraryID() {
		return libraryID;
	}
	public void setLibraryID(String libraryID) {
		this.libraryID = libraryID;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getBookNum() {
		return bookNum;
	}
	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	public String getFormID() {
		return formID;
	}
	public void setFormID(String formID) {
		this.formID = formID;
	}
}
