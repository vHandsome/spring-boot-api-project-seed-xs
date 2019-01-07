package com.company.project.service.impl;

import com.company.project.dao.UserBaseInfoMapper;
import com.company.project.model.UserBaseInfo;
import com.company.project.service.UserBaseInfoService;
import com.company.project.core.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/12/21.
 */
@Service
public class UserBaseInfoServiceImpl extends AbstractService<UserBaseInfo> implements UserBaseInfoService {
    @Resource
    private UserBaseInfoMapper userBaseInfoMapper;

    //@Transactional(propagation = Propagation.REQUIRED,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.REQUIRES_NEW,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.MANDATORY,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.NESTED,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.NEVER,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.NOT_SUPPORTED,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.SUPPORTS,rollbackFor = RuntimeException.class)
    @Override
    public void save(UserBaseInfo userBaseInfo) {
        mapper.insertSelective(userBaseInfo);
    }

    @Override
    //@Transactional(propagation = Propagation.REQUIRED,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.REQUIRES_NEW,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.MANDATORY,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.NESTED,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.NEVER,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.NOT_SUPPORTED,rollbackFor = RuntimeException.class)
    //@Transactional(propagation=Propagation.SUPPORTS,rollbackFor = RuntimeException.class)
    public void update(UserBaseInfo userBaseInfo) {
        mapper.updateByPrimaryKeySelective(userBaseInfo);
    }

}
