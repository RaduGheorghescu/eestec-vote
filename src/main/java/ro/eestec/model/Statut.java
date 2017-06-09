package ro.eestec.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by radug on 6/9/2017.
 */

@Entity
public class Statut {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String denumire;

    @OneToMany
    private List<User> users;



    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
