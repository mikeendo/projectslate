package dev.mendo.projectslate

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.util.UUID

class FormTemplate (
    val name: String,
    val fields: List<FormField>
)

@Entity
class FormTemplateEntity (
    @Id val id: UUID,
    val name: String,

    @OneToMany
    val fields: List<FormFieldEntity>
)

class FormField (
    val name: String,
    val type: String,
)

@Entity
class FormFieldEntity (
    @Id val id: UUID,
    val name: String,
    val type: String
)
