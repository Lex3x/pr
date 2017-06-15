package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Tatsiana on 11.06.17.
 */
@Entity
@Table(name = "RECORD")
public class Record implements Serializable {

    @Id
    @Column(name = "ID_RECORD")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecord;
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USER", referencedColumnName = "ID_USER", nullable = false)
    private User user;
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_BOOK", referencedColumnName = "ID_BOOK", nullable = false)
    private Book book;
    @NotNull
    @Column(name = "STATUS", length = 24, nullable = false)
    private String status;

    public Record() {
    }

    public Record(int idRecord, User user, Book book, String status) {
        this.idRecord=idRecord;
        this.user = user;
        this.book = book;
        this.status = status;
    }

    public int getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(int idRecord) {
        this.idRecord = idRecord;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (idRecord != record.idRecord) return false;
        if (user != null ? !user.equals(record.user) : record.user != null) return false;
        if (book != null ? !book.equals(record.book) : record.book != null) return false;
        return status != null ? status.equals(record.status) : record.status == null;
    }

    @Override
    public int hashCode() {
        int result = idRecord;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (book != null ? book.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RecordService{" +
                "idRecord=" + idRecord +
                ", user=" + user +
                ", book=" + book +
                ", status='" + status + '\'' +
                '}';
    }
}