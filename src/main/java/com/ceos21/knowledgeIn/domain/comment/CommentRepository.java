package com.ceos21.knowledgeIn.domain.comment;

import com.ceos21.knowledgeIn.domain.comment.dto.CommentResponseDTO;
import com.ceos21.knowledgeIn.domain.post.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findAllByPost(Post post, Pageable pageable);
}
