/*
	객체지향 프로그래밍 평과과제 (배점 25점)
	학과: 컴퓨터전자시스템공학부
	학번: 201902520
	이름: 이상윤
	
	과제주제: 한류를 이끌어가는 k-pop과 드라마의 간단한 정보 소개
 */
package korea;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

import korea.Girlgroup_enum; //걸그룹 열거타입
public class Hallru {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("기능을 숫자로 입력하세요"); //안내에따라 숫자를 입력하면 해당하는 정보를 출력
		System.out.println("1. 정의");
		System.out.println("2. K-pop");
		System.out.println("3. 드라마");
		Scanner input= new Scanner(System.in);
		int function;
		while(true) {//예외처리: 입력이 정수가 아니면 안내메시지와 함께 다시 입력받음.
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
			}//1번 입력시 정의 출력
			else if(function ==2) {	//2번(k-pop)선택시 출력

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
				if (function==1) {//1번(보이그룹)선택시 출력
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
					if (function==1) {//1번(BTS)입력시 출력
						BTS bts=new BTS("작은 것들을 위한 시",7,2013); //객체 생성 후 
						bts.memprint();//멤버 출력하는 함수 호출
						Hitprint h=new Hitprint();//매개변수의 대형성 Hitprint.java
						h.print(bts);
						bts.explain();//그룹특징 출력하는 함수호출
						bts.addsong();//배열에 노래를 저장하는 함수호출
						bts.printsong();//배열에 저장되어 있는 항목들을 출력하는 함수호출
					}// 그 이후 아이돌 그룹 소개할때 호출하는 함수들은 모두 같음
					else if (function==2) {//2번(NCT)입력 시 출력
						NCT nct=new NCT("영웅",23,2016);
						nct.memprint();
						Hitprint h=new Hitprint();//매개변수의 대형성 Hitprint.java
						h.print(nct);
						nct.explain();
						nct.addsong();
						nct.printsong();
					}
				}
				else if (function==2) {//2번(걸그룹)입력 시 출력
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
					case 1://1번 입력 시 열거타입의 첫번째 항목을 girl로 설정
						girl=Girlgroup_enum.IVE;
						break;
					case 2://2번 입력 시 열거타입의 두번째 항목을 girl로 설정
						girl=Girlgroup_enum.BLACKPINK;
						break;
					case 3://3번 입력 시 열거타입의 세번째 항목을 girl로 설정
						girl=Girlgroup_enum.AESPA;
						break;
					}
					
					//열거타입의 항목에서 해당하는 그룹의 정보를 출력
					if (girl==Girlgroup_enum.IVE) {
						IVE ive=new IVE("ELEVEN",6,2021);
						ive.memprint();
						Hitprint h=new Hitprint();//매개변수의 대형성 Hitprint.java
						h.print(ive);
						ive.explain();
						ive.addsong();
						ive.printsong();
						
					}
					else if(girl==Girlgroup_enum.BLACKPINK) {
						BLACKPINK bla=new BLACKPINK("뚜두뚜두",4,2016);
						bla.memprint();
						Hitprint h=new Hitprint();//매개변수의 대형성 Hitprint.java
						h.print(bla);
						bla.explain();
						bla.addsong();
						bla.printsong();
					}
					else if(girl==Girlgroup_enum.AESPA) {
						Aespa aespa=new Aespa("Next Level",4,2020);
						aespa.memprint();
						Hitprint h=new Hitprint();//매개변수의 대형성 Hitprint.java
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
				List<String> dramalist = new ArrayList<>(); //List 컬렉션
				
				dramalist.add("오징어 게임");//add메소드를 이용해 객체추가
				dramalist.add("사랑의 불시착");
				dramalist.add("이상한 변호사 우영우");
				System.out.println("대표적인 한국드라마 3가지");
				System.out.println("-------------------------------------");
				
				//interface 다형성 이용
				K_drama_explain ex_drama= new K_drama_explain();
				
				Squid_game squidgame=new Squid_game();
				Crash_Landing_on_You cloy= new Crash_Landing_on_You();
				Extraordinaryy_Attorney_Woo eaw= new Extraordinaryy_Attorney_Woo();
				
				ex_drama.explain(squidgame); //interface 매개변수 다형성 K_drama_explain.java
				ex_drama.explain(cloy);//interface 매개변수 다형성 K_drama_explain.java
				ex_drama.explain(eaw);//interface 매개변수 다형성 K_drama_explain.java

				System.out.println("-------------------------------------");
				System.out.println("추천 드라마를 추가하려면 1을 입력해 주세요.");
				while(true) {//예외처리 입력이 정수가 아니면 안내메시지와 함께 다시 입력받음.
					try {
						function=input.nextInt();
						break;
					}
					catch( InputMismatchException ime) {
						input=new Scanner(System.in);
						System.out.println("정수만 입력하세요");
						
					}
				}
				
				if (function==1) {
					System.out.println("드라마 제목을 입력하세요");
					String title;
					input=new Scanner(System.in);
					title=input.nextLine();//내용을 입력받아서 txt파일에 내용추가
					
					BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream("\\project_java\\src\\korea\\recomdrama.txt"),"euc-kr"));
					bw.write(title);
					bw.close();//파일 입출력
					
					System.out.println("sangyoun's 추천 드라마 목록:");
					for(int i=0; i<dramalist.size();i++) {
						System.out.println(dramalist.get(i));
					}
					System.out.println("-------------------------");
					System.out.println("사용자 추천 드라마:");
					
					try {
						BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream("./recomdrama.txt"),"utf-8"));
						String line=null;
						while ((line=br.readLine())!=null) {
							System.out.println(line);
						}
					}catch(FileNotFoundException e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println("해당없음. 확인후 다시 입력해주세요.");
				}
				
			}
			
			else {//기능에 해당하지 않는 정수가 입력됐을 때 안내
				System.out.println("해당없음. 확인후 다시 입력해주세요.");
			}
	}

}

