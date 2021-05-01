package life.zhogjiane.community.mapper;

import life.zhogjiane.community.model.Comment;

/**
 * 评论ext映射器
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}