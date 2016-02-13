package bac.model;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Set;

/**
 * Created by max on 08/02/16.
 */
@Entity
@Table(name="question")
@Where(clause = "deleted='f'")
@SQLDelete(sql="update question set deleted = 't' where id = ?")
@Inheritance(strategy = InheritanceType.JOINED)
public class Question extends bac.model.Entity{

    @Id
    @Column(unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_question_id")
    @SequenceGenerator(initialValue = 1, name = "seq_question_id", sequenceName = "seq_question_id")
    private Long id;

    @Column(name="text", nullable = false)
    private String text;

    @Column(name = "mandatory")
    private boolean mandatory;

    @Column(name = "position")
    private int position;

    @Column(name="deleted")
    private boolean deleted;

    @ManyToOne
    @JoinColumn(name = "page_id", referencedColumnName = "id")
    private Page page;

    public Long getId() {
        return id;
    }

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

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}