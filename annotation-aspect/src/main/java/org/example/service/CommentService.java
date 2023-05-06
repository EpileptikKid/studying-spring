package org.example.service;

import org.example.ToLog;
import org.example.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publish comment: " + comment.getText());
        return "PUBLISH";
    }

    @ToLog
    public String deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
        return "DELETE";
    }

    public String editComment(Comment comment) {
        logger.info("Editing comment: " + comment.getText());
        return "EDIT";
    }
}
