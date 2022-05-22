package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
  //  private DataSource dataSource;
  //  private final EntityManager em;
  private final MemberRepository memberRepository;

  @Autowired
  public SpringConfig(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  //  @Autowired
  //  public SpringConfig(DataSource dataSource, EntityManager em) {
  //    this.em = em;
  //  }

  // 직접 스프링 빈을 등록하는 방식
    @Bean
    public MemberService memberService() {
      return new MemberService(memberRepository);
    }

    // 컴포넌트 스캔 쓰기로 함 (@Component)
    //    @Bean
    //    public TimeTraceAop timeTraceAop() {
    //      return new TimeTraceAop();
    //    }

    //  @Bean
    //  public MemberRepository memberRepository() {
    //    return new MemoryMemberRepository();
    //    return new JdbcTemplateMemberRepository(dataSource);
    //    return new JpaMemberRepository(em);
//  }
}
