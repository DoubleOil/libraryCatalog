package com.example.libraryCatalog.component;

import com.example.libraryCatalog.entity.Member;
import com.example.libraryCatalog.model.MemberModel;

public class MemberTransFormToModel {


    public MemberModel TransFormMemberToModel(Member member){

        MemberModel memberModel = new MemberModel();

        memberModel.setMember(member.getMemberid());
        memberModel.setUsername(member.getUsername());
        memberModel.setPassword(member.getPassword());
        memberModel.setFirstname(member.getFirstname());
        memberModel.setLastname(member.getLastname());
        memberModel.setGender(member.getGender());
        memberModel.setStatusmember(member.getStatusmember());

        return memberModel;
    }

    public Member TransFormModelToMember(MemberModel memberModel){

        Member member = new Member();
        member.setMemberid(memberModel.getMember());
        member.setUsername(memberModel.getUsername());
        member.setPassword(memberModel.getPassword());
        member.setFirstname(memberModel.getFirstname());
        member.setLastname(memberModel.getLastname());
        member.setGender(memberModel.getGender());
        member.setStatusmember(memberModel.getStatusmember());

        return member;
    }

}
