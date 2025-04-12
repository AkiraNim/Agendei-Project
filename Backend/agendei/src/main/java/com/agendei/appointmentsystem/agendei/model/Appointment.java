package com.agendei.appointmentsystem.agendei.model;

import lombok.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    private String id;
    private String doctorId;
    private String patientId;
    private Date appointmentDate;
    private String status; // SCHEDULED, COMPLETED, CANCELLED
    private String notes;
}
