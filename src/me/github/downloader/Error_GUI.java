package me.github.downloader;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Error_GUI {

	private JFrame frmYourDownloadFailed;

	/**
	 * Launch the application.
	 */
	public static void error() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error_GUI window = new Error_GUI();
					window.frmYourDownloadFailed.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Error_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmYourDownloadFailed = new JFrame();
		frmYourDownloadFailed.setTitle("Your Download failed!");
		frmYourDownloadFailed.setIconImage(Toolkit.getDefaultToolkit().getImage("assets/window-error-icon.png"));
		frmYourDownloadFailed.setBounds(100, 100, 374, 200);
		frmYourDownloadFailed.getContentPane().setLayout(null);
		
		JLabel lblfail = new JLabel("<html><body><center><h3>Your Download has failed!<br>For more Information look into your console</h3></center></body></html>");
		lblfail.setHorizontalAlignment(SwingConstants.CENTER);
		lblfail.setBounds(12, 45, 350, 49);
		frmYourDownloadFailed.getContentPane().add(lblfail);
		
		JButton btnok = new JButton("OK");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmYourDownloadFailed.dispose();
			}
		});
		btnok.setBounds(132, 106, 105, 27);
		frmYourDownloadFailed.getContentPane().add(btnok);
		
		JLabel lblimg = new JLabel("");
		lblimg.setIcon(new ImageIcon("assets/window-error-icon.png"));
		lblimg.setBounds(165, 12, 38, 37);
		frmYourDownloadFailed.getContentPane().add(lblimg);
	}

}
