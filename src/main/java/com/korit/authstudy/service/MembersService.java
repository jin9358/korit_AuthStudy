package com.korit.authstudy.service;

import com.korit.authstudy.domain.entity.Member;
import com.korit.authstudy.dto.MemberRegisterDto;
import com.korit.authstudy.repository.MembersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MembersService {

    private final MembersRepository membersRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public Member register1(MemberRegisterDto dto){
        Member insertedUser1 = membersRepository.save(dto.toEntity(passwordEncoder));
        return insertedUser1;
    }
}
