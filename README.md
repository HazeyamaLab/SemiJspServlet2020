# SemiJspServlet2020
2020年技ゼミ説明用のサンプルアプリ


### 必要なツール

- docker
- gradle


### 起動方法

1. mysqlの起動
dockerを用いてmysqlを起動する.
```
cd mysql 
```
でmysqlディレクトリに移動
```
docker-compose up -d
```
mysqlをもつコンテナを起動する.(-d はバックグラウンドでの起動)



2. serverの起動

SemiJsp2020ディレクトリにおいて

```
gradle tR
```

これでサーバーが起動して, localhost:8080で待ってますみたいなメッセージが出る.


3. chromeで確認

choromeで[localhost:8080](http://localhost:8080)にアクセスするとページが見れるはず
