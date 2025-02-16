import androidx.compose.ui.window.ComposeUIViewController
import tv.warbox.app.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
