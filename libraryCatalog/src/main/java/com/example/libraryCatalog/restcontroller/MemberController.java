package com.example.libraryCatalog.restcontroller;


import com.example.libraryCatalog.entity.Member;
import com.example.libraryCatalog.response.LibraryResponse;
import com.example.libraryCatalog.model.MemberModel;
import com.example.libraryCatalog.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MemberController {

    @Autowired
    public MemberService memberService;


    @GetMapping("/allmember")
    public List<Member> all() {
        return memberService.getAll();
    }

    @GetMapping("/{memberid}")
    public LibraryResponse<MemberModel>getByMemberid(@PathVariable(name="memberid") long memberid ){
        return memberService.getByMemberid(memberid);

    }

    @PostMapping ("/add")
    public long add(Member member){
        memberService.save(member);
        return member.getMemberid();

    }

}
