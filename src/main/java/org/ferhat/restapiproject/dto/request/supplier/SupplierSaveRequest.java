package org.ferhat.restapiproject.dto.request.supplier;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierSaveRequest {

    @NotNull(message = "Company Name can't empty or null")
    private String companyName;

    private String contact;
    private String address;
    @Email
    private String contactMail;
}
