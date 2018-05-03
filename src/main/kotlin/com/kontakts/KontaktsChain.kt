package com.example

import ratpack.kotlin.handling.KChainAction

class KontaktsChain : KChainAction() {
  override fun execute() {
    get {
      render("kontakts")
    }
  }
}
