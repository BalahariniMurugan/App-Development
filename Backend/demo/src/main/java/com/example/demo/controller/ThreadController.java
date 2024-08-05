package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Thread;
import com.example.demo.service.ThreadService;

@RestController
@RequestMapping("/thread")
public class ThreadController {
    @Autowired
    private ThreadService threadService;

    @GetMapping
    public List<Thread> getAllThread() {
        return threadService.getAllThread();
    }

    @GetMapping("/{threadid}")
    public Thread getPostById(@PathVariable Long threadid) {
        return threadService.getThreadById(threadid);
    }

    @PostMapping
    public Thread createPost(@RequestBody Thread thread) {
        return threadService.saveThread(thread);
    }

    @PutMapping("/{threadid}")
    public Thread updatePost(@PathVariable Long threadid, @RequestBody Thread thread) {
        thread.setThreadid(threadid);
        return threadService.saveThread(thread);
    }

    @DeleteMapping("/{threadid}")
    public void deletePost(@PathVariable Long threadid) {
        threadService.deleteThread(threadid);
    }
}
