package mmdb15;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Main {

	private static final long serialVersionUID = -2473681642900815942L;
	
	private static final int WIDTH = 1500;
	private static final int HEIGHT = 1500;
	
	private JFrame login;
	private JPanel managerOrders;
	private JPanel managerDriver;
	private JPanel driverOrders;
	private JPanel loginPanel;
	
	private JTable ordersTable;
	private JButton addButtonOrdersTable;
	private JButton updateButtonOrdersTable;
	private JButton addDriverButtonOrdersTable;
	private JButton addDriverButtonDriversTable;
	private JButton backButton;
	
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){
		login = new JFrame("DBMS");
		login.setBounds(0,0,WIDTH,HEIGHT);
		login.setVisible(true);
		
		loginPanel = new JPanel();
		
		JButton manager = new JButton("Manager");
		manager.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
				System.out.println("Manager Button gecklicked");
				initManagerWindow();
		}
		});
		loginPanel.add(manager);
		JButton driver = new JButton("Driver");
		driver.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
				System.out.println("Driver Button gecklicked");
				initDriverWindow();
		}
		});
		loginPanel.add(driver);
		
		login.add(loginPanel);
		//frame.add(driver);
		//frame.add(manager);
	}
	
	public void initManagerWindow(){
		loginPanel.setVisible(false);
		managerOrders = new JPanel();
		managerOrders.setLayout(new BorderLayout());
		managerOrders.setBounds(0, 0, WIDTH, HEIGHT);
		managerOrders.setVisible(true);
		ordersTable = new JTable();
		
		JScrollPane pane = new JScrollPane();
        pane.setViewportView(ordersTable);
        JPanel eastPanel = new JPanel();
        backButton = new JButton("Back");
        addButtonOrdersTable = new JButton("Add");
        addDriverButtonOrdersTable = new JButton("Add Driver");
        eastPanel.add(backButton);
        eastPanel.add(addButtonOrdersTable);
        eastPanel.add(addDriverButtonOrdersTable);
        
        JPanel northPanel = new JPanel();
        final JTextField txtField1 = new JTextField();
        final JTextField txtField2 = new JTextField();
        final JTextField txtField3 = new JTextField();
        final JTextField txtField4 = new JTextField();
        final JTextField txtField5 = new JTextField();
        final JTextField txtField6 = new JTextField();
        JLabel lblField1 = new JLabel("Auftragsnummer   ");
        JLabel lblField2 = new JLabel("Abholadresse   ");
        JLabel lblField3 = new JLabel("Zieladresse   ");
        JLabel lblField4 = new JLabel("Datum+Uhrzeit   ");
        JLabel lblField5 = new JLabel("Status   ");
        JLabel lblField6 = new JLabel("Fahrer   ");
        northPanel.add(lblField1);
        northPanel.add(txtField1);
        northPanel.add(lblField2);
        northPanel.add(txtField2);
        northPanel.add(lblField3);
        northPanel.add(txtField3);
        northPanel.add(lblField4);
        northPanel.add(txtField4);
        northPanel.add(lblField5);
        northPanel.add(txtField5);
        northPanel.add(lblField6);
        northPanel.add(txtField6);
        
        txtField1.setPreferredSize(lblField1.getPreferredSize());
        txtField2.setPreferredSize(lblField2.getPreferredSize());
        txtField3.setPreferredSize(lblField3.getPreferredSize());
        txtField4.setPreferredSize(lblField4.getPreferredSize());
        txtField5.setPreferredSize(lblField5.getPreferredSize());
        txtField6.setPreferredSize(lblField6.getPreferredSize());

        managerOrders.add(northPanel, BorderLayout.NORTH);
        managerOrders.add(eastPanel, BorderLayout.EAST);
        managerOrders.add(pane,BorderLayout.CENTER);
        final DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Auftragsnummer","Abholadresse","Zieladresse","Datum+Uhrzeit","Status","Fahrer"},0);
        ordersTable.setModel(tableModel);
        addButtonOrdersTable.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int count = tableModel.getRowCount()+1;
                tableModel.addRow(new Object[]{txtField1.getText(),
                		txtField2.getText(),
                		txtField3.getText(),
                		txtField4.getText(),
                		txtField5.getText(),
                		txtField6.getText()});
            }
        });
        
        addDriverButtonOrdersTable.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	initDriverTable();
            	
            	}
            });
        
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	new Main();
            }
        });
        login.add(managerOrders);
    }
	
	public void initDriverTable(){
		managerOrders.setVisible(false);
		managerDriver = new JPanel();
		managerDriver.setLayout(new BorderLayout());
		managerDriver.setBounds(0, 0, WIDTH, HEIGHT);
		managerDriver.setVisible(true);
		ordersTable = new JTable();
		
		JScrollPane pane = new JScrollPane();
        pane.setViewportView(ordersTable);
        JPanel eastPanel = new JPanel();
        backButton = new JButton("Back");
        addDriverButtonOrdersTable = new JButton("Add Driver");
        eastPanel.add(backButton);
        eastPanel.add(addDriverButtonOrdersTable);
        
        JPanel northPanel = new JPanel();
        final JTextField txtField1 = new JTextField();
        final JTextField txtField2 = new JTextField();
        final JTextField txtField3 = new JTextField();
        final JTextField txtField4 = new JTextField();
        
        JLabel lblField1 = new JLabel("Personalnummer   ");
        JLabel lblField2 = new JLabel("Vorname   ");
        JLabel lblField3 = new JLabel("Nachname   ");
        JLabel lblField4 = new JLabel("Standort   ");
        
        northPanel.add(lblField1);
        northPanel.add(txtField1);
        northPanel.add(lblField2);
        northPanel.add(txtField2);
        northPanel.add(lblField3);
        northPanel.add(txtField3);
        northPanel.add(lblField4);
        northPanel.add(txtField4);
      
        
        txtField1.setPreferredSize(lblField1.getPreferredSize());
        txtField2.setPreferredSize(lblField2.getPreferredSize());
        txtField3.setPreferredSize(lblField3.getPreferredSize());
        txtField4.setPreferredSize(lblField4.getPreferredSize());
    

        managerDriver.add(northPanel, BorderLayout.NORTH);
        managerDriver.add(eastPanel, BorderLayout.EAST);
        managerDriver.add(pane,BorderLayout.CENTER);
        final DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Personalnummer","Vorname","Nachname","Standort"},0);
        ordersTable.setModel(tableModel);
        addDriverButtonOrdersTable.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int count = tableModel.getRowCount()+1;
                tableModel.addRow(new Object[]{txtField1.getText(),
                		txtField2.getText(),
                		txtField3.getText(),
                		txtField4.getText()});
            }
        });
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	managerDriver.setVisible(false);
            	initManagerWindow();
            }
        });
        login.add(managerDriver);
		
	}

	
	public void initDriverWindow(){
		loginPanel.setVisible(false);
		driverOrders = new JPanel();
		driverOrders.setLayout(new BorderLayout());
		driverOrders.setBounds(0, 0, WIDTH, HEIGHT);
		driverOrders.setVisible(true);
		ordersTable = new JTable();
		
		JScrollPane pane = new JScrollPane();
        pane.setViewportView(ordersTable);
        JPanel eastPanel = new JPanel();
        backButton = new JButton("Back");
        updateButtonOrdersTable = new JButton("Update");
        eastPanel.add(backButton);
        eastPanel.add(updateButtonOrdersTable);
        
        JPanel northPanel = new JPanel();
     
        driverOrders.add(northPanel, BorderLayout.NORTH);
        driverOrders.add(eastPanel, BorderLayout.EAST);
        driverOrders.add(pane,BorderLayout.CENTER);
        final DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Auftragsnummer","Abholadresse","Zieladresse","Datum+Uhrzeit","Status","Fahrer"},0);
        ordersTable.setModel(tableModel);
        
        updateButtonOrdersTable.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	if(tableModel.getRowCount() >= 0 ){
            	tableModel.setValueAt("erledigt", 0, 4);
            	}
            }    
        });
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	loginPanel.setVisible(true);
            }
            });
        login.add(driverOrders);
	}
}
