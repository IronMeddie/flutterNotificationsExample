package com.example.testflutter

import io.flutter.embedding.android.FlutterActivity
import io.appmetrica.analytics.push.AppMetricaPush
import android.graphics.Color
import androidx.core.app.NotificationCompat
import android.os.Bundle

class MainActivity: FlutterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppMetricaPush.getNotificationCustomizersHolder()
            .useProviderFor(NotificationCompat.Builder::setColor) { push ->
                push.notification?.color ?: Color.RED // Выбор цвета по умолчанию
            }
    }
}
