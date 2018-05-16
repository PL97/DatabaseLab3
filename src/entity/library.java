package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class library {
	//table information
	public static final String tname_LibraryID  = "LibraryID";
	public static final String tname_libraryName  = "libraryName";
	public static final String tname_libraryaddr  = "libraryaddr";
	//record infromation
	private String LibraryID;
	private String libraryName;
	private String libraryaddr;
	//constructor
	public library(){}
	library(String _LibraryID, String _libraryName, String _libraryaddr){
		setLibraryID(_LibraryID);
		setLibraryName(_libraryName);
		setLibraryaddr(_libraryaddr);
	}
	public library(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setLibraryID(rs.getString(tname_LibraryID));
			setLibraryName(rs.getString(tname_libraryName));
			setLibraryaddr(rs.getString(tname_libraryaddr));
		}
	}
	public String getLibraryID() {
		return LibraryID;
	}
	public void setLibraryID(String libraryID) {
		LibraryID = libraryID;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryaddr() {
		return libraryaddr;
	}
	public void setLibraryaddr(String libraryaddr) {
		this.libraryaddr = libraryaddr;
	}
}
