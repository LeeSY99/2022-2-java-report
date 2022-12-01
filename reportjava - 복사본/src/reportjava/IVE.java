package reportjava;

public class IVE extends Idol{
	int debut;
	String[] songs = new String[3];// 인기 타이틀곡 저장하는 배열
	
	public IVE(String hitsong,int member, int debut) {
		super(hitsong ,member);
		this.debut=debut;
		System.out.println("IVE:");
		System.out.println(debut+"년 데뷔");
	}
	void addsong() {//인기 타이틀곡 배열에 저장
		songs[0]="ELEVEN";
		songs[1]="LOVE DIVE";
		songs[2]="AFTER LIKE";
		
	}
	void printsong() {//배열의 모든 곡들 출력
		System.out.print("타이틀 곡:");
		for (int i=0; i<songs.length; i++) {
			if (i==songs.length-1) {
				System.out.print(songs[i]);
			}
			else {
				System.out.print(songs[i]+ ", ");
			}
		}
	}
	void memprint() {//멤버 출력
		System.out.println("안유진, 가을, 레이, 장원영, 리즈, 이서");
	}
	public void hitsongprint() {//매개변수의 다형성->최고 조회수 뮤비 출력
		System.out.println("유튜브 뮤직비디오 최다 조회수: ELEVEN - 177,256,050회");
	}
	void explain() {//그룹 특징 출력
		System.out.println("특징: 걸크러시하면 떠오르는 파워풀하고 섹시한 콘셉트가 아닌 '소녀'라는 정체성을 유지하면서 거기에 '자기애'라는 이미지를 곁들인 색다른 콘셉트를 시도했다.");
	}
}
