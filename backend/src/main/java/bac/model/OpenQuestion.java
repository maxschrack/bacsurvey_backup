package bac.model;

import bac.model.enums.EValidationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by max on 08/02/16.
 */
@Entity
@Table(name = "open_question")
public class OpenQuestion extends Question {

    @Column(name = "validation_type")
    private EValidationType validationType;

    @Column(name = "is_long;")
    private boolean isLong;

    public EValidationType getValidationType() {
        return validationType;
    }

    public void setValidationType(EValidationType validationType) {
        this.validationType = validationType;
    }

    public boolean getIsLong() {
        return isLong;
    }

    public void setIsLong(boolean isLong) {
        this.isLong = isLong;
    }
}
