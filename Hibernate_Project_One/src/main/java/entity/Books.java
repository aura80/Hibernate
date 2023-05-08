package entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "books")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Data
public class Books {

    @Id
    @Column(name = "id_book")
    @NonNull
    private Integer id_book;

    @Column(name = "title")
    @NonNull
    private String title;

    @Column(name = "author")
    @NonNull
    private String author;

    @Column(name = "pages")
    @NonNull
    private Integer pages;

    @Column(name = "date_of_release")
    @NonNull
    private Date date_of_release;

    @ManyToOne
    @JoinColumn(name = "id")
    private Student student;
}
