package com.spatialt.ST1.repository;

import com.spatialt.ST1.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    public String save(Member member){
        em.persist(member);
        return member.getId();
    }

    public Member find(String id){
        return em.find(Member.class, id);
    }
}
