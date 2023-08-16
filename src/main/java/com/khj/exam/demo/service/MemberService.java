package com.khj.exam.demo.service;

import org.springframework.stereotype.Service;

import com.khj.exam.demo.repository.MemberRepository;
import com.khj.exam.demo.vo.Member;

@Service
public class MemberService {
	private MemberRepository memberRepository;
	
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	public int join(String loginId, String loginPw, String name, String nickname, String cellphoneNo, String email) {
		Member oldMember = getMemberByLoginId(loginId);
		
<<<<<<< HEAD
		//로그인아이디 중복체크
=======
		// 로그인아이디 중복체크
>>>>>>> 6b60241b4e7e2dd75d80f5707fd0aadee3e5b012
		if ( oldMember != null ) {
			return -1;
		}
		
<<<<<<< HEAD
		//이름 + 이메일 중복체크
		oldMember = getMemberByNameAndEmail(name, email);
		
		if ( oldMember != null) {
=======
		// 이름 + 이메일 중복체크
		oldMember = getMemberByNameAndEmail(name, email);
		
		if ( oldMember != null ) {
>>>>>>> 6b60241b4e7e2dd75d80f5707fd0aadee3e5b012
			return -2;
		}
		
		memberRepository.join(loginId, loginPw, name, nickname, cellphoneNo, email);
		return memberRepository.getLastInsertId();
	}
	private Member getMemberByNameAndEmail(String name, String email) {
		return memberRepository.getMemberByNameAndEmail(name, email);
	}
	private Member getMemberByLoginId(String loginId) {
		return memberRepository.getMemberByLoginId(loginId);
	}
	public Member getMemberById(int id) {
		return memberRepository.getMemberById(id);
	}

}
