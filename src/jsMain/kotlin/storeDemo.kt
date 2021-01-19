import dev.fritz2.dom.html.*
import dev.fritz2.styling.params.styled

fun RenderContext.storeDemo(init: Div.() -> Unit): Div {
    return (::div.styled {

    }) {
        init()
    }
}