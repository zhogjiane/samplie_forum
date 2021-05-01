package life.zhogjiane.community.dto;

import life.zhogjiane.community.model.User;
import lombok.Data;


/**
 * 问题dto
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
