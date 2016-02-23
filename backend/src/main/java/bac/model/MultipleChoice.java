package bac.model;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Set;

@Entity
@DiscriminatorValue("MC")
@Table(name="multiple_choice")
public class MultipleChoice extends Question{

    @Column(name = "is_single_choice")
    private boolean isSingleChoice;

    @OneToMany(mappedBy = "multipleChoice")
    private Set<MultipleChoiceAnswer> answers;

    public MultipleChoice(){}

    public MultipleChoice(String text, boolean mandatory, int position, boolean deleted, Page page, boolean isSingleChoice, Set<MultipleChoiceAnswer> answers) {
        super(text, mandatory, position, deleted, page);
        this.isSingleChoice = isSingleChoice;
        this.answers = answers;
    }

    public boolean getIsSingleChoice() {
        return isSingleChoice;
    }

    public void setIsSingleChoice(boolean isSingleChoice) {
        this.isSingleChoice = isSingleChoice;
    }

    public Set<MultipleChoiceAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<MultipleChoiceAnswer> answers) {
        this.answers = answers;
    }
}
