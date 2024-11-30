package cat.tecnocampus.securityjwt.application;

import cat.tecnocampus.securityjwt.application.dtp.UserDTO;
import cat.tecnocampus.securityjwt.domain.UserLab;
import cat.tecnocampus.securityjwt.persistence.UserLabRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@Controller
public class UserController {

    public final UserLabRepository userLabRepository;

    public UserController(UserLabRepository userLabRepository) {
        this.userLabRepository = userLabRepository;
    }

    public void createUser(UserDTO userLabDTO){
        UserLab userLab = new UserLab();
        userLab.setEmail(userLabDTO.getEmail());
        userLab.setPassword(userLabDTO.getPassword());
        userLab.setRoles(userLabDTO.getRoles());
        userLab.setUsername(userLabDTO.getUsername());
        userLabRepository.save(userLab);
    }
}