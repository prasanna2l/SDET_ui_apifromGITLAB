package com.restapi.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restapi.project.entities.musicEntity;
import com.restapi.project.musicapp.dao.musicapp_dao;

@Component
public class musicAppService_Impl implements musicAppServices{
		@Autowired
		musicapp_dao music_app_dao;
	
		@Override
		public List<musicEntity> getallSongs() {
			return music_app_dao.findAll();
		}


		@Override
		public musicEntity getSongbySongId(int Song_Id) {
			return music_app_dao.getOne(Song_Id);
		}
		
		@Override
		public musicEntity addsong(musicEntity addsong) {
			music_app_dao.save(addsong);
			return addsong;
		}

		@Override
		public musicEntity updateSong(musicEntity update) {
			music_app_dao.save(update);
		      return update; 
			  }
		@Override
		public void deleteSong(int Song_Id) {
			musicEntity entity = music_app_dao.getOne(Song_Id);
			music_app_dao.delete(entity);
		}
	}
