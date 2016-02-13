package bac.model;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;
import java.util.Set;

/**
 * Created by max on 08/02/16.
 */
@Entity
@Table(name="multiple_choice")
//@PrimaryKeyJoinColumn(name = "multiple_choice_id", referencedColumnName = "id")
public class MultipleChoice extends Question{

    @Column(name = "is_single_choice")
    private boolean isSingleChoice;

    @OneToMany(mappedBy = "multipleChoice")
    private Set<MultipleChoiceAnswer> multipleChoiceAnswers;

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
