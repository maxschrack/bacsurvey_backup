package bac.dto;

import bac.model.MultipleChoiceAnswer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by max on 13/02/16.
 */
public class MultipleChoiceDto extends EntityDto{

    private Long id;

    private String text;

    private boolean mandatory;

    private int position;

    private boolean deleted;

    private boolean isSingleChoice;

    private Set<Long> multipleChoiceAnswerIds;

    // Foreign Keys
    private Long pageId;

    private Set<Long> answerId;

    public MultipleChoiceDto() {
        this.answerId = new HashSet<>();
        this.multipleChoiceAnswerIds = new HashSet<>();
    }

    @Override
    public String getDisplayName() {
        return "question";
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MultipleChoiceDto that = (MultipleChoiceDto) o;

        if (mandatory != that.mandatory) return false;
        if (position != that.position) return false;
        if (deleted != that.deleted) return false;
        if (isSingleChoice != that.isSingleChoice) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (multipleChoiceAnswerIds != null ? !multipleChoiceAnswerIds.equals(that.multipleChoiceAnswerIds) : that.multipleChoiceAnswerIds != null)
            return false;
        if (pageId != null ? !pageId.equals(that.pageId) : that.pageId != null) return false;
        return !(answerId != null ? !answerId.equals(that.answerId) : that.answerId != null);

    }
}
