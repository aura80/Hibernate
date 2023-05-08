package entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Data
public class Student {

    @Id
    @Column(name = "id")
    @NonNull
    private Integer id;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "date_of_borrow")
    @NonNull
    private Date date_of_borrow;

    @OneToMany(mappedBy = "student")
    private List<Books> booksList = new ArrayList<>();

}
