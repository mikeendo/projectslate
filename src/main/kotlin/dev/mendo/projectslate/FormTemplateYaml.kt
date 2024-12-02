package dev.mendo.projectslate

class FormTemplate (
    val name: String,
    val fields: List<FormField>
) {
}

open class FormField (
    open val name: String,
    open val type: String
)

class FormFieldEntity (
    override val name: String,
    override val type: String
): FormField(name, type)
