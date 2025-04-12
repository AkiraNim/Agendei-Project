package com.agendei.appointmentsystem.agendei.model;

import lombok.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private String id;
    private String userId;
    private String specialtyId;
    private String crm;
    private List<String> availableDays; // ["MONDAY", "WEDNESDAY", "FRIDAY"]
    private String bio;
}
