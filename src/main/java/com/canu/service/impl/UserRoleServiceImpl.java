package com.canu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.canu.entity.UserRole;
import com.canu.mapper.UserRoleMapper;
import com.canu.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * @Date 2022/10/20 19:50
 * @created by canu
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
}
