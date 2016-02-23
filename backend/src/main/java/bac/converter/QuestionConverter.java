package bac.converter;

import bac.dto.DtoList;
import bac.dto.MultipleChoiceDto;
import bac.dto.OpenQuestionDto;
import bac.dto.QuestionDto;
import bac.model.*;
import bac.repository.MultipleChoiceRepository;
import bac.repository.OpenQuestionRepository;
import bac.repository.PageRepository;
import bac.repository.QuestionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionConverter{

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

    public OpenQuestionDto newOpenQuestionDto(){
        return new OpenQuestionDto();
    }

    public MultipleChoiceDto newMultipleChoiceDto(){
        return new MultipleChoiceDto();
    }

    public Question newOpenQuestionEntity() {
        return new OpenQuestion();
    }
    public Question newMultipleChoiceEntity() {
        return new MultipleChoice();
    }


    public QuestionDto toDto(Question entity){
        QuestionDto dto;
        if(entity instanceof OpenQuestion) {
            dto = newOpenQuestionDto();
        }else{
            dto = newMultipleChoiceDto();
            /*for(MultipleChoiceAnswer answer : ((MultipleChoice) entity).getMultipleChoiceAnswers()){
                ((MultipleChoiceDto) dto).getMultipleChoiceAnswers().add(answer.getText());
            }*/

        }
        BeanUtils.copyProperties(entity, dto);

        dto.setPageId(entity.getPage().getId());

        return dto;
    }

    public Question toEntity(QuestionDto dto){

        Question entity;
        if(dto instanceof OpenQuestionDto) {
            entity = newOpenQuestionEntity();
        }else{
            entity = newMultipleChoiceEntity();
        }

        BeanUtils.copyProperties(dto, entity);

        Page page = pageRepository.findOne(dto.getPageId());
        if(page == null)
            throw new IllegalArgumentException("Invalid Dto");
        entity.setPage(page);

        return entity;
    }

    public DtoList<QuestionDto> toDtoList(List<Question> entities){
        ArrayList<QuestionDto> result = new ArrayList<>();
        for(Question question : entities) {
            QuestionDto dto = this.toDto(question);
            /*if(question instanceof MultipleChoice){
                MultipleChoice temp = (MultipleChoice) question;
                for(MultipleChoiceAnswer answer : temp.getMultipleChoiceAnswers()){
                    ((MultipleChoiceDto) dto).getMultipleChoiceAnswers().add(answer.getText()Z)
                }
            }*/
            result.add(dto);
        }
        return new DtoList<>(result);
    }
}
