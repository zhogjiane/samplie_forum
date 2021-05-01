package life.zhogjiane.community.dto;

import lombok.Data;


/**
 * 通知dto
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
