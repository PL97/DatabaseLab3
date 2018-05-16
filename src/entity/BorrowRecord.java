package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BorrowRecord {
	//table information
	public static final String tname_ISBN  = "ISBN";
	public static final String tname_readerID  = "readerID";
	public static final String tname_Bdate  = "Bdate";
	public static final String tname_Rdate   = "Rdate";
	public static final String tname_bNum  = "bNum";
	//record infromation
	private String ISBN;
	private String readerID;
	private String Bdate;
	private String Rdate;
	private String bNum;
	//constructor
	public BorrowRecord(){}
	BorrowRecord(String _ISBN, String _readerID, String _Bdate, String _Rdate, String _bNum){
		setISBN(_ISBN);
		setReaderID(_readerID);
		setBdate(_Bdate);
		setRdate(_Rdate);
		setbNum(_bNum);
	}
	public BorrowRecord(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setISBN(rs.getString(tname_ISBN));
			setReaderID(rs.getString(tname_readerID));
			setBdate(rs.getString(tname_Bdate));
			setRdate(rs.getString(tname_Rdate));
			setbNum(rs.getString(tname_bNum));
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
	public String getBdate() {
		return Bdate;
	}
	public void setBdate(String bdate) {
		Bdate = bdate;
	}
	public String getbNum() {
		return bNum;
	}
	public void setbNum(String bNum) {
		this.bNum = bNum;
	}
	public String getRdate() {
		return Rdate;
	}
	public void setRdate(String rdate) {
		Rdate = rdate;
	}
}
