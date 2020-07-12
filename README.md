# learningSpringBootKotlin

SpringBoot + Kotlinの学習用のリポジトリ

# Setup

## Install MongoDB

```
brew tap mongodb/brew
```

```
brew install mongodb-community@4.2
```

# Start

Run MongoDB

```
brew services start mongodb-community@4.2
```

# 動作確認

http://localhost:9000/graphiql

## データ登録

Snackを新規登録
```
mutation {
  newSnack(name: "French Fries", amount: 40.5) {
    id
    name
    amount
  }
}
```

Snackにレビューを追加
```
mutation {
    newReview(snackId:"SNACK_ID",
    text: "Awesome snack!", rating:5
    ){
        snackId, text, rating
    }
}
```
`SNACK_ID` は上で追加したIDに置き換えて登録

## データ参照

```
query {
  snacks {
    name,
    reviews {
      text, rating
    }
  }
}
```



# 参考
- [Building GraphQL APIs with Kotlin, Spring Boot, and MongoDB](https://auth0.com/blog/building-graphql-apis-with-kotlin-spring-boot-and-mongodb/)