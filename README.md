## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
--- 
## 학습자 작성

---
### 문자열 계산기 기능 구현
-[x] 쉼표 또는 콜론을 구분자로 문자열을 전달하고 구분자로 분리된 수들의 합 찾는 기능
    -[x] 문자열의 구분자를 파악 기능 (',' ':')
    -[x] 구분자로 문자열 분리 기능
    -[x] 분리된 문자열의 합
    -[x] 빈 문자열일 경우 0
  
-[x] 커스텀 구분자를 사용할 수 있고, 그 구분자로 분리된 수들의 합을 구하는 기능
    -[x] 커스텀 구분자 파악 ('//', '\n' 사이에 있는 문자열이 구분자)
  
-[x] 숫자가 아니거나 음수일 경우 RuntimeException 을 발생시킨다.
---
### 자동차 경주 기능 구현
-[x] 자동차 생성 기능 - Cars
  - [x] 자동차 ','로 이름 구분
  - [x] 자동차 이름 제한 5자 이하 - Car#name
  - [x] 자동차 각 위치 저장 - Car#position
- [ ] 유저 입력 시도 횟수 만큼 반복 - Game
  -[ ] 0 ~ 9 랜덤 값 중 4 이상일 경우에 전진
    -[x] 0 ~ 9 랜덤 값 생성기 Game#scoreGenerator
    -[x] 4 이상일 경우전진 기능 Car#isForward
    -[ ] 이동시 자동차 이름 출력 기능
    
-[ ] 완료 후 우승자 출력 여러명일 수 있음
  -[x] 우승자 선발 Cars#winners

---