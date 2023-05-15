package com.canu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.canu.entity.Answer;
import com.canu.mapper.AnswerMapper;
import com.canu.service.AnswerService;
import org.springframework.stereotype.Service;

/**
 * @Date 2022/10/20 9:05
 * @created by canu
 */
@Service
public class AnswerServiceImpl extends ServiceImpl<AnswerMapper, Answer> implements AnswerService {
}
