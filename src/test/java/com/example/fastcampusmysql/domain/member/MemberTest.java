package com.example.fastcampusmysql.domain.member;

import com.example.fastcampusmysql.domain.member.entity.Member;
import com.example.fastcampusmysql.util.MemberFixtureFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class MemberTest {

    @DisplayName("회원은 닉네임을 변경할 수 있다")
    @Test
    public void testChangeNickName() {
        var member = MemberFixtureFactory.create();
        var expected = "cat";

        member.changeNickname(expected);

        Assertions.assertEquals(expected, member.getNickname());
    }
}
