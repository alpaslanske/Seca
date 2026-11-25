package com.seca.phone.screening

/**
 * French numbers reserved for telemarketing. Since 2023 the ARCEP requires
 * automated and unsolicited sales calls to come from these ranges, so a call
 * from one of them is an advertisement by definition.
 */
internal object Telemarketing {

    private val FrenchRanges = listOf("162", "163", "270", "271", "377", "378", "424", "425", "568", "569", "948", "949")
    private val TurkishRanges = listOf("850", "444")

    /** [e164] or [raw] as telemarketing number. */
    fun isTelemarketing(e164: String, raw: String = ""): Boolean {
        if (e164.startsWith("+33") && FrenchRanges.any { e164.startsWith("+33$it") }) return true
        if (e164.startsWith("+90") && TurkishRanges.any { e164.startsWith("+90$it") }) return true
        val cleanRaw = raw.filter { it.isDigit() }
        if (cleanRaw.length >= 10 && TurkishRanges.any { cleanRaw.startsWith(it) || cleanRaw.startsWith("0$it") }) return true
        return false
    }

    /**
     * Whether the filter is worth offering on a phone in [region].
     */
    fun offeredIn(region: String): Boolean =
        region.equals("FR", ignoreCase = true) || region.equals("TR", ignoreCase = true)
}
