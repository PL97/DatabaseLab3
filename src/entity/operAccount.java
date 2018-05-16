package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class operAccount {
	//table information
	public static final String tname_ISBN  = "ISBN";
	public static final String tname_readerID  = "readerID";
	public static final String tname_workerID  = "workerID";
	public static final String tname_operType  = "operType";
	public static final String tname_operDate  = "operDate";
	//record infromation
	private String ISBN;
	private String readerID;
	private String workerID;
	private String operType;
	private String operDate;
	//constructor
	public operAccount(){}
	operAccount(String _ISBN, String _readerID, String _workerID, String _operType, String _operDate){
		setISBN(_ISBN);
		setReaderID(_readerID);
		setWorkerID(_workerID);
		setOperType(_operType);
		setOperDate(_operDate);
	}
	public operAccount(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setISBN(rs.getString(tname_ISBN));
			setReaderID(rs.getString(tname_readerID));
			setWorkerID(rs.getString(tname_workerID));
			setOperType(rs.getString(tname_operType));
			setOperDate(rs.getString(tname_operDate));
		}
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getReaderID() {
		return readerID;
	}
	public void setReaderID(String readerID) {
		this.readerID = readerID;
	}
	public String getWorkerID() {
		return workerID;
	}
	public void setWorkerID(String workerID) {
		this.workerID = workerID;
	}
	public String getOperType() {
		return operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}
	public String getOperDate() {
		return operDate;
	}
	public void setOperDate(String operDate) {
		this.operDate = operDate;
	}
}
