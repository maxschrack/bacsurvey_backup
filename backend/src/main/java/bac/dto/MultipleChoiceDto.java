package bac.dto;

import java.util.HashSet;
import java.util.Set;

public class MultipleChoiceDto extends QuestionDto {

    private boolean isSingleChoice;

    private Set<String> answers;

    public MultipleChoiceDto() {
        this.answers = new HashSet<>();
    }

    public boolean getIsSingleChoice() {
        return isSingleChoice;
    }

    public void setIsSingleChoice(boolean isSingleChoice) {
        this.isSingleChoice = isSingleChoice;
    }

    public Set<String> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<String> answers) {
        this.answers = answers;
    }

    @Override
    public String getDisplayName() {
        return "multiple choice";
    }
}
