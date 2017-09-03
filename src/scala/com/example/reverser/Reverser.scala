package com.example.reverser

import org.apache.commons.lang3.StringUtils

object Reverser {

  def reverse(str: String): String = {
    StringUtils.reverse(str)
  }
}