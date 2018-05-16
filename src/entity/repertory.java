package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class repertory {
	
	public static final String tname_ISBN  = "ISBN";
	public static final String tname_libraryID  = "libraryID";
	public static final String tname_RoomNum  = "RoomNum";
	public static final String tname_BookShelfNum  = "BookShelfNum";
	public static final String tname_Number  = "Number";
	
	private String ISBN;
	private String libraryID;
	private String RoomNum;
	private String BookShelfNum;
	private String Number;
	//constructor
	public repertory() {}
	public repertory(String _ISBN, String _libraryID, String _RoomNum, String _BookShelfNum, String _Number){
		setISBN(_ISBN);
		setLibraryID(_libraryID);
		setRoomNum(_RoomNum);
		setBookShelfNum(_BookShelfNum);
		setNumber(_Number);
	}
	public repertory(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setISBN(rs.getString(tname_ISBN));
			setLibraryID(rs.getString(tname_libraryID));
			setRoomNum(rs.getString(tname_RoomNum));
			setBookShelfNum(rs.getString(tname_BookShelfNum));
			setNumber(rs.getString(tname_Number));
		}
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getLibraryID() {
		return libraryID;
	}
	public void setLibraryID(String libraryID) {
		this.libraryID = libraryID;
	}
	public String getRoomNum() {
		return RoomNum;
	}
	public void setRoomNum(String roomNum) {
		RoomNum = roomNum;
	}
	public String getBookShelfNum() {
		return BookShelfNum;
	}
	public void setBookShelfNum(String bookShelfNum) {
		BookShelfNum = bookShelfNum;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}

}
