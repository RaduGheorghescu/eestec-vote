package ro.eestec.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by radug on 6/9/2017.
 */

@Entity
public class Sedinta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nume;

    private Date data;

    @OneToOne
    private Prezenta prezenta;
}
