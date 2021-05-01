package life.zhogjiane.community.dto;

import lombok.Data;


/**
 * 访问令牌dto
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
