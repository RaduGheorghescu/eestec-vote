package ro.eestec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ro.eestec.model.Role;
import ro.eestec.model.Statut;
import ro.eestec.model.User;
import ro.eestec.repository.RoleRepository;
import ro.eestec.repository.StatutRepository;
import ro.eestec.repository.UserRepository;


/**
 * Created by Radu on 4/21/2017.
 */
@Component
public class IncarcareDB implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    StatutRepository statutRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        User user = userRepository.findByEmail("radu.gheorghescu@eestec.ro");
        if (user == null){
            Role role = new Role("ROLE_ADMIN");
            roleRepository.save(role);
            role = new Role("ROLE_USER");
            roleRepository.save(role);
            Statut statut = new Statut();
            user = new User("radu.gheorghescu@eestec.ro", "admin", statutRepository.findByDenumire("Junior"), roleRepository.findByName("ROLE_ADMIN"));
            userRepository.save(user);
            user = new User("radu.gheorghescu@eestec.com", "admin", statutRepository.findByDenumire("Senior"), roleRepository.findByName("ROLE_USER"));
            userRepository.save(user);
        }
    }
}
