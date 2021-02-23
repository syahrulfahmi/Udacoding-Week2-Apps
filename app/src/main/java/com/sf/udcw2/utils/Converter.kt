package com.sf.udcw2.utils

/**
 * بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ
 * Created By Fahmi on 23/02/21
 */

class Converter() {
    companion object {
        fun convert(value: String, from: String, to: String): String {
            when (from) {
                Conversion.KM -> {
                    if (to == Conversion.KM) {
                        return (value.toInt() * 1).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.HM) {
                        return (value.toInt() * 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DAM) {
                        return (value.toInt() * 100).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.M) {
                        return (value.toInt() * 1_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DM) {
                        return (value.toInt() * 10_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.CM) {
                        return (value.toInt() * 100_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.MM) {
                        return (value.toInt() * 1_000_000).toBigDecimal().toPlainString()
                    }
                }
                Conversion.HM -> {
                    if (to == Conversion.KM) {
                        return (value.toDouble() / 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.HM) {
                        return (value.toInt() * 1).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DAM) {
                        return (value.toInt() * 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.M) {
                        return (value.toInt() * 100).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DM) {
                        return (value.toInt() * 1000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.CM) {
                        return (value.toInt() * 10_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.MM) {
                        return (value.toInt() * 100_000).toBigDecimal().toPlainString()
                    }
                }
                Conversion.DAM -> {
                    if (to == Conversion.KM) {
                        return (value.toDouble() / 100).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.HM) {
                        return (value.toDouble() / 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DAM) {
                        return (value.toInt() * 1).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.M) {
                        return (value.toInt() * 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DM) {
                        return (value.toInt() * 100).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.CM) {
                        return (value.toInt() * 1000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.MM) {
                        return (value.toInt() * 10_000).toBigDecimal().toPlainString()
                    }
                }
                Conversion.M -> {
                    if (to == Conversion.KM) {
                        return (value.toDouble() / 1_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.HM) {
                        return (value.toDouble() / 100).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DAM) {
                        return (value.toDouble() / 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.M) {
                        return (value.toInt() * 1).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DM) {
                        return (value.toInt() * 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.CM) {
                        return (value.toInt() * 100).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.MM) {
                        return (value.toInt() * 1_000).toBigDecimal().toPlainString()
                    }
                }
                Conversion.DM -> {
                    if (to == Conversion.KM) {
                        return (value.toDouble() / 10_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.HM) {
                        return (value.toDouble() / 1_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DAM) {
                        return (value.toDouble() / 100).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.M) {
                        return (value.toDouble() / 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DM) {
                        return (value.toInt() * 1).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.CM) {
                        return (value.toInt() * 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.MM) {
                        return (value.toInt() * 100).toBigDecimal().toPlainString()
                    }
                }
                Conversion.CM -> {
                    if (to == Conversion.KM) {
                        return (value.toDouble() / 100_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.HM) {
                        return (value.toDouble() / 10_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DAM) {
                        return (value.toDouble() / 1_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.M) {
                        return (value.toDouble() / 100).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DM) {
                        return (value.toDouble() / 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.CM) {
                        return (value.toInt() * 1).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.MM) {
                        return (value.toInt() * 10).toBigDecimal().toPlainString()
                    }
                }
                Conversion.MM -> {
                    if (to == Conversion.KM) {
                        return (value.toDouble() / 1_000_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.HM) {
                        return (value.toDouble() / 100_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DAM) {
                        return (value.toDouble() / 10_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.M) {
                        return (value.toDouble() / 1_000).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.DM) {
                        return (value.toDouble() / 100).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.CM) {
                        return (value.toDouble() / 10).toBigDecimal().toPlainString()
                    }
                    if (to == Conversion.MM) {
                        return (value.toInt() * 1).toBigDecimal().toPlainString()
                    }
                }
            }
            return "0"
        }
    }

    object Conversion {
        const val KM = "km"
        const val HM = "hm"
        const val DAM = "dam"
        const val M = "m"
        const val DM = "dm"
        const val CM = "cm"
        const val MM = "mm"
    }
}