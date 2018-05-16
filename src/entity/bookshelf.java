package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class bookshelf {
	//table information
	public static final String tname_bookshelfNum   = "bookshelfNum";
	public static final String tname_RoomNum  = "RoomNum";
	public static final String tname_libraryID   = "libraryID";
	public static final String tname_category  = "category";
	//record infromation
	private String bookshelfNum;
	private String RoomNum;
	private String libraryID;
	private String category;
	//constructor
	public bookshelf(){}
	bookshelf(String _bookshelfNum, String _RoomNum, String _libraryID, String _category){
		setBookshelfNum(_bookshelfNum);
		setRoomNum(_RoomNum);
		setLibraryID(_libraryID);
		setCategory(_category);
	}
	public bookshelf(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setBookshelfNum(rs.getString(tname_bookshelfNum));
			setRoomNum(rs.getString(tname_RoomNum));
			setLibraryID(rs.getString(tname_libraryID));
			setCategory(rs.getString(tname_category));
		}
	}
	public String getBookshelfNum() {
		return bookshelfNum;
	}
	public void setBookshelfNum(String bookshelfNum) {
		this.bookshelfNum = bookshelfNum;
	}
	public String getRoomNum() {
		return RoomNum;
	}
	public void setRoomNum(String roomNum) {
		RoomNum = roomNum;
	}
	public String getLibraryID() {
		return libraryID;
	}
	public void setLibraryID(String libraryID) {
		this.libraryID = libraryID;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
