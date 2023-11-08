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
                            <header class="rea-header">
                              <nav class="cmp-mainnavigation" id="mainnavigation-inheader01">
                                <input type="checkbox" id="toggle_mainnavigation-inheader01">
                                <label for="toggle_mainnavigation-inheader01" title="Toggle main navigation" class="is-site-name">UI Core</label>
                                <ul>
                                  <li aria-haspopup="true">
                                    <a href="#" class="elm-link " title="" rel="index" aria-current="page">Startseite
                                    </a>
                                    <ul>
                                      <li aria-haspopup="true">
                                        <a href="#" class="elm-link " title="" rel="index">Page
                                        </a>
                                        <ul>
                                          <li><a href="/" class="elm-link " title="" rel="index">Index</a></li>
                                          <li><a href="/pages/pages-sample.html" class="elm-link " title="" rel="index">Page Sample</a></li>
                                        </ul>
                                      </li>
                                      <li aria-haspopup="true">
                                        <a href="#" class="elm-link " title="" rel="offers">Components</a>
                                        <ul>
                                            <li><a href="/pages/components/dialog.html" class="elm-link " title="" rel="index">Dialog</a></li>
                                            <li><a href="/pages/components/table.html" class="elm-link " title="" rel="index">Table</a></li>
                                        </ul>
                                      </li>
                                      <li>
                                        <a href="#" class="elm-link " title="" rel="news">Submenu 03
                                        </a>
                                      </li>
                                    </ul>
                                  </li>
                                  <li>
                                    <a href="/pages/elements.html" class="elm-link " title="" rel="index">All Elements</a>
                                  </li>
                                  <li>
                                    <a href="/pages/components.html" class="elm-link " title="" rel="index">All Components</a>
                                  </li>
                                </ul>
                              </nav>
                              <div class="cmp-brand">
                                <a href="#" title="Home" rel="home">
                                  <img src="../../images/db_logo.svg" alt="Deutsche Bahn Logo" width="" height="" class="elm-image is-logo" elementtiming="logo">
                                </a>
                                <span class="is-site-name">UI Core</span>
                              </div>
                              <div class="rea-meta">
                                <form class="cmp-sitesearch" action="#" method="post" role="search">

                                  <!-- The aria-labelledby attribute on the input and related id on the label as well as aria-hidden="true" are being set for correct support within assistive tools like screenreaders //-->
                                  <input type="search" class="elm-input " placeholder="Suchen …" name="input00" id="input00" value="" aria-labelledby="input00-label">
                                  <label class="elm-label" for="input00" aria-hidden="true" id="input00-label">Suche</label>
                                  <button class="elm-button " title="Title text" type="submit">
                                    Suchen
                                  </button>
                                </form>
                                <ul class="cmp-metanavigation">
                                  <li>
                                    <a href="#" class="elm-link " title="Title text" rel="configuration">Einstellungen
                                    </a>
                                  </li>
                                  <li>
                                    <a href="#" class="elm-link " title="Title text" rel="messages">Nachrichten
                                    </a>
                                  </li>
                                </ul>
                                <ul class="cmp-language-switcher">
                                  <li>
                                    <a href="#" class="elm-link " title="English language" rel="alternate" hreflang="en">EN
                                    </a>
                                  </li>
                                  <li aria-current="page">
                                    <a href="#" class="elm-link " title="Deutsche Sprache" rel="bookmark" hreflang="de">DE
                                    </a>
                                  </li>
                                  <li>
                                    <a href="#" class="elm-link " title="Langue française" rel="alternate" hreflang="fr">FR
                                    </a>
                                  </li>
                                </ul>
                                <a href="#" class="elm-link " title="Title text" rel="account">Login
                                </a>
                              </div>
                            </header>
                            <main class="rea-main">
                                <h1>Hallo</h1>
                            </main>
                        </body>
                        </html>
                        """.trimIndent())
}