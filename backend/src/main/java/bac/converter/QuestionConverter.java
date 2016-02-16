package bac.converter;

import bac.dto.QuestionDto;
import bac.model.Question;
import bac.repository.MultipleChoiceRepository;
import bac.repository.OpenQuestionRepository;
import bac.repository.PageRepository;
import bac.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by max on 16/02/16.
 */
public class QuestionConverter {

    private QuestionRepository questionRepository;
    private PageRepository pageRepository;
    private OpenQuestionRepository openQuestionRepository;
    private MultipleChoiceRepository multipleChoiceRepository;

    @Autowired
    public QuestionConverter(QuestionRepository questionRepository,
                             PageRepository pageRepository,
                             OpenQuestionRepository openQuestionRepository,
                             MultipleChoiceRepository multipleChoiceRepository){
        this.questionRepository = questionRepository;
        this.pageRepository = pageRepository;
        this.openQuestionRepository = openQuestionRepository;
        this.multipleChoiceRepository = multipleChoiceRepository;
    }

    // TODO : DO I NEED newDto() and newEntity()

    public QuestionDto toDto(Question question){
        return null;
    }
}
