package com.aim.app.configs;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

//    @Autowired
//    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//       Optional<User> user =  userRepository.findByEmail(email);
//       return user.map(MyUserDetails::new).get();
//        return new User ("jorammanoah1@gmail.com","1234", new ArrayList<>());
        return new MyUserDetails();
    }


}
