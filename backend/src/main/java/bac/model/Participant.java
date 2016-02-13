package bac.model;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Set;

/**
 * Created by max on 09/02/16.
 */
@Entity
@Table(name="participant")
@Where(clause = "deleted='f'")
@SQLDelete(sql="update participant set deleted = 't' where id = ?")
public class Participant extends bac.model.Entity {

    @Id
    @Column(unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_system_user_id")
    @SequenceGenerator(initialValue = 1, name = "seq_system_user_id", sequenceName = "seq_system_user_id")
    private Long id;

    @Column(name="email", unique=true)
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="ip_address")
    private String ipAddress;

    @Column(name="deleted")
    private boolean deleted;

    @OneToMany(mappedBy = "participant")
    private Set<Answer> answers;

    @OneToMany(mappedBy = "participant")
    private Set<Log> log;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public Set<Log> getLog() {
        return log;
    }

    public void setLog(Set<Log> log) {
        this.log = log;
    }
}
