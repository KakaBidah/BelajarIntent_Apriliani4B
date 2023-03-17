package com.indah.belajarintent_apriliani4b

import android.os.Parcel
import android.os.Parcelable

data class Cars(
    val merek : String?,
    val tahun : Int,
    val plat : String?
    ): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(merek)
        parcel.writeInt(tahun)
        parcel.writeString(plat)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cars> {
        override fun createFromParcel(parcel: Parcel): Cars {
            return Cars(parcel)
        }

        override fun newArray(size: Int): Array<Cars?> {
            return arrayOfNulls(size)
        }
    }
}
