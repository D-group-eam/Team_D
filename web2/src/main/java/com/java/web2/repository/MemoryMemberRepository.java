package com.java.web2.repository;

import com.java.web2.domain.Member;

import java.text.SimpleDateFormat;
import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;


    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public Optional<Member> findByOrderNumber(String orderNumber) {
        return store.values().stream()
                .filter(member -> member.getOrderNumber().equals(orderNumber))
                .findAny();
    }

    @Override
    public Optional<Member> findByTitle(String title) {
        return store.values().stream()
                .filter(member -> member.getTitle().equals(title))
                .findAny();
    }

    @Override
    public Optional<Member> findByContents(String contents) {
        return store.values().stream()
                .filter(member -> member.getContents().equals(contents))
                .findAny();
    }

    @Override
    public Optional<Member> findByTime(String time) {
        return Optional.ofNullable(store.get(time));
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    // 테스트 코드
//    public void clearStore() {
//        store.clear();
//    }
}
