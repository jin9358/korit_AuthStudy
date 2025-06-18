package com.korit.authstudy.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "members_tb")
public class Member {
    
    @Id     // PK 세팅
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // AI 세팅
    @Column(name = "member_id")
    private Integer id;
    private String memberName;
    private String password;
    private String name;
    private String email;
}
