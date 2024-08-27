package com.sushant.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 3, max = 30, message = "The length of the Customer name should be between 3 to 30")
    private String name;

    @NotEmpty(message = "Email can not be null or empty")
    @Email(message = "Email address should be a vaild value")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;

}
