package com.forezp.dao;

import com.forezp.entity.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends BaseMapper<Account> {
    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
