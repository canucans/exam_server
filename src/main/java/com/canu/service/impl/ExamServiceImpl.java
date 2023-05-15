package com.canu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.canu.entity.Exam;
import com.canu.mapper.ExamMapper;
import com.canu.service.ExamService;
import org.springframework.stereotype.Service;

/**
 * @Date 2022/10/20 9:05
 * @created by canu
 */
@Service
public class ExamServiceImpl extends ServiceImpl<ExamMapper, Exam> implements ExamService {
}
