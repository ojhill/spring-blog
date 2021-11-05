package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostController {

    private PostRepository postsDao;
    public PostController(PostRepository postsDao){
        this.postsDao = postsDao;
    }
    @GetMapping("/posts")
    @ResponseBody
    public String index(Model model){
        List<Post> post = postsDao.findAll();
        model.addAttribute("posts", posts);
        return "post/index";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPost(@PathVariable long id){
        return "view an individual post " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String newPost(){
        return "create a new post";
    }
}
