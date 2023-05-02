package org.example;

import org.example.config.ProjectConfiguration;
import org.example.model.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        ProjectConfiguration.class);

        Comment comment = new Comment();
        comment.setAuthor("Andrii");
        comment.setText("Demo text");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}