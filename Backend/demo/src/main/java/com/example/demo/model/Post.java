package com.example.demo.model;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;

@Entity
public class Post {
    @Id
    private Long postid;
    private String author;
    private String answer;
    private String date;
    private Long threadid;
    public Long getPostid() {
        return postid;
    }

    public void setPostid(Long postid) {
        this.postid = postid;
    }

    public Long getThreadid() {
        return threadid;
    }

    public void setThreadid(Long threadid) {
        this.threadid = threadid;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
  
}