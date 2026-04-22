package ch13.ex13_22_tableAtExposedFramework

import org.jetbrains.exposed.sql.Table

object Country: Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", 50)
    override val primaryKey = PrimaryKey(id)
}