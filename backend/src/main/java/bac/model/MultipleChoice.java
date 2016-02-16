package bac.model;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Set;

/**
 * Created by max on 08/02/16.
 */
@Entity
@DiscriminatorValue("MC")
@Table(name="multiple_choice")
public class MultipleChoice extends Question{

    @Column(name = "is_single_choice")
    private boolean isSingleChoice;

    @OneToMany(mappedBy = "multipleChoice")
    private Set<MultipleChoiceAnswer> multipleChoiceAnswers;

    public MultipleChoice(){}

    public MultipleChoice(String text, boolean mandatory, int position, boolean deleted, Page page, boolean isSingleChoice, Set<MultipleChoiceAnswer> multipleChoiceAnswers) {
        super(text, mandatory, position, deleted, page);
        this.isSingleChoice = isSingleChoice;
        this.multipleChoiceAnswers = multipleChoiceAnswers;
    }

    public boolean getIsSingleChoice() {
        return isSingleChoice;
    }

    public void setIsSingleChoice(boolean isSingleChoice) {
        this.isSingleChoice = isSingleChoice;
    }

    public Set<MultipleChoiceAnswer> getMultipleChoiceAnswers() {
        return multipleChoiceAnswers;
    }

    public void setMultipleChoiceAnswers(Set<MultipleChoiceAnswer> multipleChoiceAnswers) {
        this.multipleChoiceAnswers = multipleChoiceAnswers;
    }
}
