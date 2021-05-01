package life.zhogjiane.community.exception;


/**
 * icustomize错误代码
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
public interface ICustomizeErrorCode {
    /**
     * 得到消息
     *
     * @return {@link String}
     */
    String getMessage() ;

    /**
     * 获取代码
     *
     * @return {@link Integer}
     */
    Integer getCode();
}
