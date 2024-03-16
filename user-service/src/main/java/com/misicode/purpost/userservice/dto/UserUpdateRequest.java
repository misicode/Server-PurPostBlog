package com.misicode.purpost.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserUpdateRequest {
    @NotNull
    @NotBlank
    @Email
    private String email;

    @NotBlank
    @NotNull
    private String names;

    @NotBlank
    @NotNull
    private String surnames;

    public String getEmail() {
        return email;
    }

    public String getNames() {
        return names;
    }

    public String getSurnames() {
        return surnames;
    }
}
