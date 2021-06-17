package com.java.web2.repository;

import com.java.web2.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    Optional<Member> findByTitle(String title);
    Optional<Member> findByOrderNumber(String orderNumber);
    Optional<Member> findByContents(String contents);
    Optional<Member> findByTime(String time);
    List<Member> findAll();
}
