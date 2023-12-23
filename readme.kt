package mx.gob.centro.epicentro

import android.content.Context

class readme {

    /**
     * Convierte un valor en densidad de píxeles (dp) a píxeles (px) según la densidad de la pantalla.
     */
    fun dpToPx(context: Context, dp: Float) : Float {
        return dp * context.resources.displayMetrics.density
    }

    /**
     * Convierte un valor en píxeles (px) a densidad de píxeles (dp) según la densidad de la pantalla.
     */
    fun pxToDp(context: Context, pxValue: Float): Float {
        val density = context.resources.displayMetrics.density
        return pxValue / density
    }

    fun removeAccents(input: String): String {
        val regex = "\\p{InCombiningDiacriticalMarks}+".toRegex()
        val temp = java.text.Normalizer.normalize(input, java.text.Normalizer.Form.NFD)
        return regex.replace(temp, "")
    }


}
