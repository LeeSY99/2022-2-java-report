package korea;

public class NCT extends Idol{
	int debut;
	String[] songs=new String[6];// 인기 타이틀곡 저장하는 배열
	
	public NCT(String hitsong,int member, int debut) {
		super(hitsong ,member);
		this.debut=debut;
		System.out.println("====================================");
		System.out.println("NCT");
		System.out.println("------------------------------------");
		System.out.println(debut+"년 데뷔");
	}
	
	void addsong() {//인기 타이틀곡 배열에 저장
		songs[0]="90's Love";
		songs[1]="GO";
		songs[2]="Favorite (vampire)";
		songs[3]="Punch";
		songs[4]="Universe (Let's Play Ball)";
		songs[5]="버퍼링 (Glitch Mode)";
		
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
	void memprint() { //멤버 출력
		System.out.println("태일, 쟈니, 태용, 유타, 쿤, 도영, 텐, 재현, 윈윈, 정우, 루카스, 마크, 샤오쥔, 헨드리, 런쥔, 제노, 해찬, 재민, 양양, 쇼타로, 성찬, 천러, 지성");
	}
	public void hitsongprint() {//매개변수의 다형성->최고 조회수 뮤비 출력
		System.out.println("유튜브 뮤직비디오 최다 조회수:");
		System.out.println("NCT 127: 영웅 - 166,098,679회");
		System.out.println("NCT DREAM: akt - 168,311,086회");
		System.out.println("WayV: Love Talk  - 76,366,547회");
	}
	void explain() { //그룹 특징 출력
		System.out.println("특징: 멤버 수의 제한이 없으며 새로운 멤버의 영입이 자유롭고 다양한 도시에서 다양한 구성으로 활동한다(지역마다 팀을 나눠서 활동, 같은 노래를 다양한 언어로 부름).");
	}
}