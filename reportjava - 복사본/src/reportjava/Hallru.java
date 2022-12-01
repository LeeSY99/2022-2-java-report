/*
	객체지향 프로그래밍 평과과제 (배점 25점)
	학과: 컴퓨터전자시스템공학부
	학번: 201902520
	이름: 이상윤
	
	과제주제: 한류를 이끌어가는 k-pop과 드라마의 간단한 정보 소개
 */

package reportjava;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import reportjava.Girlgroup_enum; //걸그룹 열거타입
public class Hallru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("기능을 숫자로 입력하세요"); //안내에따라 숫자를 입력하면 해당하는 정보를 출력
		System.out.println("1. 정의");
		System.out.println("2. K-pop");
		System.out.println("3. 드라마");
		Scanner input= new Scanner(System.in);
		int function;
		while(true) {//예외처리 입력이 정수가 아니면 안내메시지와 함께 다시 입력받음.
			try {
				function=input.nextInt();
				break;
			}
			catch( InputMismatchException ime) {
				input=new Scanner(System.in);
				System.out.println("정수만 입력하세요");
				System.out.println("1. 정의");
				System.out.println("2. K-pop");
				System.out.println("3. 드라마");
			}
		}
		
				
		//while(function !=0) {
			if (function==1) {
				System.out.println("우리나라의 대중문화 요소가 외국에서 유행하는 현상. 1990년대 말에 중국, 일본, 동남아시아에서부터 비롯되었다.");
			}
			else if(function ==2) {

				System.out.println("K-pop은 아시아시장에서부터 점점 성장하여 2016년 이후에는 유럽, 미국에서도 주목을 받기 시작하여 현재 빌보드 차트에도 K-pop이 올라가는 등 세계로 뻗어나가는 중이다.");
				System.out.println("대표적인 K-pop 아이돌 상세정보:");
				System.out.println("1. 보이그룹");
				System.out.println("2. 걸그룹");
				while(true) {//예외처리 입력이 정수가 아니면 안내메시지와 함께 다시 입력받음..
					try {
						function=input.nextInt();
						break;
					}
					catch( InputMismatchException ime) {
						input=new Scanner(System.in);
						System.out.println("정수만 입력하세요");
						System.out.println("1. 보이그룹");
						System.out.println("2. 걸그룹");
						
					}
				};
				if (function==1) {
					System.out.println("1.방탄소년단");
					System.out.println("2.NCT");
					while(true) {//예외처리 입력이 정수가 아니면 안내메시지와 함께 다시 입력받음.
						try {
							function=input.nextInt();
							break;
						}
						catch( InputMismatchException ime) {
							input=new Scanner(System.in);
							System.out.println("정수만 입력하세요");
							System.out.println("1.방탄소년단");
							System.out.println("2.NCT");
						}
					}
					if (function==1) {
						BTS bts=new BTS("작은 것들을 위한 시",7,2013); //객체 생성 후 
						bts.memprint();
						Hitprint h=new Hitprint();
						h.print(bts);
						bts.explain();
						bts.addsong();
						bts.printsong();
					}
					else if (function==2) {
						NCT nct=new NCT("영웅",23,2016);
						nct.memprint();
						Hitprint h=new Hitprint();
						h.print(nct);
						nct.explain();
						nct.addsong();
						nct.printsong();
					}
				}
				else if (function==2) {
					System.out.println("1.IVE");
					System.out.println("2.BLACKPINK");
					System.out.println("3.aespa");
					while(true) {//예외처리 입력이 정수가 아니면 안내메시지와 함께 다시 입력받음.
						try {
							function=input.nextInt();
							break;
						}
						catch( InputMismatchException ime) {
							input=new Scanner(System.in);
							System.out.println("정수만 입력하세요");
							System.out.println("1.IVE");
							System.out.println("2.BLACKPINK");
							System.out.println("3.aespa");
						}
					}
					Girlgroup_enum girl=null; //열거타입
					
					switch(function) {
					case 1:
						girl=Girlgroup_enum.IVE;
						break;
					case 2:
						girl=Girlgroup_enum.BLACKPINK;
						break;
					case 3:
						girl=Girlgroup_enum.AESPA;
						break;
					}
					
					
					
					if (girl==Girlgroup_enum.IVE) {
						IVE ive=new IVE("ELEVEN",6,2021);
						ive.memprint();
						Hitprint h=new Hitprint();
						h.print(ive);
						ive.explain();
						ive.addsong();
						ive.printsong();
						
					}
					else if(girl==Girlgroup_enum.BLACKPINK) {
						BLACKPINK bla=new BLACKPINK("뚜두뚜두",4,2016);
						bla.memprint();
						Hitprint h=new Hitprint();
						h.print(bla);
						bla.explain();
						bla.addsong();
						bla.printsong();
					}
					else if(girl==Girlgroup_enum.AESPA) {
						Aespa aespa=new Aespa("Next Level",4,2020);
						aespa.memprint();
						Hitprint h=new Hitprint();
						h.print(aespa);
						aespa.explain();
						aespa.addsong();
						aespa.printsong();
					}
					else {//기능에 해당하지 않는 정수가 입력됐을 때 안내
						System.out.println("해당없음. 확인후 다시 입력해주세요.");
					}
					
				}
				
				else {//기능에 해당하지 않는 정수가 입력됐을 때 안내
					System.out.println("해당없음. 확인후 다시 입력해주세요.");
				}
			}
		
		//}
			else if(function ==3) {
				List<String> dramalist = new ArrayList<>();
				
				dramalist.add("오징어 게임");
				dramalist.add("DP");
				dramalist.add("사랑의 불시착");
				dramalist.add("도깨비");
				
			}
			
			else {//기능에 해당하지 않는 정수가 입력됐을 때 안내
				System.out.println("해당없음. 확인후 다시 입력해주세요.");
			}
	}

}

