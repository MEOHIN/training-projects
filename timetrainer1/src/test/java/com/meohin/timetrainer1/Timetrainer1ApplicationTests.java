package com.meohin.timetrainer1;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.meohin.timetrainer1.entity.Task;
import com.meohin.timetrainer1.repository.TaskRepository;

@SpringBootTest
class Timetrainer1ApplicationTests {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    void testJPA() {
        Task t1 = new Task();
        t1.setSubject("200p 한국어 비문학 읽기");
        t1.setDescription("매일 5페이지 읽기");
        t1.setEstimatedAt("2시간");
        t1.setCreatedAt(LocalDateTime.of(2007, 12, 3, 10, 15, 30));
        t1.setModifiedAt(LocalDateTime.of(2023, 5, 9, 7, 30, 0));
        this.taskRepository.save(t1);

        Task t2 = new Task();
        t2.setSubject("영상 편집");
        t2.setDescription("미오인 브이로그 하루 3시간 편집");
        t2.setEstimatedAt("2시간 30분");
        t2.setCreatedAt(LocalDateTime.of(2023, 5, 2, 17, 20, 0));
        this.taskRepository.save(t2);

        Task t3 = new Task();
        t3.setSubject("21일 습관 만들기");
        t3.setDescription("매일 20분");
        t3.setEstimatedAt("5시간");
        t3.setCreatedAt(LocalDateTime.of(2023, 5, 4, 21, 5, 0));
        this.taskRepository.save(t3);
    }
}