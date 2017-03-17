package com.dao.service.impl;

import com.dao.service.IWWJDService;
import org.springframework.stereotype.Service;

/**
 * Created by zxdong on 2017/2/5.
 */
@Service("wwjdService")
public class WWJDServiceImpl implements IWWJDService {

    public String getString(String str) {
        return str+"是一个好人";
    }
}
