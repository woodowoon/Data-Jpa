package com.example.datajpa.repository;

import com.example.datajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);
    List<Member> findHelloBy();
    List<Member> findByUsername(@Param("username") String username);
}
