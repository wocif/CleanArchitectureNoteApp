package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

import androidx.room.FtsOptions

sealed class NoteOrder(val orderType: OrderType) {
    class Title(oderType: OrderType): NoteOrder(oderType)
    class Date(oderType: OrderType): NoteOrder(oderType)
    class Color(oderType: OrderType): NoteOrder(oderType)
}