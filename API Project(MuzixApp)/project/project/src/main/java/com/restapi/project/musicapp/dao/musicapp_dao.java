package com.restapi.project.musicapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.project.entities.musicEntity;

public interface musicapp_dao extends JpaRepository<musicEntity, Integer> {
}