Feature: 学习中心 - 自主学习

  Scenario Outline: 作为学生，我想点击自主学习，系统根据最新学习进度，选择当前单元或下一个单元的下一个单词，进行单词学习。

  学习过程：
  -- 按课程顺序逐个显示需要学习的单词；
  -- a，显示单词，单词的音标、词性、释义、例句，并自动播放单词读音；
  -- b，通过打字拼写该单词（拼写正确）后，自动进入下一个单词的学习；
  -- 每个单词的学习重复以上a、b步骤；
  -- 每组学习数量为该单元剩下单词（最多10个单词），学习完成后，让我选择继续学习下一组，还是结束学习返回自主学习主页面。"

  Given I am a student <user name> and I have <remaining word number> words in current unit
  When I start self learning
  Then I get my latest learning progress
  Then I have <remaining word number> words to learn
  Then Word, spelling, word_means, sentence, sentence_means are returned for each word
  When I learn a word
  Then My latest learning progress is updated

  Examples:
    | user name | remaining word number |
    | "anton"   | 10                    |
    | "liang"   | 8                     |