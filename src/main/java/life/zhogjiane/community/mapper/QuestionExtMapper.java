package life.zhogjiane.community.mapper;

import life.zhogjiane.community.dto.QuestionQueryDTO;
import life.zhogjiane.community.model.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 问题ext映射器
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Mapper
public interface QuestionExtMapper {
    /**
     * 观点
     *
     * @param record 记录
     * @return int
     */
    int incView(Question record);

    /**
     * 评论数
     *
     * @param record 记录
     * @return int
     */
    int incCommentCount(Question record);

    /**
     * 相关的
     *
     * @param question 问题
     * @return {@link List<Question>}
     */
    List<Question> selectRelated(Question question);

    /**
     * 搜索
     *
     * @param questionQueryDTO 问题查询dto
     * @return {@link Integer}
     */
    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    /**
     * 搜索
     *
     * @param questionQueryDTO 问题查询dto
     * @return {@link List<Question>}
     */
    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}