package com.upgrad.eshop.services;

import com.upgrad.eshop.dtos.EshopUserDTO;
import com.upgrad.eshop.entities.EshopUser;
import com.upgrad.eshop.exceptions.EshopUserDetailsNotFoundException;
import org.springframework.security.core.userdetails.UserDetails;

public class EshopUserServiceImpl {

    public UserDetails loadUserDetails(String email) {
        EshopUser eshopUser;
        return null;
    }
}
