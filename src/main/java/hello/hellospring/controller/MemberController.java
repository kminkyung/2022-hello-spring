package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MemberController {
  private final MemberService memberService;

  // DI 필드 주입 방식
//  @Autowired private MemberService memberService;

  // DI setter 주입 방식
//  @Autowired
//  public void setMemberService(MemberService memberService) {
//    this.memberService = memberService;
//  }

  @Autowired
  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping("/members/new")
  public String createForm() {
    return "members/createMemberForm";
  }

}
