package org.example;

import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);

        CommentService service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Andrii");
        comment.setText("Demo text");

        String value = service.publishComment(comment);

        logger.info(value);
    }
}