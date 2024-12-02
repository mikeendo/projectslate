package dev.mendo.projectslate

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class YamlImportServiceTest{


  @Test
  fun test() {
   YamlImportService().importYaml("src/main/resources/test.yaml")
  }


 }