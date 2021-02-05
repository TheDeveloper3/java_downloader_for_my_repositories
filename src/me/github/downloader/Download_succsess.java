package me.github.downloader;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Download_succsess {

	static JFrame frmDownloadSuccsessfull;

	/**
	 * Launch the application.
	 */
	public static void succsess() {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					Download_succsess window = new Download_succsess();
					window.frmDownloadSuccsessfull.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Download_succsess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDownloadSuccsessfull = new JFrame();
		frmDownloadSuccsessfull.setIconImage(Toolkit.getDefaultToolkit().getImage("assets/window-succsess-icon.png"));
		frmDownloadSuccsessfull.setTitle("Download Succsessfull");
		frmDownloadSuccsessfull.setBounds(100, 100, 312, 225);
		frmDownloadSuccsessfull.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDownloadSuccsessfull.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDownloadSuccsessfull.dispose();
			}
		});
		btnNewButton.setBounds(98, 125, 105, 27);
		frmDownloadSuccsessfull.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("<html><center><body><h3>Your Download was Succsessfull</h3><center></body></html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 94, 288, 19);
		frmDownloadSuccsessfull.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("assets/window-succsess-icon.png"));
		lblNewLabel_1.setBounds(134, 49, 47, 33);
		frmDownloadSuccsessfull.getContentPane().add(lblNewLabel_1);
	}
}
