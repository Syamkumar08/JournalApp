package com.springboot.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.demo.model.Tasks;

@Repository
public interface JournalEntryRepo extends JpaRepository<Tasks, Integer>{

    @Query("select t from Tasks t where MONTH(task_date) = MONTH(curdate()) and YEAR(task_date) = YEAR(curdate()) and task_name =:taskName")
    public List<Tasks> getAllCurrentEntriesWithName(String taskName);

}
