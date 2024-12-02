package dev.mendo.projectslate

import org.springframework.stereotype.Service
import org.yaml.snakeyaml.Yaml
import java.io.File
import java.io.FileInputStream
import java.io.InputStream

@Service
class YamlImportService {

    fun importYaml(yamlFile: String) {
        println(yamlFile)

        val inputStream: InputStream = FileInputStream(File(yamlFile));
        val yaml = Yaml();
        val data : Map<String, Any> = yaml.load(inputStream);

        when (data["kind"]) {
            "Form" -> {
                @Suppress("UNCHECKED_CAST")
                importForm(data["spec"] as Map<String, Any>)
            }
            else -> {
                println("Not a form")
            }
        }

    }

    fun importForm(spec: Map<String, Any>){
        println(spec)
        println(spec["name"])
        val fields = spec["fields"] as List<Map<String, Any>>
        val map : List<FormField> = fields.map { it -> {
            FormField(it["name"] as String, it["type"] as String)
        }}.toList() as List<FormField>
        val formTemplate = FormTemplate(spec["name"] as String, map)

    }
}