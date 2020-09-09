# Attendance-management
## Attendance-management란?
    직원의 근태관리에 필요한 모든 것을 제공하기 위한 프로젝트 입니다. MVC 모델을 사용한 사이트을 개설 할 것입니다.
----------
## 주요 기능
* 직원
```
    1. 본인의 시업 · 종업 및 초과근무, 지각 등 기록
    2. 계획된 근무일정과 비교 및 분석
    3. 휴가 계획/취소

```
* 관리자
```
    1. 직원들의 실시간 근태 현황을 확인
    2. 출퇴근 기록표 Excel 추출

```
* 모든 기능은 실시간 동기화를 목표로 합니다.
## 개발 환경
* Spring Framework - MVC 모델
* MYSQL
* Apache7.0
-------
## 현황
* 화면설계
>Main
![main](https://user-images.githubusercontent.com/37145125/92296971-4bca9080-ef75-11ea-9199-5debf8d930ec.png)
login
![Login](https://user-images.githubusercontent.com/37145125/92296961-40776500-ef75-11ea-9cfa-767e46d8541d.png)
Excel
![Excel](https://user-images.githubusercontent.com/37145125/92296955-30f81c00-ef75-11ea-925f-ec87b8bda028.png)

* DB_ER
>다이어그램
![DB_Oracle_ER](https://user-images.githubusercontent.com/37145125/92441127-999aff00-f1e8-11ea-898f-40fac42261a4.png)

---------
## 개선방안
1. 언어를 전부 일본어로 변경
2. 스타일들은 따로 css 파일 작성
3. 엔티티, DB, 환경설정 변경
    >https://qiita.com/ozaki25/items/fe5fc876bd55a9d7daa9
    https://qiita.com/rubytomato@github/items/cb7c40cea2ff3225d5e3
4. DB에 작성자id, 갱신자, create_time, update_time 추가
5. 커멘트 변경, 작성
6. 자동 주석 생성
    >https://hermeslog.tistory.com/308
7. checkstyle 생성
    >http://www.develop-memo.com/java/eclipseplugin/checkstyle.html
---------
## 참고 사이트
    https://shiftee.io/ko
