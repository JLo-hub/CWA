package de.rki.coronawarnapp.logging

import timber.log.Timber

class FileLoggerTree(private val fileLoggerService: IFileLoggerService) : Timber.DebugTree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        fileLoggerService.log(LogElement(message, priority, tag))
    }
}
