package life.zhogjiane.community.dto;

import life.zhogjiane.community.model.User;
import lombok.Data;


/**
 * 评论dto
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
