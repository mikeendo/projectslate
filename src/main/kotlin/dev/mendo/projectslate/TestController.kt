package dev.mendo.projectslate

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/test")
class TestController (
    val yamlImportService: YamlImportService
){

    @GetMapping
    fun test(model: Model): String {

        val formTemplate = yamlImportService.importYaml("src/main/resources/test.yaml")
        model.addAttribute("form", formTemplate)
        return "test"
    }
}