package bac.converter;


import bac.dto.MultipleChoiceDto;
import bac.model.MultipleChoice;
import bac.model.MultipleChoiceAnswer;
import bac.model.Page;
import bac.repository.MultipleChoiceRepository;
import bac.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MultipleChoiceConverter  extends Converter<MultipleChoiceDto, MultipleChoice> {

    private MultipleChoiceRepository multipleChoiceRepository;
    private PageRepository pageRepository;

    @Autowired
    public MultipleChoiceConverter(MultipleChoiceRepository multipleChoiceRepository,
                                   PageRepository pageRepository){
        this.multipleChoiceRepository = multipleChoiceRepository;
        this.pageRepository = pageRepository;
    }

    @Override
    public MultipleChoiceDto newDto() {
        return new MultipleChoiceDto();
    }

    @Override
    public MultipleChoice newEntity() {
        return new MultipleChoice();
    }

    @Override
    public MultipleChoiceDto toDto(MultipleChoice entity){
        MultipleChoiceDto dto = super.toDto(entity);

        dto.setPageId(entity.getPage().getId());

        return dto;
    }

    @Override
    public MultipleChoice toEntity(MultipleChoiceDto dto){

        MultipleChoice entity = super.toEntity(dto);

        Page page = pageRepository.findOne(dto.getPageId());
        if(page == null)
            throw new IllegalArgumentException("Invalid Dto");
        entity.setPage(page);

        Set<MultipleChoiceAnswer> answers = new HashSet<>();
        /*for(String answer : dto.getAnswers()){
            MultipleChoiceAnswer temp = new MultipleChoiceAnswer();
            temp.setText(answer);
            answers.add(temp);
        }
        entity.setAnswers(answers);*/


        return entity;
    }
}
