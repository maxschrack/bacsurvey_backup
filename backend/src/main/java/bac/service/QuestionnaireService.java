package bac.service;

import bac.dto.DtoList;
import bac.dto.QuestionnaireDto;
import bac.exception.ServiceException;

public interface QuestionnaireService {

    QuestionnaireDto create(QuestionnaireDto toCreate) throws ServiceException;
    QuestionnaireDto read(QuestionnaireDto toRead) throws ServiceException;
    QuestionnaireDto update(QuestionnaireDto toUpdate) throws ServiceException;
    QuestionnaireDto delete(QuestionnaireDto toDelete) throws ServiceException;

    DtoList<QuestionnaireDto> readAll() throws ServiceException;
}
