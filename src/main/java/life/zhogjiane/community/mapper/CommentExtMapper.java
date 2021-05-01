package life.zhogjiane.community.mapper;

import life.zhogjiane.community.model.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评论ext映射器
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Mapper
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}