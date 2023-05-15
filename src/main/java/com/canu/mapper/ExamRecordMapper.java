package com.canu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.canu.entity.ExamRecord;
import org.springframework.stereotype.Repository;

/**
 * @Date 2022/10/20 8:59
 * @created by canu
 */
//在对应的mapper上面实现基本的接口
@Repository//代表持久层
public interface ExamRecordMapper extends BaseMapper<ExamRecord> {
}
