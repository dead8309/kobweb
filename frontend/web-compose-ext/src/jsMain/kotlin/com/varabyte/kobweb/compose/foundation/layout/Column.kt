package com.varabyte.kobweb.compose.foundation.layout

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.asAttributeBuilder
import com.varabyte.kobweb.compose.ui.webModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

class ColumnScope {
    fun Modifier.align(alignment: Alignment.Horizontal) = webModifier {
        style {
            when (alignment) {
                Alignment.Start -> alignSelf(AlignSelf.FlexStart)
                Alignment.CenterHorizontally -> alignSelf(AlignSelf.Center)
                Alignment.End -> alignSelf(AlignSelf.FlexEnd)
            }
        }
    }
}

@Composable
fun Column(
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit
) {
    Div(attrs = modifier.asAttributeBuilder {
        style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)

            when {
                verticalArrangement === Arrangement.Top -> justifyContent(JustifyContent.FlexStart)
                verticalArrangement === Arrangement.Bottom -> justifyContent(JustifyContent.FlexEnd)
            }

            when {
                horizontalAlignment === Alignment.Start -> alignItems(AlignItems.FlexStart)
                horizontalAlignment === Alignment.CenterHorizontally -> alignItems(AlignItems.Center)
                horizontalAlignment === Alignment.End -> alignItems(AlignItems.FlexEnd)
            }
        }
    }) {
        ColumnScope().content()
    }
}