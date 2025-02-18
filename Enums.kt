enum class UserRole ( val accessLevel: Int){
    ADMIN(3),
    EDITOR(2),
    VIEWER(1)
}


fun  CheckAccess(userRole: UserRole, requiredLevel: Int): Boolean {
    return userRole.accessLevel >= requiredLevel
}

fun main() {
    val admin = UserRole.ADMIN
    val editor = UserRole.EDITOR
    val viewer = UserRole.VIEWER


    println("Dose EDITOR have enough access for a level 3 task? ${ CheckAccess(editor, 3)}")
    println("Does ADMIN have enough access for a level 2 task? ${ CheckAccess(admin, 2)}")
    println("Dose viewer have enough access for a level 1 task? ${ CheckAccess(viewer, 1)}")



    for (role in UserRole.values()) {
        println("${role.name} has access level ${role.accessLevel}")
    }
}
