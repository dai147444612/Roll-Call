package com.inet.code.entity.dto;


import lombok.*;
import lombok.experimental.Accessors;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class StudentHit {
    private Integer studentId;
}
