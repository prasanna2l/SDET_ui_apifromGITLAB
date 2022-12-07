package com.restapi.project.service;

import java.util.List;

import com.restapi.project.entities.musicEntity;


public interface musicAppServices {

	public List<musicEntity> getallSongs();

	public musicEntity getSongbySongId(int Song_Id);

	public musicEntity addsong(musicEntity addsong);

	public musicEntity updateSong(musicEntity update);

	public void deleteSong(int Song_Id);
}