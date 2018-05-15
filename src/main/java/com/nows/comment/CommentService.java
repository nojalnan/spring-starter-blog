package com.nows.comment;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {

	private final CommentRepository commentRepository;

	public Comment createComment(Comment comment) {
		comment.setRegDate(LocalDateTime.now());
		return commentRepository.save(comment);
	}

	public void deleteComment(Long commentId) {
		commentRepository.delete(commentId);
	}
}