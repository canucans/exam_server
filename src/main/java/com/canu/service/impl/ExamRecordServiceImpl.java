package com.canu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.canu.entity.ExamRecord;
import com.canu.mapper.ExamRecordMapper;
import com.canu.service.ExamRecordService;
import org.springframework.stereotype.Service;

/**
 * @Date 2022/10/20 9:05
 * @created by canu
 */
@Service
public class ExamRecordServiceImpl extends ServiceImpl<ExamRecordMapper, ExamRecord> implements ExamRecordService {
}
