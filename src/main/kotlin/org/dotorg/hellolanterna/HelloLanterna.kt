package org.dotorg.hellolanterna

import com.googlecode.lanterna.TerminalSize
import com.googlecode.lanterna.TextColor
import com.googlecode.lanterna.gui2.*
import com.googlecode.lanterna.screen.TerminalScreen
import com.googlecode.lanterna.terminal.DefaultTerminalFactory

fun main(args: Array<String>) {

    val terminal = DefaultTerminalFactory().createTerminal()
    val screen = TerminalScreen(terminal)
    screen.startScreen()

    val panel = Panel()
    panel.setLayoutManager(GridLayout(2))

    panel.addComponent(Label("Forename"))
    panel.addComponent(TextBox())

    panel.addComponent(Label("Surname"))
    panel.addComponent(TextBox())

    panel.addComponent(EmptySpace(TerminalSize(0,0)))

    panel.addComponent(Button("Submit"))

    val window = BasicWindow()
    window.component = panel

    val gui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.ANSI.BLUE))

    gui.addWindowAndWait(window)

}