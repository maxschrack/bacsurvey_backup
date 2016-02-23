package bac.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.Set;

public class MultipleChoiceRest extends QuestionRest {

    @JsonProperty("isSingleChoice")
    private boolean isSingleChoice;

    @JsonProperty("answers")
    private Set<String> answers = new HashSet<>();;

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
}
