package com.canu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date 2022/11/1 17:09
 * @created by canu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamQueryVo {
    private Integer examType;
    private String startTime;
    private String endTime;
    private String examName;
    private Integer pageNo;
    private Integer pageSize;
}
