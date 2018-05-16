package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class room {
	//table information
	public static final String tname_RoomNum  = "RoomNum";
	public static final String tname_libraryID  = "libraryID";
	public static final String tname_type  = "type";
	//record infromation
	private String RoomNum;
	private String libraryID;
	private String type;
	//constructor
	public room(){}
	room(String _RoomNum, String _libraryID, String _type){
		setRoomNum(_RoomNum);
		setLibraryID(_libraryID);
		setType(_type);
	}
	public room(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setRoomNum(rs.getString(tname_RoomNum));
			setLibraryID(rs.getString(tname_libraryID));
			setType(rs.getString(tname_type));
		}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
