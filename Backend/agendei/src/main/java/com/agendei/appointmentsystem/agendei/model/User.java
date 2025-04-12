package com.agendei.appointmentsystem.agendei.model;

import lombok.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private String email;
    private String password; // Hash de senha
    private String role; // ADMIN, DOCTOR, PATIENT
    private Date createdAt;
}
