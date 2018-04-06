val rootContext = AnnotationConfigWebApplicationContext();

@RestController
open class SomeController {

@Autowired
SomeService someService;

@GetMapping("/ping")
fun test(): String = "pong"

@GetMapping("/soSomeThing")
fun doSomeThing(@RequestParam("text") word: String,
              @RequestParam("lang") lang: Int): String = someService.doSomeThing();

}
