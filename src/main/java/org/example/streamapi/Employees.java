package org.example.streamapi;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employees {
    private Long id;
    private String name;
    private Integer age;
    private Double salary;
    private String department;
}
