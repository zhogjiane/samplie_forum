package life.zhogjiane.community.dto;

import lombok.Data;


/**
 * 热门标签dto
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Data
public class HotTagDTO implements Comparable {
    private String name;
    private Integer priority;

    @Override
    public int compareTo(Object o) {
        return this.getPriority() - ((HotTagDTO) o).getPriority();
    }
}
