package life.zhogjiane.community.exception;


/**
 * 自定义异常
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
public class CustomizeException extends RuntimeException {
    private String message;
    private Integer code;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    /**
     * 得到消息
     *
     * @return {@link String}
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     * 获取代码
     *
     * @return {@link Integer}
     */
    public Integer getCode() {
        return code;
    }
}
