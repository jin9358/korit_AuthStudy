package com.korit.authstudy.controller;

import com.korit.authstudy.dto.MemberRegisterDto;
import com.korit.authstudy.service.MembersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/members")
public class MembersController {

    private final MembersService membersService;

    @PostMapping
    public ResponseEntity<?> registerMember(@RequestBody MemberRegisterDto dto) {
        //get 요청 -> query String    post요청 -> json
        log.info("DTO: {}", dto);
        return ResponseEntity.ok(membersService.register1(dto));
    }
}
