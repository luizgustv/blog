package com.spring.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.codeblog.model.Post;

//extendendo JpaRepository a classe terá acesso a metodos como findbyid, findall...
public interface CodeBlogRepository extends JpaRepository<Post, Long>{

}
