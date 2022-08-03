package dev.nano.springdatajpapagination.service;

import dev.nano.springdatajpapagination.entity.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
