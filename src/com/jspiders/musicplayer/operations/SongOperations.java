package com.jspiders.musicplayer.operations;
 
import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.musicplayer.entity.Song;

public class SongOperations{

	Scanner scanner = new Scanner(System.in);
	Song song = new Song();
	
	
	ArrayList<Song> playlist= new ArrayList<Song>();
	static int cnt = 0;
	
	
	public void playAllSong() {
		if (playlist.isEmpty()) {
			System.out.println("No song present in playlist...please add song !!!");
		}
		for (Song song : playlist) {
			System.out.println(song.getTitle() + " song is now playing...");
		}
		
	}
	
	public void playRandomSong() {
		
		double random = Math.random();
		int random1 = (int) (random * 10) + 1;
		
		
		if (random1 > playlist.size()) {
			random1 = 1;
		}
		
		System.out.println(playlist.get(random1).getTitle() + " song is now playing...");
		
	}
	
	public void chooseSong() {
		
		System.out.println("Select song to play.");
		viewAllSongs();
		int play = scanner.nextInt();
		System.out.println(playlist.get(play - 1).getTitle() + " song is now playing...");
		
	}
	
	public void viewAllSongs() {
		if (playlist.isEmpty()) {
			System.out.println("No song present in playlist...please add song !!!");
			addSong();
		} else {
			int i = 1;
			for (Song song : playlist) {
				System.out.println(i + ":" + song.getTitle());
				i++;
			}
		}
	}
	
	public void addSong() {
		
		System.out.println("How many song you want to be add");
		int a = scanner.nextInt();
		for (int i = 0; i < a; i++) {

			playlist.add(new Song());

			System.out.println("Enter song Id: ");
			int id = scanner.nextInt();
			playlist.get(cnt).setId(id);

			System.out.println("Enter song Title: ");
			String title = scanner.next();
			playlist.get(cnt).setTitle(title);
			
			System.out.println("Enter song Singer:");
			String sname = scanner.next();
			playlist.get(cnt).setSinger(sname);

			System.out.println("Enter song Duration: ");
			double duration = scanner.nextDouble();
			playlist.get(cnt).setDuration(duration);

			System.out.println("Enter song Album: ");
			String album = scanner.next();
			playlist.get(cnt).setAlbum(album);

			System.out.println(playlist.size() + " Successfully added song...!!!");
			cnt++;
		}
		
	}
	
	public void removeSong() {

		System.out.println("Please choose a song for remove : ");
		viewAllSongs();
		int remove = scanner.nextInt();
		System.out.println(playlist.get(remove - 1).getTitle() + "Successfully remove song...!!!");
		playlist.remove(remove - 1);
		System.out.println("After Remove song:");
		viewAllSongs();
		
	}
	
	public void editSong() {
		
		System.out.println("Select song to edit");
		viewAllSongs();
		int edit = scanner.nextInt();
		playlist.remove(edit - 1);

		System.out.println("Enter song Id: ");
		int id = scanner.nextInt();
		song.setId(id);

		System.out.println("Enter song Title: ");
		String title = scanner.next();
		song.setTitle(title);
		
		System.out.println("Enter song Singer: ");
		String sname = scanner.next();
		song.setSinger(sname);

		System.out.println("Enter song Duration: ");
		double duration = scanner.nextDouble();
		song.setDuration(duration);

		System.out.println("Enter song Album: ");
		String album = scanner.next();
		song.setAlbum(album);

		playlist.add(edit - 1, song);
		System.out.println(playlist.get(edit - 1).getTitle() + " Successfully song edited...!!!");
		viewAllSongs();
	}
	
	
}
