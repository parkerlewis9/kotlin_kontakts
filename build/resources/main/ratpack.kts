import com.example.KontaktsChain
import ratpack.kotlin.handling.ratpack

ratpack {
  serverConfig {
    port(8080)
  }
  bindings {
    bindInstance("string")
    bind(KontaktsChain::class.java)
  }
  handlers {
    get("test") {
      render(get(String::class.java))
    }
    prefix("/api/kotakts", KontaktsChain::class.java)
  }
}
