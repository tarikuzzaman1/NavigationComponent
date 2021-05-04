package org.bd.rosc.navigatio.safe_args.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**
 * Created by Md.Tarikuzzaman on 04-May-2021 12:45 PM, ROSC-II MIS Cell, LGED.
 */
@Parcelize
data class User(
  val firstName: String,
  val lastName: String
) : Parcelable
