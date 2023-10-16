package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    // 얼마 할인됨? 할인금액
    int discount(Member member, int price);
}
