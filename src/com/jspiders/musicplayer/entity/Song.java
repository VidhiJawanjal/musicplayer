package com.jspiders.musicplayer.entity;

public class Song {

	private int id;
	private String title;
	private String singer;
	private double duration;
	private String album;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album=album;
	}
	
//	public Song(int id , String title , String singer , double duration , String album) {
//		
//		this.id=id;
//		this.title=title;
//		this.singer=singer;
//		this.duration=duration;
//		this.album=album;
//		
//	}
	
	@Override
	public String toString() {
		
		return "Song[Id = " + id + ",Title = " + title + ",Singer = " + singer + ", Duration = " + duration + ", Album = " + album + "]";
		
	}
	
}
