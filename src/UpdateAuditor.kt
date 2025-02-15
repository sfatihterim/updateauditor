import javafx.application.Application
import javafx.application.Application.launch
import javafx.scene.Scene
import javafx.scene.layout.VBox
import javafx.stage.Stage
import model.SheetPage
import model.Team
import screen.AuditUpdatesScreen
import screen.LoadPlayersScreen

class UpdateAuditor : Application() {

    private lateinit var primaryStage: Stage

    private val loadPlayersScreen = LoadPlayersScreen()
    private val auditUpdatesScreen = AuditUpdatesScreen()

    override fun start(primaryStage: Stage) {

        this.primaryStage = primaryStage

        primaryStage.scene = Scene(VBox(), 600.0, 400.0)
        primaryStage.title = "Update Auditor"
        primaryStage.show()

        loadPlayersScreen.start(this, primaryStage)
    }

    fun onLoadClicked(sheetPageList: List<SheetPage>, teamList: List<Team>, currentSeason: Int) {
        auditUpdatesScreen.start(primaryStage, sheetPageList, teamList, currentSeason)
    }
}

fun main() {
    launch(UpdateAuditor::class.java)
}