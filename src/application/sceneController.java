package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import entity.book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SingleSelectionModel;

public class sceneController {
	@FXML
	private Tab repertory;
	@FXML
	private TextField k_ISBN;
	@FXML
	private TextField k_lib;
	@FXML
	private TextField k_room;
	@FXML
	private TextField k_shelf;
	@FXML
	private TextField k_num;
	@FXML
	private CheckBox k_ISBNcheck;
	@FXML
	private CheckBox k_libcheck;
	@FXML
	private CheckBox k_roomcheck;
	@FXML
	private CheckBox k_shelfcheck;
	@FXML
	private CheckBox k_numcheck;
	@FXML
	private Tab book;
	@FXML
	private TextField t_ISBN;
	@FXML
	private TextField t_press;
	@FXML
	private TextField t_title;
	@FXML
	private CheckBox t_ISBNcheck;
	@FXML
	private CheckBox t_presscheck;
	@FXML
	private CheckBox t_titlecheck;
	@FXML
	private Tab reader;
	@FXML
	private TextField d_name;
	@FXML
	private TextField d_borrcard;
	@FXML
	private TextField b_sex;
	@FXML
	private TextField d_validdate_s;
	@FXML
	private CheckBox d_namecheck;
	@FXML
	private CheckBox d_borrcardcheck;
	@FXML
	private CheckBox b_sexcheck;
	@FXML
	private CheckBox d_validdatecheck;
	@FXML
	private TextField d_validdate_e;
	@FXML
	private Tab room;
	@FXML
	private TextField f_room;
	@FXML
	private TextField f_lib;
	@FXML
	private TextField f_type;
	@FXML
	private CheckBox f_roomcheck;
	@FXML
	private CheckBox f_libcheck;
	@FXML
	private CheckBox f_typecheck;
	@FXML
	private Tab shelf;
	@FXML
	private TextField s_shelf;
	@FXML
	private TextField s_room;
	@FXML
	private TextField s_lib;
	@FXML
	private TextField s_type;
	@FXML
	private CheckBox s_shelfcheck;
	@FXML
	private CheckBox s_roomcheck;
	@FXML
	private CheckBox s_libcheck;
	@FXML
	private CheckBox s_typecheck;
	@FXML
	private Tab supplier;
	@FXML
	private TextField g_supplierID;
	@FXML
	private TextField g_name;
	@FXML
	private TextField g_phone;
	@FXML
	private CheckBox g_supplierIDcheck;
	@FXML
	private CheckBox g_namecheck;
	@FXML
	private CheckBox g_phonecheck;
	@FXML
	private Tab record;
	@FXML
	private TextField j_ISBN;
	@FXML
	private TextField j_borrCard;
	@FXML
	private TextField j_borrDate;
	@FXML
	private TextField j_returnDate;
	@FXML
	private TextField j_num;
	@FXML
	private CheckBox j_ISBNcheck;
	@FXML
	private CheckBox j_borrCardcheck;
	@FXML
	private CheckBox j_borrDatecheck;
	@FXML
	private CheckBox j_returnDatecheck;
	@FXML
	private CheckBox j_numcheck;
	@FXML
	private Tab operAccount;
	@FXML
	private TextField c_ISBN;
	@FXML
	private TextField c_borrCard;
	@FXML
	private TextField c_workerID;
	@FXML
	private TextField c_operType;
	@FXML
	private TextField c_operDate;
	@FXML
	private CheckBox c_ISBNcheck;
	@FXML
	private CheckBox c_borrCardcheck;
	@FXML
	private CheckBox c_workerIDcheck;
	@FXML
	private CheckBox c_operTypecheck;
	@FXML
	private CheckBox c_operDatecheck;
	@FXML
	private Tab library;
	@FXML
	private TextField c_lib;
	@FXML
	private TextField c_name;
	@FXML
	private TextField c_addr;
	@FXML
	private CheckBox c_libcheck;
	@FXML
	private CheckBox c_namecheck;
	@FXML
	private CheckBox c_addrcheck;
	@FXML
	private Tab instockForm;
	@FXML
	private TextField tr_formID;
	@FXML
	private TextField tr_lib;
	@FXML
	private TextField tr_supplier;
	@FXML
	private CheckBox tr_formIDcheck;
	@FXML
	private CheckBox tr_libcheck;
	@FXML
	private CheckBox tr_suppliercheck;
	@FXML
	private Tab instockAccount;
	@FXML
	private TextField rl_account;
	@FXML
	private TextField rl_libID;
	@FXML
	private TextField rl_ISBN;
	@FXML
	private TextField rl_booknum;
	@FXML
	private TextField rl_formID;
	@FXML
	private CheckBox rl_accountcheck;
	@FXML
	private CheckBox rl_libIDcheck;
	@FXML
	private CheckBox rl_ISBNcheck;
	@FXML
	private CheckBox rl_booknumcheck;
	@FXML
	private CheckBox rl_formIDcheck;
	@FXML
	private Tab instockDetail;
	@FXML
	private TextField rm_form;
	@FXML
	private TextField rm_ISBN;
	@FXML
	private TextField rm_num;
	@FXML
	private CheckBox rm_formcheck;
	@FXML
	private CheckBox rm_ISBNcheck;
	@FXML
	private CheckBox rm_numcheck;
	@FXML
	private Tab librarian;
	@FXML
	private TextField t_workerID;
	@FXML
	private TextField t_workername;
	@FXML
	private TextField t_lib;
	@FXML
	private TextField t_room;
	@FXML
	private CheckBox t_workerIDcheck;
	@FXML
	private CheckBox t_workernamecheck;
	@FXML
	private CheckBox t_libcheck;
	@FXML
	private CheckBox t_roomcheck;
	@FXML
	private Tab Mutifunc;
	@FXML
	private TextField f1_input1;
	@FXML
	private CheckBox f1select;
	@FXML
	private Button submitAdd;
	@FXML
	private Button submitDelete;
	@FXML
	private Button submitModify;
	@FXML
	private Tab Mutiform;
	@FXML
	private TableView table;
	@FXML
	private TextField displayBoard;
	@FXML
	private TableColumn column1;
	@FXML
	private TableColumn column2;
	@FXML
	private TableColumn column3;
	@FXML
	private TableColumn column4;
	@FXML
	private TableColumn column5;
	@FXML
	private TextArea logging;
	@FXML
	private TextArea logging2;
	@FXML
	private TabPane tabs_form;
	@FXML
	private TabPane tabs_submit;
	@FXML
	private Button mutisubmit;
	
	//displayBoardlay
	final ObservableList data = FXCollections.observableArrayList();

	//table information
	private final String trepertory_name = "BookRepertory";
	private final String tbook_name = "Book";
	private final String treader_name = "reader";
	private final String tlibrarian_name = "librarian";
	private final String tbookshelf_name = "bookshelf";
	private final String tsupplier_name = "supplier";
	private final String tBorrowRecord_name = "BorrowRecord";
	private final String tlibrary_name = "library";
	private final String toperAccount_name = "operAccount";
	private final String treplenishFrom_name = "replenishForm";
	private final String tstoreAccount_name = "storeAccount";
	private final String tstoreList_name = "storeList";
	private final String troom_name = "room";
	
	//manage tab
	SingleSelectionModel<Tab> selectionMode = tabs_form.getSelectionModel();
	SingleSelectionModel<Tab> selectionModel = tabs_submit.getSelectionModel();
	//manipulate data base by using a class called sFormOper
	sFormOper singFormOper = new sFormOper();
	
	//some parameter to get the input
	Map<String, String> input = new HashMap<String, String>();
	
	String currentTable;
	
	// Event Listener on Button[#submitAdd].onAction
	@FXML
	public void submitAdd(ActionEvent event) throws ClassNotFoundException {
		// TODO Autogenerated		
		input.clear();
		//submit request
		try {
			singFormOper.add(getInput(), input);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logging.setText(e.getMessage());
		}
	}
	// Event Listener on Button[#submitDelete].onAction
	@FXML
	public void submitDelete() throws ClassNotFoundException {
		// TODO Autogenerated
		input.clear();
		try {
			singFormOper.delete(getInput(), input);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logging.setText(e.getMessage());
		}
	}
	// Event Listener on Button[#submitModify].onAction
	@FXML
	public void submitModify(TableColumn.CellEditEvent<Object,String> value) throws ClassNotFoundException {
		// TODO Autogenerated
		input.clear();
		TableColumn tc = value.getTableColumn();  
		//for table repertory
		if(currentTable.equals(trepertory_name)) {
			String new_val = value.getNewValue();
			entity.repertory mm = (entity.repertory) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}			
		} 
		//for table book
		if(currentTable.equals(tbook_name)) {
			String new_val = value.getNewValue();
			book mm = (entity.book) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}			
		} 
		//for table reader
		if(currentTable.equals(treader_name)) {
			String new_val = value.getNewValue();
			entity.reader mm = (entity.reader) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}
		}
		//for table librarian
		if(currentTable.equals(tlibrarian_name)) {
			String new_val = value.getNewValue();
			entity.librarian mm = (entity.librarian) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}
		}
		//for table bookshelf
		if(currentTable.equals(tbookshelf_name)) {
			String new_val = value.getNewValue();
			entity.bookshelf mm = (entity.bookshelf) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}
		}
		//for table supplier
		if(currentTable.equals(tsupplier_name)) {
			String new_val = value.getNewValue();
			entity.supplier mm = (entity.supplier) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}
		}
		//for table borrow record
		if(currentTable.equals(tBorrowRecord_name)) {
			String new_val = value.getNewValue();
			entity.BorrowRecord mm = (entity.BorrowRecord) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}
		}
		//for table library
		if(currentTable.equals(tlibrary_name)) {
			String new_val = value.getNewValue();
			entity.library mm = (entity.library) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//for table operation
		if(currentTable.equals(toperAccount_name)) {
			String new_val = value.getNewValue();
			entity.operAccount mm = (entity.operAccount) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}	
		}
		//for table replenish form
		if(currentTable.equals(treplenishFrom_name)) {
			String new_val = value.getNewValue();
			entity.replenishFrom mm = (entity.replenishFrom) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}	
		}
		//for table storage account
		if(currentTable.equals(tstoreAccount_name)) {
			String new_val = value.getNewValue();
			entity.storeAccount mm = (entity.storeAccount) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}	
		}
		//for table storage list
		if(currentTable.equals(tstoreList_name)) {
			String new_val = value.getNewValue();
			entity.storeList mm = (entity.storeList) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}	
		}
		//for table room
		if(currentTable.equals(troom_name)) {
			String new_val = value.getNewValue();
			entity.room mm = (entity.room) value.getRowValue(); 
			String cname = value.getTableColumn().getText();
			try {
				singFormOper.modify(currentTable, cname, new_val, mm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logging.setText(e.getMessage());
			}	
		}
		//mm.put(tc.getId().toUpperCase(), value.getNewValue());  
		
		//singFormOper.modify(getInput(), input);
	}
	
	@FXML
	public void submitSelect() throws ClassNotFoundException, SQLException, IOException {
		input.clear();
		String temptableName = getInput();
		LinkedList temp = singFormOper.select(temptableName, input);
		String []cname = null;
		//for table repertory
		if(temptableName.equals(trepertory_name)) {
			entity.repertory temprepertory = new entity.repertory();
			cname = new String[5];
			cname[0] = temprepertory.tname_ISBN;
			cname[1] = temprepertory.tname_BookShelfNum;
			cname[2] = temprepertory.tname_libraryID;
			cname[3] = temprepertory.tname_Number;
			cname[4] = temprepertory.tname_RoomNum;
		}
		//for table book
		if(temptableName.equals(tbook_name)) {
			book tempbook = new book();
			cname = new String[3];
			cname[0] = tempbook.tname_ISBN;
			cname[1] = tempbook.tname_Title;
			cname[2] = tempbook.tname_Press;
		}
		//for table reader
		if(temptableName.equals(treader_name)) {
			entity.reader tempreader = new entity.reader();
			cname = new String[5];
			cname[0] = tempreader.tname_readerID;
			cname[1] = tempreader.tname_name;
			cname[2] = tempreader.tname_sex;
			cname[3] = tempreader.tname_validate_s;
			cname[4] = tempreader.tname_validate_e;
		}
		//for table librarian
		if(temptableName.equals(tlibrarian_name)) {
			entity.librarian templibrarian = new entity.librarian();
			cname = new String[4];
			cname[0] = templibrarian.tname_libraryID;
			cname[1] = templibrarian.tname_workername;
			cname[2] = templibrarian.tname_RoomNum;
			cname[3] = templibrarian.tname_workerID;
		}
		//for table bookshelf
		if(temptableName.equals(tbookshelf_name)) {
			entity.bookshelf tempbookshelf = new entity.bookshelf();
			cname = new String[4];
			cname[0] = tempbookshelf.tname_bookshelfNum;
			cname[1] = tempbookshelf.tname_category;
			cname[2] = tempbookshelf.tname_libraryID;
			cname[3] = tempbookshelf.tname_RoomNum;
		}
		//for table supplier
		if(temptableName.equals(tsupplier_name)) {
			entity.supplier tempsupplier = new entity.supplier();
			cname = new String[3];
			cname[0] = tempsupplier.tname_phoneNumber;
			cname[1] = tempsupplier.tname_supplierID;
			cname[2] = tempsupplier.tname_supplierName;
		}
		//for table borrow record
		if(temptableName.equals(tBorrowRecord_name)) {
			entity.BorrowRecord tempBorrowRecord = new entity.BorrowRecord();
			cname = new String[5];
			cname[0] = tempBorrowRecord.tname_Bdate;
			cname[1] = tempBorrowRecord.tname_bNum;
			cname[2] = tempBorrowRecord.tname_ISBN;
			cname[3] = tempBorrowRecord.tname_Rdate;
			cname[4] = tempBorrowRecord.tname_readerID;
		}
		//for table library
		if(temptableName.equals(tlibrary_name)) {
			entity.library templibrary = new entity.library();
			cname = new String[3];
			cname[0] = templibrary.tname_libraryaddr;
			cname[1] = templibrary.tname_LibraryID;
			cname[2] = templibrary.tname_libraryName;
		}
		//for table operation
		if(temptableName.equals(toperAccount_name)) {
			entity.operAccount tempoperAccount = new entity.operAccount();
			cname = new String[5];
			cname[0] = tempoperAccount.tname_ISBN;
			cname[1] = tempoperAccount.tname_operDate;
			cname[2] = tempoperAccount.tname_operType;
			cname[3] = tempoperAccount.tname_readerID;
			cname[4] = tempoperAccount.tname_workerID;
		}
		//for table replenish form
		if(temptableName.equals(treplenishFrom_name)) {
			entity.replenishFrom tempreplenishFrom = new entity.replenishFrom();
			cname = new String[3];
			cname[0] = tempreplenishFrom.tname_formID;
			cname[1] = tempreplenishFrom.tname_libraryID;
			cname[2] = tempreplenishFrom.tname_supplierID;
		}
		//for table storage account
		if(temptableName.equals(tstoreAccount_name)) {
			entity.storeAccount tempstoreAccount = new entity.storeAccount();	
			cname = new String[5];
			cname[0] = tempstoreAccount.tname_accountID;
			cname[1] = tempstoreAccount.tname_bookNum;
			cname[2] = tempstoreAccount.tname_formID;
			cname[3] = tempstoreAccount.tname_ISBN;
			cname[4] = tempstoreAccount.tname_libraryID;
		}
		//for table storage list
		if(temptableName.equals(tstoreList_name)) {
			entity.storeList tempstoreList = new entity.storeList();
			cname = new String[4];
			cname[0] = tempstoreList.tname_formID;
			cname[1] = tempstoreList.tname_ISBN;
			cname[2] = tempstoreList.tname_Num;
		}
		//for table room
		if(temptableName.equals(troom_name)) {
			entity.room temproom = new entity.room();
			cname = new String[4];
			cname[0] = temproom.tname_libraryID;
			cname[1] = temproom.tname_RoomNum;
			cname[2] = temproom.tname_type;
		}

		String LoggingInfor = "select operation has succeed";
		showResult(temp, cname, LoggingInfor, temptableName);
	}
	
	
	// Event Listener on Button[#submitDelete].onAction
	@FXML
	public void mutisubmit() throws ClassNotFoundException {
		// TODO Autogenerated
		if(Mutiform.isSelected()) {
			if(f1select.isSelected()) {
				String []param =  {f1_input1.getText()};
				String cmd = "select libraryName, libraryaddr, number from library natural join bookrepertory natural join book where title =  %"
							+ param[0] + "%";
				try {
					singFormOper.getdatabase().executeSelect(cmd, param);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					logging2.setText(e.getMessage());
				}
			}
		}
	}
	
	@FXML
	public void changeMode() {
		if(Mutiform.isSelected()) {
			selectionMode.select(Mutifunc);
		}
		else if(Mutifunc.isSelected()) {
			selectionModel.select(Mutiform);
		}
	}

	public void showResult(LinkedList result,String[] columnName, String log, String tname) throws IOException {
		//refresh
    	data.clear();
    	table.setEditable(true);
    	table.setItems(data);
    	int size = columnName.length;
    	currentTable = tname;
    	//bind
    	if(size-->0) {
    		column1.setText(columnName[0]);
    		column1.setCellValueFactory(new PropertyValueFactory(columnName[0]));
    		column1.setCellFactory(TextFieldTableCell.forTableColumn());
    	}
    	else {
    		column1.setText("");
    		column1.setCellValueFactory(new PropertyValueFactory(null));
    	}
    	
    	if(size-->0) {
    		column2.setText(columnName[1]);
    		column2.setCellValueFactory(new PropertyValueFactory(columnName[1]));
    		column2.setCellFactory(TextFieldTableCell.forTableColumn());
    	}
    	else {
    		column2.setText("");
    		column2.setCellValueFactory(new PropertyValueFactory(null));
    	}
    	
    	if(size-->0) {
    		column3.setText(columnName[2]);
    		column3.setCellValueFactory(new PropertyValueFactory(columnName[2]));
    		column3.setCellFactory(TextFieldTableCell.forTableColumn());
    	}    	
    	else {
    		column3.setText("");
    		column3.setCellValueFactory(new PropertyValueFactory(null));
    	}
    	
    	if(size-->0) {
    		column4.setText(columnName[3]);
    		column4.setCellValueFactory(new PropertyValueFactory(columnName[3]));
    		column4.setCellFactory(TextFieldTableCell.forTableColumn());
    	}    	
    	else {
    		column4.setText("");
    		column4.setCellValueFactory(new PropertyValueFactory(null));
    	}
    	
    	if(size-->0) {
    		column5.setText(columnName[4]);
    		column5.setCellValueFactory(new PropertyValueFactory(columnName[4]));
    		column5.setCellFactory(TextFieldTableCell.forTableColumn());
    	}
    	else {
    		column5.setText("");
    		column5.setCellValueFactory(new PropertyValueFactory(null));
    	}
		//get input text
		for(int i =0;i<result.size();i++) {
			data.add(result.get(i));
		}
    	table.setEditable(true);
		table.setItems(data);
		//logging.setText(log);
		//getConsole();
	}
	
	public String getInput() {
		if(repertory.isSelected()) {
			//check book input field
			if(k_ISBNcheck.isSelected()) {
				input.put(entity.repertory.tname_ISBN, k_ISBN.getText());
			}
			if(k_libcheck.isSelected()) {
				input.put(entity.repertory.tname_libraryID, k_lib.getText());
			}
			if(k_roomcheck.isSelected()) {
				input.put(entity.repertory.tname_RoomNum, k_room.getText());
			}
			if(k_shelfcheck.isSelected()) {
				input.put(entity.repertory.tname_BookShelfNum, k_shelf.getText());
			}
			if(k_numcheck.isSelected()) {
				input.put(entity.repertory.tname_Number, k_num.getText());
			}
			return trepertory_name;
		}
		
		
		if(book.isSelected()) {
			//check book input field
			if(t_ISBNcheck.isSelected()) {
				input.put(entity.book.tname_ISBN, t_ISBN.getText());
			}
			if(t_titlecheck.isSelected()) {
				input.put(entity.book.tname_Title, t_title.getText());
			}
			if(t_presscheck.isSelected()) {
				input.put(entity.book.tname_Press, t_press.getText());
			}
			return tbook_name;
		}
		
		if(reader.isSelected()) {
			//check book input field
			if(d_namecheck.isSelected()) {
				input.put(entity.reader.tname_name, d_name.getText());
			}
			if(d_borrcardcheck.isSelected()) {
				input.put(entity.reader.tname_readerID, d_borrcard.getText());
			}
			if(b_sexcheck.isSelected()) {
				input.put(entity.reader.tname_sex, b_sex.getText());
			}
			if(d_validdatecheck.isSelected()) {
				input.put(entity.reader.tname_validate_s, d_validdate_s.getText());
				input.put(entity.reader.tname_validate_e, d_validdate_e.getText());
			}
			return treader_name;
		}
		
		if(librarian.isSelected()) {
			//check book input field
			if(t_workerIDcheck.isSelected()) {
				input.put(entity.librarian.tname_workerID, t_workerIDcheck.getText());
			}
			if(t_workernamecheck.isSelected()) {
				input.put(entity.librarian.tname_workername, t_workernamecheck.getText());
			}
			if(t_libcheck.isSelected()) {
				input.put(entity.librarian.tname_libraryID, t_libcheck.getText());
			}
			if(t_roomcheck.isSelected()) {
				input.put(entity.librarian.tname_RoomNum, t_roomcheck.getText());
			}
			return tlibrarian_name;
		}
		
		if(shelf.isSelected()) {
			//check book input field
			if(s_shelfcheck.isSelected()) {
				input.put(entity.bookshelf.tname_bookshelfNum, s_shelf.getText());
			}
			if(s_roomcheck.isSelected()) {
				input.put(entity.bookshelf.tname_RoomNum, s_room.getText());
			}
			if(s_libcheck.isSelected()) {
				input.put(entity.bookshelf.tname_libraryID, s_lib.getText());
			}
			if(s_typecheck.isSelected()) {
				input.put(entity.bookshelf.tname_category, s_type.getText());
			}
			return tbookshelf_name;
		}
		
		if(supplier.isSelected()) {
			//check book input field
			if(g_supplierIDcheck.isSelected()) {
				input.put(entity.supplier.tname_supplierID, g_supplierID.getText());
			}
			if(g_namecheck.isSelected()) {
				input.put(entity.supplier.tname_supplierName, g_name.getText());
			}
			if(g_phonecheck.isSelected()) {
				input.put(entity.supplier.tname_phoneNumber, g_phone.getText());
			}
			return tsupplier_name;
		}
		
		if(record.isSelected()) {
			//check book input field
			if(j_ISBNcheck.isSelected()) {
				input.put(entity.BorrowRecord.tname_ISBN, j_ISBN.getText());
			}
			if(j_borrCardcheck.isSelected()) {
				input.put(entity.BorrowRecord.tname_readerID, j_borrCard.getText());
			}
			if(j_borrDatecheck.isSelected()) {
				input.put(entity.BorrowRecord.tname_Bdate, j_borrDate.getText());
			}
			if(j_returnDatecheck.isSelected()) {
				input.put(entity.BorrowRecord.tname_Rdate, j_returnDate.getText());
			}
			if(j_numcheck.isSelected()) {
				input.put(entity.BorrowRecord.tname_bNum, j_num.getText());
			}
			return tBorrowRecord_name;
		}
		
		if(library.isSelected()) {
			//check book input field
			if(c_libcheck.isSelected()) {
				input.put(entity.library.tname_LibraryID, c_lib.getText());
			}
			if(c_namecheck.isSelected()) {
				input.put(entity.library.tname_libraryName, c_name.getText());
			}
			if(c_addrcheck.isSelected()) {
				input.put(entity.library.tname_libraryaddr, c_addr.getText());
			}
			return tlibrary_name;
		}
		
		if(operAccount.isSelected()) {
			//check book input field
			if(c_ISBNcheck.isSelected()) {
				input.put(entity.operAccount.tname_ISBN, c_ISBN.getText());
			}
			if(c_borrCardcheck.isSelected()) {
				input.put(entity.operAccount.tname_readerID, c_borrCard.getText());
			}
			if(c_workerIDcheck.isSelected()) {
				input.put(entity.operAccount.tname_workerID, c_workerID.getText());
			}
			if(c_operTypecheck.isSelected()) {
				input.put(entity.operAccount.tname_operType, c_operType.getText());
			}
			if(c_operDatecheck.isSelected()) {
				input.put(entity.operAccount.tname_operDate, c_operDate.getText());
			}
			return toperAccount_name;
		}
		
		if(instockForm.isSelected()) {
			//check book input field
			if(tr_formIDcheck.isSelected()) {
				input.put(entity.replenishFrom.tname_formID, tr_formID.getText());
			}
			if(tr_libcheck.isSelected()) {
				input.put(entity.replenishFrom.tname_libraryID, tr_lib.getText());
			}
			if(tr_suppliercheck.isSelected()) {
				input.put(entity.replenishFrom.tname_supplierID, tr_supplier.getText());
			}
			return tsupplier_name;
		}
		
		if(instockAccount.isSelected()) {
			//check book input field
			if(rl_accountcheck.isSelected()) {
				input.put(entity.storeAccount.tname_accountID, rl_account.getText());
			}
			if(rl_libIDcheck.isSelected()) {
				input.put(entity.storeAccount.tname_libraryID, rl_libID.getText());
			}
			if(rl_ISBNcheck.isSelected()) {
				input.put(entity.storeAccount.tname_ISBN, rl_ISBN.getText());
			}
			if(rl_booknumcheck.isSelected()) {
				input.put(entity.storeAccount.tname_bookNum, rl_booknum.getText());
			}
			if(rl_formIDcheck.isSelected()) {
				input.put(entity.storeAccount.tname_formID, rl_formID.getText());
			}
			return tstoreAccount_name;
		}
		
		if(instockDetail.isSelected()) {
			//check book input field
			if(rm_formcheck.isSelected()) {
				input.put(entity.storeList.tname_formID, rm_form.getText());
			}
			if(rm_ISBNcheck.isSelected()) {
				input.put(entity.storeList.tname_ISBN, rm_ISBN.getText());
			}
			if(rm_numcheck.isSelected()) {
				input.put(entity.storeList.tname_Num, rm_num.getText());
			}
			return tstoreList_name;
		}
		
		if(room.isSelected()) {
			//check book input field
			if(f_roomcheck.isSelected()) {
				input.put(entity.room.tname_RoomNum, f_room.getText());
			}
			if(f_libcheck.isSelected()) {
				input.put(entity.room.tname_libraryID, f_lib.getText());
			}
			if(f_typecheck.isSelected()) {
				input.put(entity.room.tname_type, f_type.getText());
			}
			return troom_name;
		}
		return null;
	}
	
	void getConsole() throws IOException {
		PipedInputStream pipedIS = new PipedInputStream();     
		PipedOutputStream pipedOS = new PipedOutputStream();     
		try {     
			pipedOS.connect(pipedIS);     
		}     
		catch(IOException e) {     
			System.err.println("Á¬½ÓÊ§°Ü");     
			System.exit(1);     
		}     
		byte[] temp = new byte[100];
		PrintStream ps = new PrintStream(pipedOS);     
		System.setOut(ps); 
		System.setErr(ps);  
		String temp1 = new String(temp);
		pipedIS.read(temp, 0, 100);
		logging.setText(temp1);
	}
	
	public char[] getChars (byte[] bytes) {
	      Charset cs = Charset.forName ("UTF-8");
	      ByteBuffer bb = ByteBuffer.allocate (bytes.length);
	      bb.put (bytes);
	                 bb.flip ();
	       CharBuffer cb = cs.decode (bb);
	  
	   return cb.array();
	}

}
