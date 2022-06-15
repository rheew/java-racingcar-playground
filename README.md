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
### 기능 구현
-[ ] 쉼표 또는 콜론을 구분자로 문자열을 전달하고 구분자로 분리된 수들의 합 찾는 기능
    -[ ] 문자열의 구분자를 파악 기능 (',' ':')
    -[ ] 구분자로 문자열 분리 기능
    -[ ] 분리된 문자열의 합
    -[ ] 빈 문자열일 경우 0
  
-[ ] 커스텀 구분자를 사용할 수 있고, 그 구분자로 분리된 수들의 합을 구하는 기능
    -[ ] 커스텀 구분자 파악 ('//', '\n' 사이에 있는 문자열이 구분자)
  
-[ ] 숫자가 아니거나 음수일 경우 RuntimeException 을 발생시킨다.
---