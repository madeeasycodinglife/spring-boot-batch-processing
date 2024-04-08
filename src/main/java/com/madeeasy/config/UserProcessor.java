package com.madeeasy.config;

import com.madeeasy.entity.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception {
        // actual business logic written here
        return user;
    }
}
