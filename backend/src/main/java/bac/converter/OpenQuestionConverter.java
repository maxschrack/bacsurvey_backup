package bac.converter;

import bac.dto.OpenQuestionDto;
import bac.model.OpenQuestion;
import bac.model.Question;
import bac.repository.OpenQuestionRepository;
import bac.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by max on 16/02/16.
 */
@Component
public class OpenQuestionConverter extends Converter<OpenQuestionDto, Question> {

    private OpenQuestionRepository openQuestionRepository;
    private PageRepository pageRepository;

    @Autowired
    public OpenQuestionConverter(OpenQuestionRepository openQuestionRepository,
                                 PageRepository pageRepository){
        this.openQuestionRepository = openQuestionRepository;
        this.pageRepository = pageRepository;
    }

    @Override
    public OpenQuestionDto newDto() {
        return new OpenQuestionDto();
    }

    @Override
    public OpenQuestion newEntity() {
        return new OpenQuestion();
    }




}
