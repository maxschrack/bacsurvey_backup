package bac.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by max on 16/02/16.
 */
public abstract class QuestionDto extends EntityDto{

    private Long id;

    private String text;

    private boolean mandatory;

    private int position;

    private boolean deleted;

    // Foreign Keys
    private Long pageId;

    private Set<Long> answerId;

    public QuestionDto(){
        answerId = new HashSet<>();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Long getPageId() {
        return pageId;
    }

    public void setPageId(Long pageId) {
        this.pageId = pageId;
    }

    public Set<Long> getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Set<Long> answerId) {
        this.answerId = answerId;
    }
}
