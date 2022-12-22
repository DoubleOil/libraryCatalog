package com.example.libraryCatalog.service;


import com.example.libraryCatalog.component.MemberTransFormToModel;
import com.example.libraryCatalog.entity.Member;
import com.example.libraryCatalog.response.LibraryResponse;
import com.example.libraryCatalog.model.MemberModel;
import com.example.libraryCatalog.repositrory.MemberRepositrory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class MemberService {

    public MemberRepositrory memberRepositrory;
    public MemberTransFormToModel memberTransFormToModel;

    public MemberService (MemberRepositrory memberRepositrory, MemberTransFormToModel memberTransFormToModel){

        this.memberRepositrory = memberRepositrory;
        this.memberTransFormToModel = memberTransFormToModel;
    }



    public LibraryResponse<MemberModel> getByMemberid(long memberid) {
        LibraryResponse result = new LibraryResponse<>();
        result.setStatus(404);
        result.setDescription("member not found");

        try{
            Optional<Member> optional = this.memberRepositrory.findById(memberid);
            if (optional.isPresent()){
                Member member = optional.get();
                MemberModel data = this.memberTransFormToModel.TransFormMemberToModel(member);
                result.setData(data);
                result.setStatus(200);
                result.setDescription("OK");
            }

        }catch (Exception e){
            result.setStatus(500);
            result.setDescription(e.getMessage());
        }
        return result;
    }

    public List<Member> getAll() {
        return memberRepositrory.findAll();
    }

    public void save(Member member) {
        memberRepositrory.save(member);
    }


}
