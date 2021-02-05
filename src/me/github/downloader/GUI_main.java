package me.github.downloader;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
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
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.ScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class GUI_main {
	static String download1;
	static String download2;
	static String download3;
	static String download4;
	static String download5;
	static String downloadsrc1;
	static String downloadsrc2;
	static String downloadsrc3;
	static String downloadsrc4;
	static String downloadsrc5;
	static String localfile1;
	static String localfile2;
	static String localfile3;
	static String localfile4;
	static String localfile5;
	static String localfilesrc1;
	static String localfilesrc2;
	static String localfilesrc3;
	static String localfilesrc4;
	static String localfilesrc5;
	static String title1;
	static String title2;
	static String title3;
	static String title4;
	static String title5;
	static String description1;
	static String description2;
	static String description3;
	static String description4;
	static String description5;
	static String localcfg;
	static String cfgdl;
	private JFrame frmTheDevelopersDownloader;

	/**
	 * Launch the application.
	 */
	public static void GUI_dl() {
		if (Files.exists(Paths.get("assets"))) {
			// do something
		} else {
			new File("assets").mkdirs();
			try {
				Downloader.download(
						"https://icon-icons.com/downloadimage.php?id=90117&root=1369/PNG/32/&file=-file-download_90117.png",
						"assets/window-icon.png");
				Downloader.download("https://www.iconsdb.com/icons/download/red/warning-32.png",
						"assets/window-error-icon.png");
				Downloader.download("https://icons.iconarchive.com/icons/graphicloads/100-flat-2/32/check-1-icon.png",
						"assets/window-succsess-icon.png");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
			}
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_main window = new GUI_main();
					window.frmTheDevelopersDownloader.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try (InputStream input = new FileInputStream("config/pkg.properties")) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			download1 = prop.getProperty("download-1", "");
			download2 = prop.getProperty("download-2", "");
			download3 = prop.getProperty("download-3", "");
			download4 = prop.getProperty("download-4", "");
			download5 = prop.getProperty("download-5", "");
			downloadsrc1 = prop.getProperty("download-src-1", "");
			downloadsrc2 = prop.getProperty("download-src-2", "");
			downloadsrc3 = prop.getProperty("download-src-3", "");
			downloadsrc4 = prop.getProperty("download-src-4", "");
			downloadsrc5 = prop.getProperty("download-src-5", "");
			localfile1 = prop.getProperty("localfile-1", "");
			localfile2 = prop.getProperty("localfile-2", "");
			localfile3 = prop.getProperty("localfile-3", "");
			localfile4 = prop.getProperty("localfile-4", "");
			localfile5 = prop.getProperty("localfile-5", "");
			localfilesrc1 = prop.getProperty("localfile-src-1", "");
			localfilesrc2 = prop.getProperty("localfile-src-2", "");
			localfilesrc3 = prop.getProperty("localfile-src-3", "");
			localfilesrc4 = prop.getProperty("localfile-src-4", "");
			localfilesrc5 = prop.getProperty("localfile-src-5", "");
			title1 = prop.getProperty("title1", "some text for title1 here");
			title2 = prop.getProperty("title2", "some text for title2 here");
			title3 = prop.getProperty("title3", "some text for title3 here");
			title4 = prop.getProperty("title4", "some text for title4 here");
			title5 = prop.getProperty("title5", "some text for title5 here");
			description1 = prop.getProperty("description1", "some text for description1 here");
			description2 = prop.getProperty("description2", "some text for description2 here");
			description3 = prop.getProperty("description3", "some text for description3 here");
			description4 = prop.getProperty("description4", "some text for description4 here");
			description5 = prop.getProperty("description5", "some text for description5 here");
			cfgdl = prop.getProperty("download-config-file", "");
			localcfg = prop.getProperty("local-config-file", "");

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		frmTheDevelopersDownloader = new JFrame();
		frmTheDevelopersDownloader.setIconImage(Toolkit.getDefaultToolkit().getImage("assets/window-icon.png"));
		frmTheDevelopersDownloader.setTitle("The Developer's Downloader");
		frmTheDevelopersDownloader.setBounds(100, 100, 536, 778);
		frmTheDevelopersDownloader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheDevelopersDownloader.getContentPane().setLayout(null);

		JButton Install_btn_3 = new JButton("Download");
		Install_btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(download3, localfile3);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Error_GUI.error();
				}
			}
		});
		Install_btn_3.setToolTipText("Download the compiled and runnable JAR file");
		Install_btn_3.setBounds(401, 338, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Install_btn_3);

		JButton Install_btn_2 = new JButton("Download");
		Install_btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(download2, localfile2);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
				}
			}
		});
		Install_btn_2.setToolTipText("Download the compiled and runnable JAR file");
		Install_btn_2.setBounds(401, 222, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Install_btn_2);

		JButton Install_btn_1 = new JButton("Download");
		Install_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(download1, localfile1);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
					System.out.println("Download failed!");
				}
			}
		});
		Install_btn_1.setToolTipText("Download the compiled and runnable JAR file");
		Install_btn_1.setBounds(401, 108, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Install_btn_1);

		JTextPane txtpnWebserverWithGui = new JTextPane();
		txtpnWebserverWithGui.setEditable(false);
		txtpnWebserverWithGui.setText(description1);
		txtpnWebserverWithGui.setBounds(22, 67, 377, 68);
		frmTheDevelopersDownloader.getContentPane().add(txtpnWebserverWithGui);

		JLabel lblWebServerWith = new JLabel(title1);
		lblWebServerWith.setBounds(22, 28, 151, 27);
		frmTheDevelopersDownloader.getContentPane().add(lblWebServerWith);

		JTextPane txtpnthisIsComming = new JTextPane();
		txtpnthisIsComming.setEditable(false);
		txtpnthisIsComming.setText(description2);
		txtpnthisIsComming.setBounds(22, 181, 377, 68);
		frmTheDevelopersDownloader.getContentPane().add(txtpnthisIsComming);

		JTextPane txtpnthisIsComming_1 = new JTextPane();
		txtpnthisIsComming_1.setEditable(false);
		txtpnthisIsComming_1.setText(description3);
		txtpnthisIsComming_1.setBounds(22, 297, 377, 68);
		frmTheDevelopersDownloader.getContentPane().add(txtpnthisIsComming_1);

		JButton Redownload_btn = new JButton("Re-download this program");
		Redownload_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(
							"https://github.com/TheDeveloper3/java_downloader_for_my_repositories/blob/main/TheDev_Downloader.jar?raw=true",
							"TheDev_Downloader.jar");
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();

				}
			}
		});
		Redownload_btn
				.setToolTipText("Download the program again (it will download the newest version of this program)");
		Redownload_btn.setBounds(288, 694, 227, 27);
		frmTheDevelopersDownloader.getContentPane().add(Redownload_btn);

		JLabel label = new JLabel(
				"___________________________________________________________________________________________________");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 132, 512, 17);
		frmTheDevelopersDownloader.getContentPane().add(label);

		JLabel label_1 = new JLabel(
				"___________________________________________________________________________________________________");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(12, 243, 512, 17);
		frmTheDevelopersDownloader.getContentPane().add(label_1);

		JLabel label_2 = new JLabel(
				"___________________________________________________________________________________________________");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(12, 361, 512, 17);
		frmTheDevelopersDownloader.getContentPane().add(label_2);

		JTextPane txtpnthisIsComming_1_1 = new JTextPane();
		txtpnthisIsComming_1_1.setEditable(false);
		txtpnthisIsComming_1_1.setText(description4);
		txtpnthisIsComming_1_1.setBounds(22, 411, 377, 68);
		frmTheDevelopersDownloader.getContentPane().add(txtpnthisIsComming_1_1);

		JButton Install_btn_4 = new JButton("Download");
		Install_btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(download4, localfile4);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated ca
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
				}
			}
		});
		Install_btn_4.setToolTipText("Download the compiled and runnable JAR file");
		Install_btn_4.setBounds(401, 452, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Install_btn_4);

		JButton Install_btn_5 = new JButton("Download");
		Install_btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(download5, localfile5);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
				}
			}
		});
		Install_btn_5.setToolTipText("Download the compiled and runnable JAR file");
		Install_btn_5.setBounds(401, 566, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Install_btn_5);

		JLabel label_2_1 = new JLabel(
				"___________________________________________________________________________________________________");
		label_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_2_1.setBounds(12, 475, 512, 17);
		frmTheDevelopersDownloader.getContentPane().add(label_2_1);

		JTextPane txtpnthisIsComming_1_1_1 = new JTextPane();
		txtpnthisIsComming_1_1_1.setEditable(false);
		txtpnthisIsComming_1_1_1.setText(description5);
		txtpnthisIsComming_1_1_1.setBounds(22, 525, 377, 68);
		frmTheDevelopersDownloader.getContentPane().add(txtpnthisIsComming_1_1_1);

		JButton Sourcecode_btn_1 = new JButton("Sourcecode");
		Sourcecode_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(downloadsrc1, localfilesrc1);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
				}

			}
		});
		Sourcecode_btn_1.setToolTipText("Download the Sourcecode of the programm with Readme");
		Sourcecode_btn_1.setBounds(401, 67, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Sourcecode_btn_1);

		JButton Sourcecode_btn_1_1 = new JButton("Sourcecode");
		Sourcecode_btn_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(downloadsrc2, localfilesrc2);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
				}
			}
		});
		Sourcecode_btn_1_1.setToolTipText("Download the Sourcecode of the programm with Readme");
		Sourcecode_btn_1_1.setBounds(401, 181, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Sourcecode_btn_1_1);

		JButton Sourcecode_btn_1_2 = new JButton("Sourcecode");
		Sourcecode_btn_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(downloadsrc3, localfilesrc3);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
				}
			}
		});
		Sourcecode_btn_1_2.setToolTipText("Download the Sourcecode of the programm with Readme");
		Sourcecode_btn_1_2.setBounds(401, 297, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Sourcecode_btn_1_2);

		JButton Sourcecode_btn_1_3 = new JButton("Sourcecode");
		Sourcecode_btn_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(downloadsrc4, localfilesrc4);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
				}
			}
		});
		Sourcecode_btn_1_3.setToolTipText("Download the Sourcecode of the programm with Readme");
		Sourcecode_btn_1_3.setBounds(401, 411, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Sourcecode_btn_1_3);

		JButton Sourcecode_btn_1_4 = new JButton("Sourcecode");
		Sourcecode_btn_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(downloadsrc5, localfilesrc5);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
				}
			}
		});
		Sourcecode_btn_1_4.setToolTipText("Download the Sourcecode of the programm with Readme");
		Sourcecode_btn_1_4.setBounds(401, 525, 114, 27);
		frmTheDevelopersDownloader.getContentPane().add(Sourcecode_btn_1_4);

		JLabel lblTheDevelopersDownloader = new JLabel("<html><body><h2>The Developer's Downloader</h2></body></html>");
		lblTheDevelopersDownloader.setBounds(136, 0, 263, 27);
		frmTheDevelopersDownloader.getContentPane().add(lblTheDevelopersDownloader);

		JLabel lblTitle2 = new JLabel(title2);
		lblTitle2.setBounds(22, 147, 348, 32);
		frmTheDevelopersDownloader.getContentPane().add(lblTitle2);

		JLabel lblTitle3 = new JLabel(title3);
		lblTitle3.setBounds(22, 263, 348, 32);
		frmTheDevelopersDownloader.getContentPane().add(lblTitle3);

		JLabel lblTitle4 = new JLabel(title4);
		lblTitle4.setBounds(22, 377, 348, 32);
		frmTheDevelopersDownloader.getContentPane().add(lblTitle4);

		JLabel lblTitle5 = new JLabel(title5);
		lblTitle5.setBounds(22, 491, 348, 32);
		frmTheDevelopersDownloader.getContentPane().add(lblTitle5);

		JButton btndlcfg = new JButton("update package list");
		btndlcfg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Downloader.download(cfgdl, localcfg);
					Download_succsess.succsess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Download_succsess.frmDownloadSuccsessfull.dispose();
					Error_GUI.error();
				}
			}
		});
		btndlcfg.setBounds(22, 694, 191, 27);
		frmTheDevelopersDownloader.getContentPane().add(btndlcfg);
	}
}
