package bac.service;

import bac.dto.*;
import bac.exception.ServiceException;

import java.util.List;

public interface QuestionService {

    OpenQuestionDto createOpenQuestion(OpenQuestionDto toCreate) throws ServiceException;
    OpenQuestionDto readOpenQuestion(OpenQuestionDto toRead) throws ServiceException;
    OpenQuestionDto updateOpenQuestion(OpenQuestionDto toUpdate) throws ServiceException;
    OpenQuestionDto deleteOpenQuestion(OpenQuestionDto toDelete) throws ServiceException;

    MultipleChoiceDto createMultipleChoiceQuestion(MultipleChoiceDto toCreate);

    DtoList<QuestionDto> readAllPerPage(PageDto pageDto);

    void createAnswerForQuestion(MultipleChoiceDto dto);

    QuestionDto read(QuestionDto toRead);
}
