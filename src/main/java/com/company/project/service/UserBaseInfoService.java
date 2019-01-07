package com.company.project.service;
import com.company.project.model.UserBaseInfo;
import com.company.project.core.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by CodeGenerator on 2018/12/21.
 */
public interface UserBaseInfoService extends Service<UserBaseInfo> {

    @Override
    void save(UserBaseInfo userBaseInfo);

    @Override
    void update(UserBaseInfo userBaseInfo);
}
