package react.bootstrap.site.components.docs.layout.grid

import kotlinx.html.ThScope
import react.RBuilder
import react.bootstrap.lib.ClassNames
import react.bootstrap.site.components.docs.fixings.contentTitle
import react.bootstrap.site.components.docs.ln
import react.dom.code
import react.dom.p
import react.dom.small
import react.dom.table
import react.dom.tbody
import react.dom.td
import react.dom.th
import react.dom.thead
import react.dom.tr

internal fun RBuilder.gridOptions() {
    contentTitle("Grid options")
    p {
        +"While Bootstrap uses "; code { +"em" }; +"s or "; code { +"rem" }; +"s for defining most sizes, "
        code { +"px" }; +"s are used for grid breakpoints and container widths. This is because the viewport width is "
        +"in pixels and does not change with the font size."
    }
    p {
        +"See how aspects of the Bootstrap grid system work across multiple devices with a handy table."
    }
    table("${ClassNames.TABLE} ${ClassNames.TABLE_BORDERED} ${ClassNames.TABLE_STRIPED}") {
        thead {
            tr {
                th { }
                th(classes = "${ClassNames.TEXT_CENTER}") {
                    ln { +"Extra small" }
                    small { +"<576px" }
                }
                th(classes = "${ClassNames.TEXT_CENTER}") {
                    ln { +"Small" }
                    small { +"≥576px" }
                }
                th(classes = "${ClassNames.TEXT_CENTER}") {
                    ln { +"Medium" }
                    small { +"≥768px" }
                }
                th(classes = "${ClassNames.TEXT_CENTER}") {
                    ln { +"Large" }
                    small { +"≥992px" }
                }
                th(classes = "${ClassNames.TEXT_CENTER}") {
                    ln { +"Extra Large" }
                    small { +"≥1200px" }
                }
            }
        }
        tbody {
            tr {
                th(scope = ThScope.row, classes = "${ClassNames.TEXT_NOWRAP}") { +"Max container width" }
                td { +"None (auto)" }
                td { +"540px" }
                td { +"720px" }
                td { +"960px" }
                td { +"1140px" }
            }
            tr {
                th(scope = ThScope.row, classes = "${ClassNames.TEXT_NOWRAP}") { +"Function Argument" }
                td { code { +"$colFun(col = )" } }
                td { code { +"$colFun(sm = )" } }
                td { code { +"$colFun(md = )" } }
                td { code { +"$colFun(lg = )" } }
                td { code { +"$colFun(xl = )" } }
            }
            tr {
                th(scope = ThScope.row, classes = "${ClassNames.TEXT_NOWRAP}") { +"# of columns" }
                td { attrs { colSpan = "5" }; +"12" }
            }
            tr {
                th(scope = ThScope.row, classes = "${ClassNames.TEXT_NOWRAP}") { +"Gutter width" }
                td { attrs { colSpan = "5" }; +"30px (15px on each side of a column" }
            }
            tr {
                th(scope = ThScope.row, classes = "${ClassNames.TEXT_NOWRAP}") { +"Nestable" }
                td { attrs { colSpan = "5" }; +"Yes" }
            }
            tr {
                th(scope = ThScope.row, classes = "${ClassNames.TEXT_NOWRAP}") { +"Column ordering" }
                td { attrs { colSpan = "5" }; +"Yes" }
            }
        }
    }
}
