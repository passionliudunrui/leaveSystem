package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewForm {
    //private Integer id;
    private Integer studentId;
    private Integer classId;
    private String reason;
    private Integer mystate;
    private Integer myresult;

}