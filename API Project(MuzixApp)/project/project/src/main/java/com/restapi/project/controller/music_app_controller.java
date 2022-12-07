package com.restapi.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.project.entities.musicEntity;
import com.restapi.project.service.musicAppServices;



@RestController
public class music_app_controller {
	
	@Autowired
	private musicAppServices servicecontrol;
	
	@GetMapping("/allsongs")
	public List<musicEntity> getallSongs()
	{
		return this.servicecontrol.getallSongs();
	}

	@GetMapping("/Song/{song_Id}")
	public musicEntity getSongbySongId(@PathVariable int Song_Id)
	{
		return this.servicecontrol.getSongbySongId(Song_Id);
	}

	@PostMapping("/AddSong")
	public musicEntity addsong(@RequestBody musicEntity addsong){
		return this.servicecontrol.addsong(addsong);
	}

	@PutMapping("/UpdateSong/{song_Id}")
	public musicEntity updateSong(@RequestBody musicEntity update) {
		return this.servicecontrol.updateSong(update);
	}

	@DeleteMapping("/DeleteSong/{song_Id}")
	public ResponseEntity<HttpStatus> deleteSong(@PathVariable int Song_Id)
	{
		try {
			this.servicecontrol.deleteSong(Song_Id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}