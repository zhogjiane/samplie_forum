package life.zhogjiane.community.controller;

import life.zhogjiane.community.dto.CommentDTO;
import life.zhogjiane.community.dto.QuestionDTO;
import life.zhogjiane.community.enums.CommentTypeEnum;
import life.zhogjiane.community.exception.CustomizeErrorCode;
import life.zhogjiane.community.exception.CustomizeException;
import life.zhogjiane.community.service.CommentService;
import life.zhogjiane.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 问题控制器
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private CommentService commentService;

    /**
     * 金融问题
     *
     * @param id    id
     * @param model 模型
     * @return {@link String}
     */
    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") String id, Model model) {
        Long questionId = null;
        try {
            questionId = Long.parseLong(id);
        } catch (NumberFormatException e) {
            throw new CustomizeException(CustomizeErrorCode.INVALID_INPUT);
        }
        QuestionDTO questionDTO = questionService.getById(questionId);
        List<QuestionDTO> relatedQuestions = questionService.selectRelated(questionDTO);
        List<CommentDTO> comments = commentService.listByTargetId(questionId, CommentTypeEnum.QUESTION);
        //累加阅读数
        questionService.incView(questionId);
        model.addAttribute("question", questionDTO);
        model.addAttribute("comments", comments);
        model.addAttribute("relatedQuestions", relatedQuestions);
        return "question";
    }
}
