package com.agendei.appointmentsystem.agendei.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Specialty {
    private String id;
    private String name;
    private String description;
}
