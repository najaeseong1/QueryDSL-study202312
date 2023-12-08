package com.example.study.repository;

import com.example.study.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>,
        MemberRepositoryCustom {

    @Query(value = "SELECT * FROM tbl_member WHERE user_name = :name", nativeQuery = true)
    List<Member> findByName(@Param("name") String name);

}
