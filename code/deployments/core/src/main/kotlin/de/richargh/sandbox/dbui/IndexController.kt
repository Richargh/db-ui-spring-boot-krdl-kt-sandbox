package de.richargh.sandbox.dbui

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class IndexController{

    @GetMapping("/")
    fun index(@RequestParam name: String?) =
            ResponseEntity
                    .status(HttpStatus.OK)
                    .contentType(MediaType.TEXT_HTML)
                    .body("""
                        <html>
                        <head>
                            <link href="/css/enterprise/db-ui-core.css" rel="stylesheet">
                        </head>
                        <body>
                            <p>Check Out <a href="pages/pages-sample.html">pages-sample</a></p>
                        </body>
                        </html>
                        """.trimIndent())
}