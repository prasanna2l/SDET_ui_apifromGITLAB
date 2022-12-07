package com.restapi.project.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class musicEntity {
	@Id
	private int song_Id;
	private String Song;
	private String Movie_name;
	private String Singer;
	private String Genere;

	public musicEntity() {
		super();
	}
	
	@Override
	public String toString() {
		return "musicEntity [song_Id=" + song_Id + ", Song=" + Song + ", Movie_name=" + Movie_name + ", Singer="
				+ Singer + ", Genere=" + Genere + "]";
	}
	
	public musicEntity(int song_Id, String song, String movie_name, String singer, String genere) {
		super();
		this.song_Id = song_Id;
		Song = song;
		Movie_name = movie_name;
		Singer = singer;
		Genere = genere;
	}
	
	public int getSong_Id() {
		return song_Id;
	}
	public void setSong_Id(int song_Id) {
		this.song_Id = song_Id;
	}
	public String getSong() {
		return Song;
	}
	public void setSong(String song) {
		Song = song;
	}
	public String getMovie_name() {
		return Movie_name;
	}
	public void setMovie_name(String movie_name) {
		Movie_name = movie_name;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String genere) {
		Genere = genere;
	}
}