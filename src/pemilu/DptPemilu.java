package pemilu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DptPemilu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Nama;
	private JTextField Umur;
	JLabel info;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DptPemilu frame = new DptPemilu();
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
	public DptPemilu() {
		setTitle("DptPemilu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAplikasiPinjamanOnline = new JLabel("Aplikasi DPT Pemilu 2024");
		lblAplikasiPinjamanOnline.setFont(new Font("ROG Fonts", Font.PLAIN, 22));
		lblAplikasiPinjamanOnline.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplikasiPinjamanOnline.setBounds(10, 11, 651, 28);
		contentPane.add(lblAplikasiPinjamanOnline);
		
		Nama = new JTextField();
		Nama.setBounds(163, 95, 402, 28);
		contentPane.add(Nama);
		Nama.setColumns(10);
		
		JLabel labelnama = new JLabel("Nama");
		labelnama.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelnama.setBounds(106, 100, 46, 14);
		contentPane.add(labelnama);
		
		Umur = new JTextField();
		Umur.setColumns(10);
		Umur.setBounds(163, 157, 201, 28);
		contentPane.add(Umur);
		
		JLabel labelUmur = new JLabel("Umur");
		labelUmur.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelUmur.setBounds(106, 162, 46, 14);
		contentPane.add(labelUmur);
		
		JLabel labelStatus = new JLabel("Status Pernikahan");
		labelStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelStatus.setBounds(106, 223, 187, 14);
		contentPane.add(labelStatus);
		
		JComboBox cbMenikah = new JComboBox();
		cbMenikah.setModel(new DefaultComboBoxModel(new String[] {"-", "Sudah Menikah", "Belum Menikah"}));
		cbMenikah.setBounds(258, 221, 130, 22);
		contentPane.add(cbMenikah);
		
		JLabel infomazzeh = new JLabel("");
		infomazzeh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		infomazzeh.setBounds(106, 269, 459, 116);
		contentPane.add(infomazzeh);
		
		JButton btnproses = new JButton("PROSES");
		btnproses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = Nama.getText();
				int umur = Integer.parseInt(Umur.getText());
				String status = cbMenikah.getSelectedItem().toString();
				
				if (umur>17) {
					infomazzeh.setText(n+", Terdaftar Di DPT");
				} else if ((umur<17)&&(status.equals("ya"))){
					infomazzeh.setText(n+", Terdaftar Di DPT");
				} else if ((umur<17)&&(!status.equals("ya"))) {
					infomazzeh.setText(n+", Tidak bisa ikut memilih di Pemilu 2024");
				}
			}
		});
		btnproses.setBounds(104, 400, 89, 23);
		contentPane.add(btnproses);
		
		JButton btnreset = new JButton("RESET");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nama.setText("");
				Umur.setText("");
				cbMenikah.setSelectedIndex(0);
				infomazzeh.setText("");
				
			}
		});
		btnreset.setBounds(476, 400, 89, 23);
		contentPane.add(btnreset);
	}
}
