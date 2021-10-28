#!/bin/bash
  echo OFF
  echo [`date`] 开始对拍 $1

  java JianCeShiShuJu.java
  java Baoli.java
  java ShuLie.java

  diff shulie.out baoli.out

  if [ "$?" -ne 0 ]; then
    echo "$1 对拍不匹配，退出"
    exit 1
  fi

  echo [`date`] 对拍 $1 完成
