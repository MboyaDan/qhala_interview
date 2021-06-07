//package com.aim.app.configs;
//
//import com.aim.app.accounts.models.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//
//public class MyUserDetails implements UserDetails {
//
//    private String email;
//    private String password;
//    private String firstName;
//    private String lastName;
//    private String phoneNumber;
//    private List<GrantedAuthority>authorities;
//
//
//
//
//    public MyUserDetails(User user) {
//        this.email = user.getEmail();
//        this.password = user.getPassword();
//        this.firstName=user.getFirstName();
//        this.lastName = user.getLastName();
//        this.phoneNumber=user.getPhoneNumber();
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
