package life.zhogjiane.community.dto;

import lombok.Data;


/**
 * 问题查询dto
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private String sort;
    private Long time;
    private String tag;
    private Integer page;
    private Integer size;
}
