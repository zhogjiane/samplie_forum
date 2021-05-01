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
    int incView(Question record);

    int incCommentCount(Question record);

    List<Question> selectRelated(Question question);

    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}