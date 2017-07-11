/**
 * 팀 리그 class 만들기
 */
public class Z01_TestTeam {
   public static void main(String[] args) {
      League l = new League("코리안리그");
      l.teams[0] = new Team("삼성", "수원");
      l.teams[1] = new Team("엘지", "서울");
      l.teams[2] = new Team("롯데", "부산");
      l.teams[3] = new Team("넥센", "인천");
      
      l.printLeague(); // 리그정보 출력
      
      l.match("삼성", "엘지");
      l.match("엘지", "넥센");
      l.match("롯데", "넥센");
      l.match("엘지", "롯데");
      l.match("엘지", "삼성");
      l.match("삼성", "롯데");
      
      l.viewAllRanking(); // 팀들의 전체 랭킹을 내림차순으로 출력
      
      l.viewRanking("롯데");
   } // end of main
} // end of class
class League {
   String nameLeague = ""; // 리그명
   Team teams[] = new Team[4]; // 팀의 총 개수를 4개로 지정
   
   League() {
   }
   League(String nameLeague) {
      this.nameLeague = nameLeague;
   }
   League(String nameLeague, Team[] teams) { // 팀명과,팀배열을 받음
      this.nameLeague = nameLeague;
      this.teams = teams;
   }
   /** 경기 진행*/
   void match(String nameWin, String nameLose) {
      int winIndex = -1;
      int loseIndex = -1;
      // 이긴팀, 진팀의 이름이 팀 배열에 존재하는지 확인
      for (int i = 0; i < teams.length; i++) {
         if (teams[i].name.equals(nameWin)) {
            winIndex = i;
         }
         if (teams[i].name.equals(nameLose)) {
            loseIndex = i;
         }
      }
      // 팀명을 찾았는지 확인 -> 찾은경우만 match를 진행
      if (winIndex == -1 || loseIndex == -1) { // 팀이 없는 경우
         System.out.println("팀목록에 없습니다. 팀명을 확인해주세요");
      } else { // 이긴팀, 진팀 모두 찾은 경우
         teams[winIndex].game(true);
         teams[loseIndex].game(false);
      }
   }
   /** 팀을 승률기준으로 내림차순 정렬 메서드 - 선택정렬 */
   void sortTeam() {
      for (int i = 0; i < teams.length; i++) {
         int maxIndex = i; // 최대값의 index를 저장할 변수
         for (int j = i+1; j < teams.length; j++) {
            if (teams[maxIndex].winningRate()
                           < teams[j].winningRate()) {
               maxIndex = j;
            }
         }
         // maxIndex <-> i(비교범위의 첫번째값) 교환 swap
         Team temp = teams[maxIndex];
         teams[maxIndex] = teams[i];
         teams[i] = temp;
      }
   }
   /** 팀순위(전체팀 내림차순 출력) */
   void viewAllRanking() {
      sortTeam(); // 내림차순 정렬 - 선택정렬
      // 정렬된 순서대로 팀정보 출력 printTeam()
      for (int i = 0; i < teams.length; i++) {
         System.out.print("["+(i+1)+"등] ");
         teams[i].printTeam();
      }
   }
   /** 팀순위(조회할팀명)-정보출력 */
   void viewRanking(String name) {
      sortTeam(); // 내림차순 정렬
      // 팀이 존재하는지 체크
      int index = -1;
      for (int i = 0; i < teams.length; i++) {
         if (teams[i].name.equals(name)) {
            index = i;
            break;
         }
      }
      if (index == -1) { // 못찾음
         System.out.println("팀목록에 없습니다. 팀명을 확인해주세요");
      } else { // 팀을 찾은 경우
         // 팀순위 + 팀의 정보출력 printTeam()
         System.out.print("["+(index+1)+"등] ");
         teams[index].printTeam();
      }
   }
   /** 리그정보 출력(리그명,참여팀목록,참여팀수) */
   void printLeague() {
      System.out.println("리그명 : " + nameLeague);
      System.out.println("[참여팀] : " + teams.length+"팀");
      for (int i = 0; i < teams.length; i++) {
         System.out.println(teams[i].name);
      }
   }
} // end of class League

class Team {
   String name = ""; // 팀명
   int numOfGame; // 총경기수
   int numOfWinGame; // 승수
   String hometown = ""; // 연고지
   
   Team() {
   }
   Team(String name, String hometown) {
      this.name = name;
      this.hometown = hometown;
   }
   
   /** true승/fasle패 의 경기수, 승수 연산하기 */
   void game(boolean result) {
      numOfGame++;
      numOfWinGame += result ? 1 : 0;
   }
   /** 승률 리턴 */
   double winningRate() {
      return (double)numOfWinGame / numOfGame;
   }
   /** 팀 정보 출력 */
   void printTeam() {
      System.out.println(name+"팀 (연고지 : "+hometown+")");
      System.out.println("\t총"+numOfGame+"경기, "
            +numOfWinGame+"승,"+(numOfGame-numOfWinGame)+"패");
      System.out.printf("\t승률 : %5.1f%%\n", winningRate()*100);
   }
} // end of class Team