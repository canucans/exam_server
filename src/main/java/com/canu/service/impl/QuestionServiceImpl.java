package com.canu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.canu.entity.Question;
import com.canu.mapper.QuestionMapper;
import com.canu.service.QuestionService;
import org.springframework.stereotype.Service;

/**
 * @Date 2022/10/20 9:05
 * @created by canu
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {
}
