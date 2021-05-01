package life.zhogjiane.community.enums;

/**
 * 通知状态枚举
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
public enum NotificationStatusEnum {
    UNREAD(0), READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
