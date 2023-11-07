#!/usr/bin/env bash

###################################################################
#Description	: Builds the DB-UI Core Assets and moves them to the right folder
#Args           : Keine
###################################################################

clean() {
  rm -rf ../deployments/core/src/main/resources/public/css/ \
        ../deployments/core/src/main/resources/public/fonts/ \
        ../deployments/core/src/main/resources/public/icons/ \
        ../deployments/core/src/main/resources/public/images/
}

buildCss() {
  mkdir ../deployments/core/src/main/resources/public/css/
  cp -r node_modules/@db-ui/core/dist/css/* ../deployments/core/src/main/resources/public/css/
}

buildFonts() {
  mkdir ../deployments/core/src/main/resources/public/fonts
  cp -r node_modules/@db-ui/core/dist/fonts/* ../deployments/core/src/main/resources/public/fonts
}

buildIcons() {
  mkdir ../deployments/core/src/main/resources/public/icons
  cp -r node_modules/@db-ui/core/dist/icons/* ../deployments/core/src/main/resources/public/icons
}

buildImages() {
  mkdir ../deployments/core/src/main/resources/public/images
  cp -r node_modules/@db-ui/core/dist/images/* ../deployments/core/src/main/resources/public/images
}

main() {
  clean
  buildCss
  buildFonts
  buildIcons
  buildImages
}

main