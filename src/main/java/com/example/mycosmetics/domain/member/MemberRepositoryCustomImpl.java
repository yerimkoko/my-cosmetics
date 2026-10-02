package com.example.mycosmetics.domain.member;


import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberRepositoryCustomImpl implements MemberRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public Member findByNickName(String nickName) {
        return queryFactory.selectFrom(QMember.member)
                .where(
                        QMember.member.name.eq(nickName)
                ).fetchOne();
    }

}
