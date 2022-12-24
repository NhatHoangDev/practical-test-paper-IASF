package com.example.practicaltestpaperiasf.service;

import com.example.practicaltestpaperiasf.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> getUserList();

    public void deleteUserById(Long userId);

    public User updateUser(Long userId, User user);

    public User getUserById(long userId);

    Page<User> findPaginated(int pageNum, int pageSize,
                             String sortField,
                             String sortDirection);

}
