package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

  // 직접 스프링 빈을 등록하는 방식
//  @Bean
//  public MemberService memberService() {
//    return new MemberService(memberRepository());
//  }
//
//  @Bean
//  public MemberRepository memberRepository() {
//    return new MemoryMemberRepository();
//  }
}