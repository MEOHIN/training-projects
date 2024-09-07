package com.meohin.timetrainer1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meohin.timetrainer1.entity.Task;

public interface TaskRepository extends JpaRepository<Task , Integer>{

}
