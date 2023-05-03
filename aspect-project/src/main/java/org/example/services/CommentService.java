package org.example.services;

import org.example.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private final Logger logger =
            Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publish comment: " + comment.getText());
        return "SUCCESS";
    }
}
