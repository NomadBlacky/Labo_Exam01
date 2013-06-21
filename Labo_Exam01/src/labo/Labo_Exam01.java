package labo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class Labo_Exam01 extends JFrame {

	public Labo_Exam01() {
		
		setTitle("Labo_Exam01");
		setSize(400, 300);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new MigLayout("", "[][grow]", "[]"));
		
		panel.add(new JLabel("名前："), "r, w 50");
		panel.add(new JTextField(), "grow, wrap");

		panel.add(new JLabel("メッセージ："), "r, w 50");
		panel.add(new JTextField(), "grow, wrap");
		
		panel.add(new JButton("送信"), "grow, wrap");
		
		String[] colName = { "名前", "メッセージ"};
		DefaultTableModel model = new DefaultTableModel(colName, 5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(new JTable(model));
		panel.add(scrollPane, "grow");
		
		getContentPane().add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		Labo_Exam01 frame = new Labo_Exam01();

	}
}
