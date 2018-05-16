package application;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import entity.BorrowRecord;
import entity.DB;
import entity.book;
import entity.bookshelf;
import entity.librarian;
import entity.library;
import entity.operAccount;
import entity.reader;
import entity.repertory;
import entity.replenishFrom;
import entity.room;
import entity.storeAccount;
import entity.storeList;
import entity.supplier;

public class sFormOper {
	//operation
	private final String ADD = "insert into ";
	private final String DEL = "delete from ";
	private final String MOD = "update ";
	private final String SEL = "select * from ";
	
	//DB declaration
	private final DB database = new DB();
	//table repertory
	private final String trepertory_name = "BookRepertory"; 
	//table book
	private final String tbook_name = "Book";
	//table book
	private final String treader_name = "reader";
	//table book
	private final String tlibrarian_name = "librarian";
	//table book
	private final String tbookshelf_name = "bookshelf";
	//table book
	private final String tsupplier_name = "supplier";
	//table book
	private final String tBorrowRecord_name = "BorrowRecord";
	//table book
	private final String tlibrary_name = "library";
	//table book
	private final String toperAccount_name = "operAccount";
	//table book
	private final String treplenishFrom_name = "replenishForm";
	//table book
	private final String tstoreAccount_name = "storeAccount";
	//table book
	private final String tstoreList_name = "storeList";
	//table book
	private final String troom_name = "room";
	
	public void add(String form, Map parameter) throws SQLException, ClassNotFoundException {
		int size = parameter.size();
		String[] val = new String[size];
		String cmd = ADD + form + "(";
		Iterator it = parameter.keySet().iterator();
		String temp;
		for(int i =0 ;i<size;i++) {
			temp = (String)it.next();
			cmd += temp + ", ";
			val[i] = (String) parameter.get(temp);
			
		}
		cmd = cmd.substring(0, cmd.length()-2) + ") values(";
		for(int j = 0;j<size;j++) {
			cmd += "?, ";
		}
		cmd = cmd.substring(0, cmd.length()-2) + ")";
		database.getConnection();
		database.executeUpdate(cmd , val);
		database.closeAll();
	} 
	
	
	public void delete(String form, Map parameter) throws SQLException, ClassNotFoundException {
		//for table book
		int size = parameter.size();
		String[] val = new String[size];
		String cmd = DEL + form + " where ";
		Iterator it = parameter.keySet().iterator();
		String temp;
		for(int i =0 ;i<size;i++) {
			temp = (String)it.next();
			cmd += temp + " = ?, ";
			val[i] = (String) parameter.get(temp);
		}
		cmd = cmd.substring(0, cmd.length()-2);
		database.getConnection();
		database.executeUpdate(cmd , val);
		database.closeAll();
		
	}
	
	
	public void modify(String form, String cname, String new_val, Object parameter) throws SQLException, ClassNotFoundException {
		String cmd = MOD + form + " set "+ cname + " = ?  where ";
		String[] param = null;
		if(form.equals(trepertory_name)) {
			repertory temprepertory = (repertory) parameter;
			cmd += temprepertory.tname_ISBN + " = ? and ";
			cmd += temprepertory.tname_BookShelfNum + " = ? and ";
			cmd += temprepertory.tname_libraryID + " = ? and ";
			cmd += temprepertory.tname_Number + " = ? and ";
			cmd += temprepertory.tname_RoomNum + " = ?";
			param = new String[6];
			param[0] = new_val;
			param[1] = temprepertory.getISBN();
			param[2] = temprepertory.getBookShelfNum();
			param[3] = temprepertory.getLibraryID();
			param[4] = temprepertory.getNumber();
			param[5] = temprepertory.getRoomNum();
		}
		if(form.equals(tbook_name)) {
			book tempBook = (book) parameter;
			cmd += tempBook.tname_ISBN + " = ? and ";
			cmd += tempBook.tname_Press + " = ? and ";
			cmd += tempBook.tname_Title + " = ?";
			param = new String[4];
			param[0] = new_val;
			param[1] = tempBook.getISBN();
			param[2] = tempBook.getPress();
			param[3] = tempBook.getTitle();
		}
		if(form.equals(treader_name)) {
			reader tempReader = (reader) parameter;
			cmd += tempReader.tname_readerID + " = ? and ";
			cmd += tempReader.tname_name + " = ? and ";
			cmd += tempReader.tname_sex + " = ? and ";
			cmd += tempReader.tname_validate_s + " = ? and ";
			cmd += tempReader.tname_validate_e + " = ?";
			param = new String[6];
			param[0] = new_val;
			param[1] = tempReader.getReaderID();
			param[2] = tempReader.getName();
			param[3] = tempReader.getSex();
			param[4] = tempReader.getValidate_s();
			param[5] = tempReader.getValidate_e();
		}
		if(form.equals(tlibrarian_name)) {
			librarian templibrarian = (librarian) parameter;
			cmd += templibrarian.tname_libraryID + " = ? and ";
			cmd += templibrarian.tname_workername + " =? and ";
			cmd += templibrarian.tname_RoomNum + " = ? and ";
			cmd += templibrarian.tname_workerID + " = ?";
			param = new String[5];
			param[0] = new_val;
			param[1] = templibrarian.getLibraryID();
			param[2] = templibrarian.getWorkername();
			param[3] = templibrarian.getRoomNum();
			param[4] = templibrarian.getWorkerID();
		}
		if(form.equals(tbookshelf_name)) {
			bookshelf tempBookshelf = (bookshelf) parameter;
			cmd += tempBookshelf.getBookshelfNum() + " = ? and ";
			cmd += tempBookshelf.getCategory() + " = ? and ";
			cmd += tempBookshelf.getLibraryID() + " = ? and ";
			cmd += tempBookshelf.getRoomNum() + " = ?";
			param = new String[5];
			param[0] = new_val;
			param[1] = tempBookshelf.getBookshelfNum();
			param[2] = tempBookshelf.getCategory();
			param[3] = tempBookshelf.getLibraryID();
			param[4] = tempBookshelf.getRoomNum();
		}
		if(form.equals(tsupplier_name)) {
			supplier tempSupplier = (supplier) parameter;
			cmd += tempSupplier.tname_phoneNumber + " = ? and ";
			cmd += tempSupplier.tname_supplierID + " = ? and ";
			cmd += tempSupplier.tname_supplierName + " = ?";
			param = new String[4];
			param[0] = new_val;
			param[1] = tempSupplier.getPhoneNumber();
			param[2] = tempSupplier.getSupplierID();
			param[3] = tempSupplier.getSupplierName();
		}
		if(form.equals(tBorrowRecord_name)) {
			BorrowRecord tempBorrowRecord = (BorrowRecord) parameter;
			cmd += tempBorrowRecord.tname_Bdate + " = ? and ";
			cmd += tempBorrowRecord.tname_bNum + " = ? and ";
			cmd += tempBorrowRecord.tname_ISBN + " = ? and ";
			cmd += tempBorrowRecord.tname_Rdate + " = ? and ";
			cmd += tempBorrowRecord.tname_readerID + " = ?";
			param = new String[6];
			param[0] = new_val;
			param[1] = tempBorrowRecord.getBdate();
			param[2] = tempBorrowRecord.getbNum();
			param[3] = tempBorrowRecord.getISBN();
			param[4] = tempBorrowRecord.getRdate();
			param[5] = tempBorrowRecord.getReaderID();
		}
		if(form.equals(tlibrary_name)) {
			library templibrary = (library) parameter;
			cmd += templibrary.tname_libraryaddr + " = ? and ";
			cmd += templibrary.tname_LibraryID + " = ? and ";
			cmd += templibrary.tname_libraryName + " = ?";
			param = new String[4];
			param[0] = new_val;
			param[1] = templibrary.getLibraryaddr();
			param[2] = templibrary.getLibraryID();
			param[3] = templibrary.getLibraryName();
		}
		if(form.equals(toperAccount_name)) {
			operAccount tempoperAccount = (operAccount) parameter;
			cmd += tempoperAccount.tname_ISBN + " = ? and ";
			cmd += tempoperAccount.tname_operDate + " = ? and ";
			cmd += tempoperAccount.tname_operType + " = ? and ";
			cmd += tempoperAccount.tname_readerID + " = ? and ";
			cmd += tempoperAccount.tname_workerID + " = ?";
			param = new String[6];
			param[0] = new_val;
			param[1] = tempoperAccount.getISBN();
			param[2] = tempoperAccount.getOperDate();
			param[3] = tempoperAccount.getOperType();
			param[4] = tempoperAccount.getReaderID();
			param[5] = tempoperAccount.getWorkerID();
		}
		if(form.equals(treplenishFrom_name)) {
			replenishFrom tempreplenishFrom = (replenishFrom) parameter;
			cmd += tempreplenishFrom.tname_formID + " = ? and ";
			cmd += tempreplenishFrom.tname_libraryID + " = ? and ";
			cmd += tempreplenishFrom.tname_supplierID + " = ?";
			param = new String[4];
			param[0] = new_val;
			param[1] = tempreplenishFrom.getFormID();
			param[2] = tempreplenishFrom.getLibraryID();
			param[3] = tempreplenishFrom.getSupplierID();
		}
		if(form.equals(tstoreAccount_name)) {
			storeAccount tempstoreAccount = (storeAccount) parameter;
			cmd += tempstoreAccount.tname_accountID + " = ? and ";
			cmd += tempstoreAccount.tname_bookNum + " = ? and ";
			cmd += tempstoreAccount.tname_formID + " = ? and ";
			cmd += tempstoreAccount.tname_ISBN + " = ? and ";
			cmd += tempstoreAccount.tname_libraryID + " = ?";
			param = new String[6];
			param[0] = new_val;
			param[1] = tempstoreAccount.getAccountID();
			param[2] = tempstoreAccount.getBookNum();
			param[3] = tempstoreAccount.getFormID();
			param[4] = tempstoreAccount.getISBN();
			param[5] = tempstoreAccount.getLibraryID();
		}
		if(form.equals(tstoreList_name)) {
			storeList tempstoreList = (storeList) parameter;
			cmd += tempstoreList.tname_formID + " = ? and ";
			cmd += tempstoreList.tname_ISBN + " = ? and ";
			cmd += tempstoreList.tname_Num + " = ?";
			param = new String[4];
			param[0] = new_val;
			param[1] = tempstoreList.getFormID();
			param[2] = tempstoreList.getISBN();
			param[3] = tempstoreList.getNum();
		}
		if(form.equals(troom_name)) {
			room temproom = (room) parameter;
			cmd += temproom.tname_libraryID + " = ? and ";
			cmd += temproom.tname_RoomNum + " = ? and ";
			cmd += temproom.tname_type + " = ?";
			param = new String[4];
			param[0] = new_val;
			param[1] = temproom.getLibraryID();
			param[2] = temproom.getRoomNum();
			param[3] = temproom.getType();
		}
		database.getConnection();
		database.executeUpdate(cmd, param);
		database.closeAll();
		
	}
	
	
	public LinkedList select(String form, Map parameter) throws SQLException, ClassNotFoundException {
		//for table book
		int size = parameter.size();
		String[] val = new String[size];
		String cmd = SEL + form + " where ";
		Iterator it = parameter.keySet().iterator();
		String temp;
		LinkedList result = new LinkedList();
		if(size == 0) {
			cmd = cmd.substring(0, cmd.length()-7);
		}
		else {
			for(int i =0 ;i<size;i++) {
				temp = (String)it.next();
				cmd += temp + " = ? and ";
				val[i] = (String) parameter.get(temp);
			}
			cmd = cmd.substring(0, cmd.length()-5);
		}
		database.getConnection();
		ResultSet rs = database.executeSelect(cmd, val);
		//get parameter
		if(form.equals(trepertory_name)) {
			while(rs.next()){
				result.add(new repertory(rs));
			}
		}
		if(form.equals(tbook_name)) {
			while(rs.next()){
				result.add(new book(rs));
			}
		}
		if(form.equals(treader_name)) {
			while(rs.next()){
				result.add(new reader(rs));
			}
		}
		if(form.equals(tlibrarian_name)) {
			while(rs.next()){
				result.add(new librarian(rs));
			}
		}
		if(form.equals(tbookshelf_name)) {
			while(rs.next()){
				result.add(new bookshelf(rs));
			}
		}
		if(form.equals(tsupplier_name)) {
			while(rs.next()){
				result.add(new supplier(rs));
			}
		}
		if(form.equals(tBorrowRecord_name)) {
			while(rs.next()){
				result.add(new BorrowRecord(rs));
			}
		}
		if(form.equals(tlibrary_name)) {
			while(rs.next()){
				result.add(new library(rs));
			}
		}
		if(form.equals(toperAccount_name)) {
			while(rs.next()){
				result.add(new operAccount(rs));
			}
		}
		if(form.equals(treplenishFrom_name)) {
			while(rs.next()){
				result.add(new replenishFrom(rs));
			}
		}
		if(form.equals(tstoreAccount_name)) {
			while(rs.next()){
				result.add(new storeAccount(rs));
			}
		}
		if(form.equals(tstoreList_name)) {
			while(rs.next()){
				result.add(new storeList(rs));
			}
		}
		if(form.equals(troom_name)) {
			while(rs.next()){
				result.add(new room(rs));
			}
		}
		database.closeAll();
		return result;
	}
	
	public DB getdatabase() {
		return database;
	}
}
