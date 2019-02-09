# SimpleBoard
### 기능
- 게시판 조회, 삭제, 수정, 등록
- 페이징 기능
- 댓글 기능
  - REST 로 구현
### 실행 환경
- Springboot (2.1.2)
- SpringFramework (5.1.4)
- mybatis (3.2.8)
- h2 db (in-memory-db)
### 실행방법
1. SimpleBoard 프로젝트의 SimpleBoardApplication.java 실행
2. http://localhost:8080/sboard/list url 접속
### 데이터베이스 접근 방법
1. SimpleBoard 프로젝트의 SimpleBoardApplication.java 실행
2. http://localhost:8080/h2console url 접속
3. url : jdbc:h2:file:./db/board, user : app, password : 1234 접속
