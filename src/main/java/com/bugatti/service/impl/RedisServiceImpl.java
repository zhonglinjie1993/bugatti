package com.bugatti.service.impl;

import com.bugatti.dataObject.RedisModel;
import com.bugatti.service.IRedisService;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl extends IRedisService<RedisModel> {
    private static final String REDIS_KEY = "TEST_REDIS_KEY";

    @Override
    protected String getRedisKey() {
        return this.REDIS_KEY;
    }
}
