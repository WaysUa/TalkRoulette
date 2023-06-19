package com.main.talkroulette.main.sl

import androidx.lifecycle.ViewModel
import com.main.talkroulette.core.sl.Core
import com.main.talkroulette.core.sl.Module

interface DependencyContainer {

    fun <T : ViewModel> module(clazz: Class<T>): Module<*>

    class Error : DependencyContainer {
        override fun <T : ViewModel> module(clazz: Class<T>): Module<*> {
            throw IllegalStateException("no module found for $clazz")
        }
    }

    class Base(
        private val core: Core,
        private val dependencyContainer: DependencyContainer = Error()
    ) : DependencyContainer {

        override fun <T : ViewModel> module(clazz: Class<T>): Module<*> = when (clazz) {
//            NotesViewModel::class.java -> NotesModule(core)
//            AddNoteViewModel::class.java -> AddNoteModule(core)
//            EditNoteViewModel::class.java -> EditNoteModule(core)
//            DeleteNoteViewModel::class.java -> DeleteNoteModule(core)
            else -> dependencyContainer.module(clazz)
        }
    }
}
