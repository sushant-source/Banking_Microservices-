package com.sushant.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(name = "Customer", description = "Schema to hold Customer and Account information")

public class CustomerDto {

    @Schema(description = "Name of the customer", example = "Sushant Kumar")
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 3, max = 30, message = "The length of the Customer name should be between 3 to 30")
    private String name;

    @Schema(description = "Email address of the customer", example = "digitlsushant@gmail.com")
    @NotEmpty(message = "Email can not be null or empty")
    @Email(message = "Email address should be a vaild value")
    private String email;

    @Schema(description = "Mobile Number of the customer", example = "9876543210")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the Customer")
    private AccountsDto accountsDto;

}
