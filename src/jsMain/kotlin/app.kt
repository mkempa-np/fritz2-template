import dev.fritz2.binding.storeOf
import dev.fritz2.components.checkbox
import dev.fritz2.components.clickButton
import dev.fritz2.components.pushButton
import dev.fritz2.dom.html.render
import dev.fritz2.dom.mount
import dev.fritz2.dom.states
import dev.fritz2.styling.params.BackgroundBlendModes.color
import dev.fritz2.styling.params.styled
import dev.fritz2.styling.style

fun main() {
    render{
        (::div.styled{
            margin { "2rem" }
            color { "#eeeeee" }
        }) {
            (::h1.styled {
              margins {
                  top { "1.25rem" }
              }
            }) { +"fritz2 Template Test using the fritz2 documentation" }
            (::p.styled {
                margins {
                    top { "1.25rem" }
                }
            }) {
                +"This is just a basic paragraph to demonstrate my non-existent skills."
            }

            (::div.styled {
                margins {
                    top { "1.25rem" }
                }
            }) {
                pushButton {
                    color { "hotpink" }
                    text("Test")
                }
            }
            funkyText { +"fritz2 Template Demo" }
            val store = storeOf(false)
            (::p.styled {
               margins {
                   top { "3rem" }
               }
            }) {
                +"store = "
                store.data.asText()
            }
            checkbox {
                label( "change value")
                checked { store.data }
                events {
                    changes.states() handledBy store.update
                }
            }
        }
    }.mount("target")
}