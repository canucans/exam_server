package com.canu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.canu.entity.ExamQuestion;
import com.canu.mapper.ExamQuestionMapper;
import com.canu.service.ExamQuestionService;
import org.springframework.stereotype.Service;

/**
 * @Date 2022/10/20 9:05
 * @created by canu
 */
@Service
public class ExamQuestionServiceImpl extends ServiceImpl<ExamQuestionMapper, ExamQuestion> implements ExamQuestionService {
}
