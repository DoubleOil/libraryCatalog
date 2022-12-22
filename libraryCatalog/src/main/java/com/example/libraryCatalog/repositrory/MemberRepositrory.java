package com.example.libraryCatalog.repositrory;

import com.example.libraryCatalog.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepositrory extends JpaRepository<Member,Long> {
}
