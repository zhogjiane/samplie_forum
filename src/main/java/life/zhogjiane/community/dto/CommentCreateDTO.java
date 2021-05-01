package life.zhogjiane.community.dto;

import lombok.Data;

/**
 * 评论创建dto
 * Created by codedrinker on 2019/5/30.
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
