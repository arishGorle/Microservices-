package com.eazybytes.accounts.dto;

import lombok.Data;
import lombok.Setter;

@Data
public class CustomerDto {

    private String name;

    private String email;

    private String mobileNumber;

    private AccountsDto accountsDto;

}
