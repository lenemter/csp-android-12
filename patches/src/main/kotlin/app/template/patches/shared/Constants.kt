package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_CLIP_STUDIO = Compatibility(
        name = "Clip Studio Paint",
        packageName = "jp.co.celsys.clipstudiopaint.googleplay",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x1E1E1E,
        targets = listOf(
            AppTarget(
                version = "5.1.4"
            ),
            AppTarget(
                version = null,
                isExperimental = true
            )
        )
    )
}
