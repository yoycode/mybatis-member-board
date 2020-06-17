package com.spring.mybatismb2.member;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mapper.MemberMapper;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSession sqlSession;// Mybatis(ibatis) ���̺귯���� �����ϴ� Ŭ����

	@Override
	public int insertMember(MemberVO memberVO) {
		// sqlSession ��ü�� �̿��Ͽ� memberMapper ��ü ����(�ʵ�� ����)
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		//������ ������ ��� ���� ��ȯ�ϱ� ���� ��ȯ���� int�� ������
		int res = memberMapper.insertMember(memberVO); 
		System.out.println("res=" + res);
		return res;
	}

	@Override
	public int userCheck(MemberVO memberVO) {
		// sqlSession ��ü�� �̿��Ͽ� memberMapper ��ü ����(�ʵ�� ����)
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int res = memberMapper.userCheck(memberVO); 
		
		return res;
	}

	@Override
	public ArrayList<MemberVO> getMemberlist() {
		// sqlSession ��ü�� �̿��Ͽ� memberMapper ��ü ����(�ʵ�� ����)
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		ArrayList<MemberVO> member_list = new ArrayList<MemberVO>();
		member_list = memberMapper.getMemberlist();
	
		return member_list;
	}

	@Override
	public MemberVO selectMember(MemberVO memberVO) {
		// sqlSession ��ü�� �̿��Ͽ� memberMapper ��ü ����(�ʵ�� ����)
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		MemberVO vo  = memberMapper.selectMember(memberVO);
			
		return vo;
	}

	@Override
	public int deleteMember(MemberVO memberVO) {
		// sqlSession ��ü�� �̿��Ͽ� memberMapper ��ü ����(�ʵ�� ����)
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		int res = memberMapper.deleteMember(memberVO); 
		
		return res;
	}
}
