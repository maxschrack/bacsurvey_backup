package bac.service;

import bac.dto.DtoList;
import bac.dto.PageDto;
import bac.dto.QuestionnaireDto;
import bac.exception.ServiceException;

/**
 * Created by max on 16/02/16.
 */
public interface PageService {

    PageDto create(PageDto toCreate) throws ServiceException;
    PageDto read(PageDto toRead) throws ServiceException;
    PageDto update(PageDto toUpdate) throws ServiceException;
    PageDto delete(PageDto toDelete) throws ServiceException;

    DtoList<PageDto> readAll() throws ServiceException;

    DtoList<PageDto> readAllPerQuestionnaire(QuestionnaireDto questionnaireDto);
}
