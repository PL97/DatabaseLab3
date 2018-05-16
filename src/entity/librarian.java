package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class librarian {
	//table information
	public static final String tname_workerID = "workerID";
	public static final String tname_libraryID = "libraryID";
	public static final String tname_RoomNum = "RoomNum";
	public static final String tname_workername = "workername";
	//record infromation
	private String workerID;
	private String libraryID;
	private String RoomNum;
	private String workername;
	//constructor
	public librarian() {}
	librarian(String _workerID, String _workername, String _libraryID, String _RoomNum){
		setWorkerID(_workerID);
		setWorkername(_workername);
		setLibraryID(_libraryID);
		setRoomNum(_RoomNum);
	}
	public librarian(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setWorkerID(rs.getString(tname_workerID));
			setWorkername(rs.getString(tname_workername));
			setLibraryID(rs.getString(tname_libraryID));
			setRoomNum(rs.getString(tname_RoomNum));
		}
	}
	public String getWorkerID() {
		return workerID;
	}
	public void setWorkerID(String workerID) {
		this.workerID = workerID;
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
	public String getWorkername() {
		return workername;
	}
	public void setWorkername(String workername) {
		this.workername = workername;
	}
}
