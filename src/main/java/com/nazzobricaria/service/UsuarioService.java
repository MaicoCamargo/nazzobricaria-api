package com.nazzobricaria.service;

import com.nazzobricaria.model.Permissao;
import com.nazzobricaria.model.Usuario;
import com.nazzobricaria.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario user = userRepository.findByEmail(email);
        if (user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        System.out.println(user);
        System.out.println("::::user::::");
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(),
                mapRolesToAuthorities(user.getPermissoes()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Permissao> roles){
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getPermissao()))
                .collect(Collectors.toList());
    }
}