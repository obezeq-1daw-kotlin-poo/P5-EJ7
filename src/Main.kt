
fun main() {

    val miLambo = Automovil("Lamborghini", "SVJ", 45, "Coupe")
    println("─────────────────────────────────")
    println("    Información del Automóvil    ")
    println("─────────────────────────────────")
    miLambo.mostrarInformacion()
    println("[+] Autonomía: ${miLambo.calcularAutonomia()} km.\n\n")

    val miTeslaMoto = Motocicleta("Tesla", "Moto", 18, 600)
    println("─────────────────────────────────")
    println("  Información de la Motocicleta  ")
    println("─────────────────────────────────")
    miTeslaMoto.mostrarInformacion()
    println("[+] Autonomía: ${miTeslaMoto.calcularAutonomia()} km.")

}