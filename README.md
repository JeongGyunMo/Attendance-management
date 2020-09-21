# Attendance-management
## Attendance-managementとは?
    職員の勤怠管理に必要なすべてを提供するためのプロジェクトです。 MVCモデルを使ったサイトを開設します。
----------
主要機能
*  職員
```
    1.本人の始業·終業及び超過勤務、遅刻等記録
    2.計画された勤務日程と比較及び分析
    3.休暇計画取り消し

```
*  管理者
```
    1.職員たちのリアルタイム勤怠現況を確認
    2.  通勤記録表Excel抽出

```
*  すべての機能は、リアルタイムでの同期を目標とします。
開発環境
*  Spring  Framework  -  MVCモデル
*  postgreSQL
*  Apache7.0
-------
現況
*  画面設計
>Main
![main](https://user-images.githubusercontent.com/37145125/92296971-4bca9080-ef75-11ea-9199-5debf8d930ec.png)
login
![Login](https://user-images.githubusercontent.com/37145125/92296961-40776500-ef75-11ea-9cfa-767e46d8541d.png)
Excel
![Excel](https://user-images.githubusercontent.com/37145125/92296955-30f81c00-ef75-11ea-925f-ec87b8bda028.png)

* DB_ER
>ダイアグラム
![DB_Oracle_ER](https://user-images.githubusercontent.com/37145125/92441127-999aff00-f1e8-11ea-898f-40fac42261a4.png)

---------
## 改善策
1.言語を全て日本語に変更
2.スタイルは別にcssファイルを作成
3.  エンティティ、DB、環境設定変更
    >https://qiita.com/ozaki25/items/fe5fc876bd55a9d7daa9
    https://qiita.com/rubytomato@github/items/cb7c40cea2ff3225d5e3
4.DBに作成者id、更新者、create_time、update_timeを追加
5.  コメントの変更、作成
6.  自動注釈生成
    >https://hermeslog.tistory.com/308
7. checkstyle生成
    >http://www.develop-memo.com/java/eclipseplugin/checkstyle.html
---------
## 参考サイト
    https://shiftee.io/ko
