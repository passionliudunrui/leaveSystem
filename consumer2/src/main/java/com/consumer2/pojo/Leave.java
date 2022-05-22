package com.consumer2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Leave {

    private Integer id;
    private String userName;
    private Integer classId;
    private String reason;
}
