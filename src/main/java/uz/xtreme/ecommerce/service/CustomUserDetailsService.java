package uz.xtreme.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.EcUser;
import uz.xtreme.ecommerce.repository.EcUserRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final EcUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<EcUser> byUsername = repository.findByUsername(s);
        EcUser user = byUsername.orElseThrow(() -> new UsernameNotFoundException("user not found"));
        return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }
}
