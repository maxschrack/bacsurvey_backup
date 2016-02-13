package bac.dto;

/**
 * Created by max on 13/02/16.
 */
public class AnswerDto extends EntityDto {

    private Long id;

    private String answer;

    // Foreign Keys
    private Long participantId;

    private Long questionId;

    @Override
    public String getDisplayName() {
        return "answer";
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnswerDto answerDto = (AnswerDto) o;

        if (id != null ? !id.equals(answerDto.id) : answerDto.id != null) return false;
        if (answer != null ? !answer.equals(answerDto.answer) : answerDto.answer != null) return false;
        if (participantId != null ? !participantId.equals(answerDto.participantId) : answerDto.participantId != null)
            return false;
        return !(questionId != null ? !questionId.equals(answerDto.questionId) : answerDto.questionId != null);

    }
}
