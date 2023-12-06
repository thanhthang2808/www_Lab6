package com.fit.se;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.fit.se.backend.models.Post;
import com.fit.se.backend.models.PostComment;
import com.fit.se.backend.models.User;
import com.fit.se.backend.repositories.PostCommentRepository;
import com.fit.se.backend.repositories.PostRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class Lab06Application {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostCommentRepository postCommentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Lab06Application.class, args);
    }

}
