package ch09.ex9_15_destructingDeclarationAtCollections

import ch09.ex9_14_destructingDeclaration.NameComponents

fun splitFileName2(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}