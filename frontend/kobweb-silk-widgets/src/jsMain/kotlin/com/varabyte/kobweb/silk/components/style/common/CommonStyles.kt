package com.varabyte.kobweb.silk.components.style.common

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.ariaDisabled
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.CssRule
import com.varabyte.kobweb.silk.components.style.StyleModifiers
import com.varabyte.kobweb.silk.components.style.active
import com.varabyte.kobweb.silk.components.style.base
import org.jetbrains.compose.web.css.*

// Note: CSS provides a `disabled` selector, but disabling elements using HTML properties prevents mouse events from
// firing, and this is bad because you might want to show tooltips even for a disabled element. Some solutions online
// solve this by wrapping disabled elements in a parent element, but this can screw up things like flexbox rows and
// columns, which act on their direct children and *not* children of children (e.g. missing a `flex-grow` setting on
// an element just because you wrapped it with a tooltip).
// Instead, we just immitate disabled behavior ourselves in silk.
val DisabledStyle = ComponentStyle.base(
    "silk-disabled",
    extraModifiers = Modifier.ariaDisabled()
) {
    Modifier.opacity(0.5).cursor(Cursor.NotAllowed)
}

/**
 * A way to select elements that have been tagged with an `aria-disabled` attribute.
 *
 * This is different from the `:disabled` psuedo-class selector! There are various reasons to use the ARIA version over
 * the HTML version; for example, some elements don't support `disabled` and also `disabled` elements don't fire
 * mouse events, which can be useful e.g. when implementing tooltips.
 */
val StyleModifiers.ariaDisabled get() = CssRule.OfAttributeSelector(this, """aria-disabled="true"""")
