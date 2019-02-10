# SimpleBoard
### 기능
- 게시판 조회, 삭제, 수정, 등록
- 페이징 기능
- 댓글 기능 (댓글 페이징 구현)
- 검색 기능
- 로그인 기능
- 권한 기능 (수정, 등록, 삭제 시 로그인 필요)
--- 
### 환경
- Springboot (2.1.2)
- SpringFramework (5.1.4)
- mybatis (3.2.8)
- h2 db (in-memory-db)
- maven
--- 
### 실행방법
##### 1. https://github.com/leechoongyon/Board.git 밑에 속한 SimpleBoard 프로젝트 내려받기.
* maven 필요 
##### 2. SimpleBoard 프로젝트의 SimpleBoardApplication.java 실행
##### 3. http://localhost:8080/user/login url 접속
* id : user00, pw : user00
##### 4. 위에 기재된 게시판 기능 수행
---
### 데이터베이스 접근 방법
##### 1. SimpleBoard 프로젝트의 SimpleBoardApplication.java 실행
##### 2. http://localhost:8080/h2console url 접속
##### 3. 접속 정보
* Generic H2 (Embedded)
* url : jdbc:h2:file:./db/board
* user : app
* password : 1234
---
### 테이블 
##### 1. TBL_BOARD
* 게시판 정보 테이블
##### 2. TBL_REPLY
* 게시판 답글 정보 테이블
##### 3. TBL_USER
* 유저 정보 관리
### Reference
* 코드로 배우는 스프링 웹 프로젝트 책 참고
