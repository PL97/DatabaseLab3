package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class book {
	//table information
	public static final String tname_ISBN  = "ISBN";
	public static final String tname_Title  = "Title";
	public static final String tname_Press  = "Press";
	//record infromation
	private String ISBN;
	private String Title;
	private String Press;
	//constructor
	public book(){}
	book(String _ISBN, String _Title, String _Press){
		ISBN = _ISBN;
		Title = _Title;
		Press = _Press;
	}
	public book(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			ISBN = rs.getString(tname_ISBN);
			Title = rs.getString(tname_Title);
			Press = rs.getString(tname_Press);
		}
	}
	
	//getter and settor
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getPress() {
		return Press;
	}
	public void setPress(String press) {
		Press = press;
	}
}
