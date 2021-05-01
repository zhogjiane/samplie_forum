package life.zhogjiane.community.dto;

import lombok.Data;

import java.util.List;


/**
 * 标签dto
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
