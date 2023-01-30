package tax

import tax.TaxCalculator
import tax.Vehicle

class DefaultTaxCalculator : TaxCalculator() {
    override fun calculateTax(vehicle: Vehicle?): Int {
        return when (vehicle?.co2Emissions) {
            0 -> 0
            in 1..50 -> 10
            in 1..75 -> 25
            in 1..90 -> 105
            in 1..100 -> 125
            in 1..110 -> 145
            in 1..130 -> 165
            in 1..150 -> 205
            in 1..170 -> 515
            in 1..190 -> 830
            in 1..225 -> 1240
            in 1..255 -> 1760
            else -> 2070
        }
    }

}