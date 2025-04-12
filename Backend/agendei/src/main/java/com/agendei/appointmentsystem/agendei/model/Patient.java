package com.agendei.appointmentsystem.agendei.model;

import lombok.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private String id;
    private String userId;
    private Date birthDate;
    private String gender;
    private String phone;
}
