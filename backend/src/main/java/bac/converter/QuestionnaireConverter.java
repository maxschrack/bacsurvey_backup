package bac.converter;

import bac.dto.QuestionnaireDto;
import bac.model.MetaPage;
import bac.model.Page;
import bac.model.Questionnaire;
import bac.model.User;
import bac.repository.MetaPageRepository;
import bac.repository.PageRepository;
import bac.repository.QuestionnaireRepository;
import bac.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by max on 16/02/16.
 */
@Component
public class QuestionnaireConverter extends Converter<QuestionnaireDto, Questionnaire>{

    private QuestionnaireRepository questionnaireRepository;
    private PageRepository pageRepository;
    private MetaPageRepository metaPageRepository;
    private UserRepository userRepository;

    @Autowired
    public QuestionnaireConverter(QuestionnaireRepository questionnaireRepository,
                                  PageRepository pageRepository,
                                  MetaPageRepository metaPageRepository,
                                  UserRepository userRepository){
        this.questionnaireRepository = questionnaireRepository;
        this.pageRepository = pageRepository;
        this.metaPageRepository = metaPageRepository;
        this.userRepository = userRepository;
    }

    @Override
    public QuestionnaireDto newDto() {
        return null;
    }

    @Override
    public Questionnaire newEntity() {
        return null;
    }

    @Override
    public QuestionnaireDto toDto(Questionnaire entity){
        QuestionnaireDto dto = super.toDto(entity);

        // get user id for dto object
        dto.setUserId(entity.getUser().getId());

        // add page ids
        List<Page> pages = entity.getPages();
        List<Long> pageIds = new ArrayList<>();
        if(pages != null){
            for(Page page : pages){
                pageIds.add(page.getId());
            }
            dto.setPageIds(pageIds);
        }
        // set startpage's id
        if(entity.getStartPage() != null)
            dto.setStartPageId(entity.getStartPage().getId());
        // set endpage's id
        if(entity.getEndPage() != null)
            dto.setEndPageId(entity.getEndPage().getId());

        return dto;
    }

    @Override
    public Questionnaire toEntity(QuestionnaireDto dto){
        Questionnaire entity = super.toEntity(dto);

        List<Page> pages = new ArrayList<>();

        for(Long pageId : dto.getPageIds()){
           Page page = pageRepository.findOne(pageId);
            if(page == null)
                throw new IllegalArgumentException("Invalid Dto");
            pages.add(page);
        }
        entity.setPages(pages);

        // setStartPage
        MetaPage startPage = metaPageRepository.findOne(dto.getStartPageId());
        if(startPage != null){
            entity.setStartPage(startPage);
        }else{
            entity.setStartPage(null);
        }

        // set endPage
        MetaPage endPage = metaPageRepository.findOne(dto.getEndPageId());
        if(endPage == null) {
            entity.setEndPage(endPage);
        }else{
            entity.setEndPage(null);
        }
        // set User
        User user = userRepository.findOne(dto.getUserId());
        if(user == null)
            throw new IllegalArgumentException("Invalid Dto");
        entity.setUser(user);

        return entity;
    }

    public QuestionnaireConverter(){}
}
