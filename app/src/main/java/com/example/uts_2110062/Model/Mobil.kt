package com.example.uts_2110062.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mobil (
    var foto: Int = 0,
    var judul: String = "",
    var publish: String = "",
    var tanggal: String = "",
    var isi: String = "",
):Parcelable