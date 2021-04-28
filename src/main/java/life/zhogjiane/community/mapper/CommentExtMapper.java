package life.zhogjiane.community.mapper;

import life.zhogjiane.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}