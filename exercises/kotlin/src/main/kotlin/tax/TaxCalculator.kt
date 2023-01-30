package tax

import java.time.LocalDate

abstract class TaxCalculator (val year: Int = 2019) {

    abstract fun calculateTax(vehicle: Vehicle?): Int
}