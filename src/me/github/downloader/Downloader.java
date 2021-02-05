package me.github.downloader;

import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class Downloader {
	public static void download(String url, String localFile) throws Exception {

		System.out.println("Downloading " + localFile);

		ReadableByteChannel in = Channels.newChannel(new URL(url).openStream());
		FileOutputStream fos = new FileOutputStream(localFile);
		FileChannel channel = fos.getChannel();
		channel.transferFrom(in, 0, Long.MAX_VALUE);
		channel.close();
		fos.close();

		System.out.println("Download complete");

		}
}
