<h2>Boot 설정</h2>
boot 사용시
new -> others -> Spring boot -> new spring starter project

type -> Maven 설정
Packaging -> 배포를 위해 war

Group : 식별하기위한 이름
Description : MyBatis project for Spring Boot
package : kr.spring.mybatis

next

version : 3.1.7


boot 사용시 jar파일을 따로 받아와서 사용하지않아도됨
Maven : 라이브러리 자원관리

사용할 라이브러리
검색 
Spring Web
Orcale Driver
JDBC API
MyBaits framework
Validation
DevTools(Spring Boot DevToolls)

pom.xml 설정변경
8번째 줄 spring-boot-starter-parent 아래 ver. -> 2.7.17
35번째 줄 mybatis-spring-boot-starter 아래 ver. -> 2.3.1
62번째 줄 mybatis-spring-boot-starter-test 아래 ver.-> 2.3.1

<h2>오류</h2>
kr.spring.board.dao를 ch12-Spring_MyBatis 에서
java파일,xml파일 붙여넣기 할 경우 에러뜨면 

Window -> preferences -> Validation -> 
MyBatis XML Mapper Validator 체크 두개 풀기
