package react.bootstrap.site.components.docs.content.typography

import react.RBuilder
import react.bootstrap.content.typography.mark
import react.bootstrap.content.typography.small
import react.bootstrap.site.components.docs.fixings.contentTitle
import react.bootstrap.site.components.docs.fixings.example
import react.bootstrap.site.components.docs.fixings.codeBox
import react.bootstrap.site.components.docs.layout.grid.ktBlock
import react.bootstrap.site.components.docs.ln
import react.dom.br
import react.dom.code
import react.dom.p
import react.dom.span

internal fun RBuilder.inlineTextElements() {
    contentTitle("Inline text elements")
    p {
        +"Alternative implementations of "; code { +"mark { }" }; +" and "; code { +"small { }" }; +" are provided to"
        +" to apply the same styles while avoiding any unwanted semantic implications that the tags would bring."
    }
    example {
        p {
            +"You can use the alternative mark to "; mark(RBuilder::span) { +"highlight" }; +" text."
        }
        p {
            small(RBuilder::span) { +"This line of text is meant to be treated as fine print." }
        }
    }
    codeBox {
        ln { +"import react.bootstrap.content.typography.mark" }
        ln { +"import react.bootstrap.content.typography.small" }
        br { }
        ktBlock(0, "p") { il ->
            ln(il) { +"+\"You can use the mark tag to \";  mark(RBuilder::span) { +\"highlight\" }; +\" text.\"" }
        }
        ktBlock(0, "p") { il ->
            ln(il) { +"small(RBuilder::span) { +\"This line of text is meant to be treated as fine print.\" }" }
        }
    }
}
