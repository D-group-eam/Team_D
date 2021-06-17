package com.java.web2.controller;

import com.java.web2.domain.Member;
import com.java.web2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/board/new")
    public String createForm() {
        return "board/createBoardForm";
    }

    @PostMapping("/board/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());
        member.setOrderNumber(form.getOrderNumber());
        member.setTitle(form.getTitle());
        member.setContents(form.getContents());

        memberService.join(member);

        return "redirect:/board";
    }

    @GetMapping("/board")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "board/board";
    }

    /**
     * 페이지 상세
     * */

    @RequestMapping("/board/{id}")
    public String viewDetail(@PathVariable("id") long id, Model model) {
        model.addAttribute("detail", memberService.findOne(id));
        return "board/viewDetail";
    }



}
