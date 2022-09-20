package com.crow.member.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author :      lee_kangchan
 * @FileName :    Member
 * @Date :        2022/09/20
 * @Discription : 멤버 도메인
 */

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "seq")
    private Long id;

    private String email;
    private String password;

    private String birth;
    private String gender;

    private String name;
}
