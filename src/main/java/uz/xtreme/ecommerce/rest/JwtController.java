package uz.xtreme.ecommerce.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import uz.xtreme.ecommerce.rest.vm.JwtTokenVM;
import uz.xtreme.ecommerce.rest.vm.LoginVM;
import uz.xtreme.ecommerce.util.JwtUtil;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/authenticate")
public class JwtController {

    private final AuthenticationManager authManager;

    private final JwtUtil jwtUtil;

    @PostMapping
    public ResponseEntity<JwtTokenVM> authorize(@Valid @RequestBody LoginVM vm) {
        try {
            authManager.authenticate(new UsernamePasswordAuthenticationToken(vm.getUsername(), vm.getPassword()));
        } catch (Exception e) {
            throw new RuntimeException("invalid username/password");
        }
        String token = jwtUtil.generateToken(vm.getUsername());
        return ResponseEntity.ok(new JwtTokenVM(token));
    }

}
