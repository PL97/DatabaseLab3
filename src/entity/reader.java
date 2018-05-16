package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class reader {
	//table information
	public static final String tname_readerID   = "readerID";
	public static final String tname_name  = "name";
	public static final String tname_sex   = "sex";
	public static final String tname_validate_s  = "validate_s";
	public static final String tname_validate_e  = "validate_e";
	//record infromation
	private String readerID;
	private String name;
	private String sex;
	private String validate_s;
	private String validate_e;
	//constructor
	public reader(){}
	public reader(String _readerID, String _name, String _sex, String _validate_s, String _validate_e){
		setReaderID(_readerID);
		setName(_name);
		setSex(_sex);
		setValidate_s(_validate_s);
		validate_e = _validate_e;
	}
	public reader(ResultSet rs) throws SQLException{
		if(!rs.wasNull()) {
			setReaderID(rs.getString(tname_readerID));
			setName(rs.getString(tname_name));
			setSex(rs.getString(tname_sex));
			validate_s = rs.getString(tname_validate_s);
			validate_e = rs.getString(tname_validate_e);
		}
	}
	public String getReaderID() {
		return readerID;
	}
	public void setReaderID(String readerID) {
		this.readerID = readerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getValidate_e() {
		return validate_e;
	}
	public void setValidate_e(String validate_e) {
		this.validate_e = validate_e;
	}
	public String getValidate_s() {
		return validate_s;
	}
	public void setValidate_s(String validate_s) {
		this.validate_s = validate_s;
	}
}
