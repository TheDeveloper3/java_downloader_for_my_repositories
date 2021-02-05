package me.github.downloader;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class Main {
	static String newestV;
	static String currentV = "1.0";
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		if (Files.exists(Paths.get("assets"))) {
			GUI_main.GUI_dl();
		}else {
			try {
				new File("config").mkdirs();
				Downloader.download("https://github.com/TheDeveloper3/java_downloader_for_my_repositories/raw/main/pkg.properties", "config/pkg.properties");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 368, 203);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><body><center><h3>This Downloader needs some assets, which will be downloaded, when you click on the \"OK\" button below</h3></center></body></html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 12, 344, 79);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GUI_main.GUI_dl();
			}
		});
		btnOK.setBounds(129, 103, 105, 27);
		frame.getContentPane().add(btnOK);
	}
}
