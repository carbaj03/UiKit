package com.fintonic.uikit.common

import java.io.Serializable

fun <A> identity(a: A): A = a

sealed class Option<out A> : Serializable {
    fun <B> fold(ifEmpty: () -> B, some: (A) -> B): B = when (this) {
        is None -> ifEmpty()
        is Some -> some(value)
    }

    fun <B> map(f: (A) -> B): Option<B> = fold({ None }, { a -> Some(f(a)) })

    fun <B> flatMap(f: (A) -> Option<B>): Option<B> = fold({ None }, { a -> f(a) })

    abstract fun isEmpty(): Boolean
}

fun <T> Option<T>.getOrElse(default: () -> T): T = fold({ default() }, ::identity)

fun <A, B : A> Option<B>.orElse(alternative: () -> Option<B>): Option<B> = if (this.isEmpty()) alternative() else this

fun <A> A?.toOption(): Option<A> = this?.let { Some(it) } ?: None

fun <A> Option<A>.toNulable(default: A): A = fold({ default }, { it })

fun <A> Option<A>.toNulable(): A? = this.fold({ null }, { it })

fun <A> A.some(): Option<A> = Some(this)

object None : Option<Nothing>(){
    override fun isEmpty() = true
}

data class Some<out R>(val value: R) : Option<R>(){
    override fun isEmpty() = false
}