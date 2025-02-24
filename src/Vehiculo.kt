open class Vehiculo(val marca: String, val modelo: String, val capacidadCombustible: Int) {

    open fun mostrarInformacion() {
        println("[+] Marca: $marca")
        println("[+] Modelo: $modelo")
        println("[+] Tanque: $capacidadCombustible litros (L)")
    }

    open fun calcularAutonomia(): Int {
        return capacidadCombustible * 10
    }
}