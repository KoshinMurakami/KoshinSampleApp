# KoshinSampleApp
My android app sample

## 開発環境
Android Studio Hedgehog（ https://developer.android.com/studio?hl=ja ）

## 言語
Kotlin 1.9.22（ https://kotlinlang.org/docs/whatsnew1920.html ）

## 主な機能
- チップ計算
  - https://developer.android.com/codelabs/basic-android-kotlin-training-xml-layouts?hl=ja#0
  - 上記リンクの内容に追加で、計算ロジックと画面遷移を実装
- Google Mapの表示
  - https://developers.google.com/codelabs/maps-platform/maps-platform-101-android?hl=ja#0
  - 上記リンクの「6.マーカーを追加する」まで実装

## 処理概要

### MainActivity.kt
- 画面のxmlファイル読み込み
  - setContentView(R.layout.activity_main)
- ボタン押下時の画面遷移処理
  - setOnClickListener

### TipCalculatorActivity.kt
- MainActivityで表示した画面に戻るボタンの表示・戻る処理
  - supportActionBar?.setDisplayHomeAsUpEnabled(true)
- 画面の要素の取得
  - findViewById
- チップ計算ロジック
  - ラジオボタンで選択した値の取得
    - checkedRadioButtonId
  - 画面のテキストの書き換え

### MapActivity.kt
- 地図の表示
- 地図上にマーカーを追加する
  - jsonから読み取った位置情報をもとに追加している
- （以下は追加で実装したいができていない）
  - メモ機能の実装

### 要注意
- Codelabの内容が古い
  - 自分の環境とプラグインのバージョンが合わない
  - APIキーの取得方法のUIが例と違う
- 新しいActivityを作成したら、AndroidManifest.xmlにactivityタグを追加する
- APIキーはlocal.propertiesに定義しており、git管理していないため、cloneして使用する際は各々APIキーを取得して以下のコードを追加する
  - ```GOOGLE_MAPS_API_KEY=YOUR_KEY_HERE```
