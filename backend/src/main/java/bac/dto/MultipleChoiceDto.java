package bac.dto;

import bac.model.MultipleChoiceAnswer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by max on 13/02/16.
 */
public class MultipleChoiceDto extends QuestionDto {

    private boolean isSingleChoice;

    private Set<Long> multipleChoiceAnswerIds;

    public MultipleChoiceDto() {
        this.multipleChoiceAnswerIds = new HashSet<>();
    }

    public boolean getIsSingleChoice() {
        return isSingleChoice;
    }

    public void setIsSingleChoice(boolean isSingleChoice) {
        this.isSingleChoice = isSingleChoice;
    }

    public Set<Long> getMultipleChoiceAnswerIds() {
        return multipleChoiceAnswerIds;
    }

    public void setMultipleChoiceAnswerIds(Set<Long> multipleChoiceAnswerIds) {
        this.multipleChoiceAnswerIds = multipleChoiceAnswerIds;
    }

    @Override
    public String getDisplayName() {
        return "multiple choice";
    }
}
