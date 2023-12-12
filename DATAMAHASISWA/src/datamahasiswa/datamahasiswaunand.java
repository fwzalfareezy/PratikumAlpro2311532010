package datamahasiswa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class datamahasiswaunand extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField namaa;
	private JTextField nimm;
	private JComboBox comboBoxJurusan;
	private JLabel infomazzeh;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datamahasiswaunand frame = new datamahasiswaunand();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public datamahasiswaunand() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATA MAHASISWA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 11, 488, 44);
		contentPane.add(lblNewLabel);
		
		namaa = new JTextField();
		namaa.setBounds(220, 111, 541, 23);
		contentPane.add(namaa);
		namaa.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 111, 200, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NIM");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 168, 200, 23);
		contentPane.add(lblNewLabel_1_1);
		
		nimm = new JTextField();
		nimm.setColumns(10);
		nimm.setBounds(220, 168, 541, 23);
		contentPane.add(nimm);
		
		JComboBox comboBoxJurusan = new JComboBox();
		comboBoxJurusan.setModel(new DefaultComboBoxModel(new String[] {"-", "Sastra Mesin(FTIB)", "Informatika (FTI)", "Teknik Komputer (FTI)", "Sistem Informasi (FTI)"}));
		comboBoxJurusan.setBounds(220, 225, 409, 22);
		contentPane.add(comboBoxJurusan);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Jurusan");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(10, 222, 200, 23);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton tombolokeh = new JButton("Proses");
		tombolokeh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = namaa.getText();
				String jurusan = comboBoxJurusan.getSelectedItem(). toString();
				
				
			}
		});
		tombolokeh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tombolokeh.setBounds(159, 443, 89, 23);
		contentPane.add(tombolokeh);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				namaa.setText("");
				nimm.setText("");
				comboBoxJurusan.setSelectedIndex(0);
				infomazzeh.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnReset.setBounds(540, 443, 89, 23);
		contentPane.add(btnReset);
		
		JLabel infomazzeh = new JLabel("");
		infomazzeh.setBounds(159, 258, 470, 159);
		contentPane.add(infomazzeh);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, namaa, lblNewLabel_1, lblNewLabel_1_1, nimm, comboBoxJurusan, lblNewLabel_1_1_1, tombolokeh, btnReset, infomazzeh}));
	}
}
