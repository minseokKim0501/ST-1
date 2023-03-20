package com.spatialt.ST1;

import com.spatialt.ST1.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class St1ApplicationTests {
	MemberRepository memberRepository;
	@Test
	void contextLoads() {
		memberRepository.find("id001");
	}

}
