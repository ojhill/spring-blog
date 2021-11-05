package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface UserRepository extends JpaRepository<Post, Id> {

}
