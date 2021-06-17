package com.java.web2.service;

import com.java.web2.domain.Member;
import com.java.web2.repository.MemberRepository;
import com.java.web2.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public class MemberService {

    private final MemberRepository memberRepository;


    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 가입
     */
    public Long join(Member member) {

//        validateDuplicateMember(member); // 예외처리 코드
        memberRepository.save(member);
        return member.getId();
    }

//    private void validateDuplicateMember(Member member) {
//        memberRepository.findByName(member.getName())
//                .ifPresent(m -> {
//                    throw new IllegalStateException("예외처리");
//                });
//    }

    /**
     * 전체 조회
     * */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
