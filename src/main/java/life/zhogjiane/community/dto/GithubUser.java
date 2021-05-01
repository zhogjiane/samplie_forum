package life.zhogjiane.community.dto;

import lombok.Data;

/**
 * github用户
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
