package com.springboot.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.model.JournalEntry;

public interface JournalEntryRepository extends JpaRepository<JournalEntry, Integer>{
	


}
