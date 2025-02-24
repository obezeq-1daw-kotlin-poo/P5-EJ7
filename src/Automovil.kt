class Automovil(marca: String, modelo: String, capacidadCombustible: Int, val tipo: String) : Vehiculo(marca, modelo, capacidadCombustible) {

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("[+] Tipo de auto: $tipo")
    }

    override fun calcularAutonomia(): Int {
        val autonomiaBase = super.calcularAutonomia()
        return autonomiaBase + 100
    }
}