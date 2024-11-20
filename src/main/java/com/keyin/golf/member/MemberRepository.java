
package com.keyin.golf.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByMemberNameContainingIgnoreCase(String name);
    List<Member> findByMemberPhone(String phone);
    List<Member> findByStartDate(LocalDate startDate);
}