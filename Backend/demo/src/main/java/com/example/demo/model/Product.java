package com.example.demo.model;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;



@Entity
public class Product {
    @Id
    
    private Long id;
    private Long thread_id;
    private String author;
    private String answer;
    // private String date;
    public Long getId() {
        return id;
    }
    public void setid(Long id) {
        this.id = id;
    }
    public Long getThread_id() {
        return thread_id;
    }
    public void setThread_id(Long thread_id) {
        this.thread_id = thread_id;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    // public String getDate() {
    //     return date;
    // }
    // public void setDate(String date) {
    //     this.date = date;
    // }
    
  
}