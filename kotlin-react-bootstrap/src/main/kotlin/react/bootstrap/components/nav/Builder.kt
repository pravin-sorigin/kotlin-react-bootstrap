package react.bootstrap.components.nav

import react.Component
import react.RBuilder
import react.RElementBuilder
import react.RHandler
import react.ReactElement
import react.bootstrap.lib.Builder
import react.bootstrap.lib.NoArgEventHandler
import react.bootstrap.splitClassesToSet
import kotlin.reflect.KClass

class NavBuilder(override val builder: RBuilder) : Builder {
    private fun <P : Navs.Props> RBuilder.buildNav(
        klazz: KClass<out Component<P, *>>,
        classes: String? = null,
        appearance: Navs.Appearance? = null,
        widthHandling: Navs.WidthHandling? = null,
        activeLinkPredicate: ((NavLink.Props) -> Boolean)? = null,
        block: RHandler<P>
    ): ReactElement = child(klazz) {
        attrs {
            this.classes = classes.splitClassesToSet()
            this.appearance = appearance
            this.widthHandling = widthHandling
            this.activeLinkPredicate = activeLinkPredicate
        }

        block()
    }

    fun ul(
        classes: String? = null,
        appearance: Navs.Appearance? = null,
        widthHandling: Navs.WidthHandling? = null,
        activeLinkPredicate: (NavLink.Props.() -> Boolean)? = null,
        block: RHandler<Navs.Ul.Props>
    ): ReactElement =
        builder.buildNav(
            klazz = Navs.Ul::class,
            classes = classes,
            appearance = appearance,
            widthHandling = widthHandling,
            activeLinkPredicate = activeLinkPredicate,
            block = block
        )

    fun ol(
        classes: String? = null,
        appearance: Navs.Appearance? = null,
        widthHandling: Navs.WidthHandling? = null,
        activeLinkPredicate: (NavLink.Props.() -> Boolean)? = null,
        block: RHandler<Navs.Ol.Props>
    ): ReactElement =
        builder.buildNav(
            klazz = Navs.Ol::class,
            classes = classes,
            appearance = appearance,
            widthHandling = widthHandling,
            activeLinkPredicate = activeLinkPredicate,
            block = block
        )

    fun nav(
        classes: String? = null,
        appearance: Navs.Appearance? = null,
        widthHandling: Navs.WidthHandling? = null,
        activeLinkPredicate: (NavLink.Props.() -> Boolean)? = null,
        block: RHandler<Navs.Nav.Props>
    ): ReactElement =
        builder.buildNav(
            klazz = Navs.Nav::class,
            classes = classes,
            appearance = appearance,
            widthHandling = widthHandling,
            activeLinkPredicate = activeLinkPredicate,
            block = block
        )

    fun div(
        classes: String? = null,
        appearance: Navs.Appearance? = null,
        widthHandling: Navs.WidthHandling? = null,
        activeLinkPredicate: (NavLink.Props.() -> Boolean)? = null,
        block: RHandler<Navs.Div.Props>
    ): ReactElement =
        builder.buildNav(
            klazz = Navs.Div::class,
            classes = classes,
            appearance = appearance,
            widthHandling = widthHandling,
            activeLinkPredicate = activeLinkPredicate,
            block = block
        )
}

val RBuilder.Navs
    get() = NavBuilder(this)

private fun <P : NavItems.Props> RBuilder.buildNavItem(
    klazz: KClass<out Component<P, *>>,
    classes: String? = null,
    block: RHandler<P>
) = child(klazz) {
    attrs {
        this.classes = classes.splitClassesToSet()
    }

    block()
}

fun RElementBuilder<Navs.Ul.Props>.navItem(
    classes: String? = null,
    block: RHandler<NavItems.Li.Props>
): ReactElement = buildNavItem(NavItems.Li::class, classes, block)

fun RElementBuilder<Navs.Ol.Props>.navItem(
    classes: String? = null,
    block: RHandler<NavItems.Li.Props>
): ReactElement = buildNavItem(NavItems.Li::class, classes, block)

fun RElementBuilder<Navs.Nav.Props>.navItem(
    classes: String? = null,
    block: RHandler<NavItems.NavItem.Props>
): ReactElement = buildNavItem(NavItems.NavItem::class, classes, block)

fun RElementBuilder<Navs.Div.Props>.navItem(
    classes: String? = null,
    block: RHandler<NavItems.DivItem.Props>
): ReactElement = buildNavItem(NavItems.DivItem::class, classes, block)

private fun RBuilder.buildNavLink(
    href: String? = null,
    classes: String? = null,
    target: String? = null,
    active: Boolean? = null,
    onActive: NoArgEventHandler? = null,
    disabled: Boolean? = null,
    block: RHandler<NavLink.Props>
): ReactElement = child(NavLink::class) {
    attrs {
        this.href = href
        this.target = target
        this.active = active
        this.onActive = onActive
        this.disabled = disabled
        this.classes = classes.splitClassesToSet()
    }
    block()
}

fun RElementBuilder<NavItems.Li.Props>.navLink(
    href: String? = null,
    classes: String? = null,
    target: String? = null,
    active: Boolean? = null,
    onActive: NoArgEventHandler? = null,
    disabled: Boolean? = null,
    block: RHandler<NavLink.Props>
): ReactElement = buildNavLink(href, classes, target, active, onActive, disabled, block)

fun RElementBuilder<Navs.Nav.Props>.navLink(
    href: String? = null,
    classes: String? = null,
    target: String? = null,
    active: Boolean? = null,
    onActive: NoArgEventHandler? = null,
    disabled: Boolean? = null,
    block: RHandler<NavLink.Props>
): ReactElement = buildNavLink(href, classes, target, active, onActive, disabled, block)

fun RElementBuilder<NavItems.NavItem.Props>.navLink(
    href: String? = null,
    classes: String? = null,
    target: String? = null,
    active: Boolean? = null,
    onActive: NoArgEventHandler? = null,
    disabled: Boolean? = null,
    block: RHandler<NavLink.Props>
): ReactElement = buildNavLink(href, classes, target, active, onActive, disabled, block)

fun RElementBuilder<Navs.Div.Props>.navLink(
    href: String? = null,
    classes: String? = null,
    target: String? = null,
    active: Boolean? = null,
    onActive: NoArgEventHandler? = null,
    disabled: Boolean? = null,
    block: RHandler<NavLink.Props>
): ReactElement = buildNavLink(href, classes, target, active, onActive, disabled, block)

fun RElementBuilder<NavItems.DivItem.Props>.navLink(
    href: String? = null,
    classes: String? = null,
    target: String? = null,
    active: Boolean? = null,
    onActive: NoArgEventHandler? = null,
    disabled: Boolean? = null,
    block: RHandler<NavLink.Props>
): ReactElement = buildNavLink(href, classes, target, active, onActive, disabled, block)