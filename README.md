# KoshinSampleApp
My android app sample

## 開発環境
Android Studio Hedgehog（ https://developer.android.com/studio?hl=ja ）

## 言語
Kotlin 1.9.22（ https://kotlinlang.org/docs/whatsnew1920.html ）

## 主な機能
- チップ計算
  - https://developer.android.com/codelabs/basic-android-kotlin-training-xml-layouts?hl=ja#0
- Google Mapの表示

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