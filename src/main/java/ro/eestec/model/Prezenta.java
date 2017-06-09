package ro.eestec.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by radug on 6/9/2017.
 */

@Entity
public class Prezenta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Sedinta sedinta;

    @ManyToMany
    private List<User> users;
}
