package com.spatialt.ST1.repository;

import com.spatialt.ST1.domain.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    @DisplayName("회원 저장")
    public void MemberRepositoryTest() throws Exception
    {

        // given
        Member member = new Member();
        member.setId("testId");
        
        // when

        String saveId = memberRepository.save(member);

        Member result = memberRepository.find(saveId);

        // then
        assertEquals(member.getId(), result.getId());

    }

}