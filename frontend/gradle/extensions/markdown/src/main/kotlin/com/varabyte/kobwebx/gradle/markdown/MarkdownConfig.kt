@file:Suppress("LeakingThis") // Following official Gradle guidance

package com.varabyte.kobwebx.gradle.markdown

import org.gradle.api.provider.Property

abstract class MarkdownConfig {
    /**
     * The path to all markdown resources to process.
     *
     * This path should live in the root of the project's `resources` folder, e.g. `src/jsMain/resources`
     */
    abstract val markdownPath: Property<String>

    init {
        markdownPath.convention("markdown")
    }
}

/**
 * List feature extensions to markdown that this plugin supports.
 *
 * This block will be nested under [MarkdownConfig], e.g.
 *
 * ```
 * kobwebx {
 *   markdown {
 *     features { ... }
 *   }
 * }
 * ```
 */
abstract class MarkdownFeatures {
    /**
     * If true, convert URLs and email addresses into links automatically.
     *
     * See also: https://github.com/commonmark/commonmark-java#autolink
     */
    abstract val autolink: Property<Boolean>

    /**
     * If true, support front matter (a header YAML block at the top of your markdown file with key/value pairs)
     *
     * See also: https://github.com/commonmark/commonmark-java#yaml-front-matter
     */
    abstract val frontMatter: Property<Boolean>

    /**
     * If true, support creating tables via pipe syntax.
     *
     * See also: https://github.com/commonmark/commonmark-java#tables
     * See also: https://docs.github.com/en/github/writing-on-github/working-with-advanced-formatting/organizing-information-with-tables
     */
    abstract val tables: Property<Boolean>

    /**
     * If true, support creating task list items via a convenient syntax:
     *
     * ```
     * - [ ] task #1
     * - [x] task #2
     * ```
     *
     * See also: https://github.com/commonmark/commonmark-java#task-list-items
     */
    abstract val taskList: Property<Boolean>

    init {
        autolink.convention(true)
        frontMatter.convention(true)
        tables.convention(true)
        taskList.convention(true)
    }
}

/**
 * Specify which composable components should be used to render various html tags generated by the markdown parser.
 *
 * This block will be nested under [MarkdownConfig], e.g.
 *
 * ```
 * kobwebx {
 *   markdown {
 *     components { ... }
 *   }
 * }
 * ```
 */
abstract class MarkdownComponents {
    abstract val text: Property<String>
    abstract val img: Property<String>
    abstract val h1: Property<String>
    abstract val h2: Property<String>
    abstract val h3: Property<String>
    abstract val p: Property<String>
    abstract val br: Property<String>
    abstract val a: Property<String>
    abstract val em: Property<String>
    abstract val b: Property<String>
    abstract val i: Property<String>
    abstract val hr: Property<String>
    abstract val ul: Property<String>
    abstract val ol: Property<String>
    abstract val li: Property<String>
    abstract val code: Property<String>
    abstract val inlineCode: Property<String>
    abstract val table: Property<String>
    abstract val thead: Property<String>
    abstract val tbody: Property<String>
    abstract val tr: Property<String>
    abstract val td: Property<String>
    abstract val th: Property<String>

    init {
        text.convention("org.jetbrains.compose.web.dom.Text")
        img.convention("org.jetbrains.compose.web.dom.Img")
        h1.convention("org.jetbrains.compose.web.dom.H1")
        h2.convention("org.jetbrains.compose.web.dom.H2")
        h3.convention("org.jetbrains.compose.web.dom.H3")
        p.convention("org.jetbrains.compose.web.dom.P")
        br.convention("org.jetbrains.compose.web.dom.Br")
        a.convention("org.jetbrains.compose.web.dom.A")
        em.convention("org.jetbrains.compose.web.dom.Em")
        b.convention("org.jetbrains.compose.web.dom.B")
        i.convention("org.jetbrains.compose.web.dom.I")
        hr.convention("org.jetbrains.compose.web.dom.Hr")
        ul.convention("org.jetbrains.compose.web.dom.Ul")
        ol.convention("org.jetbrains.compose.web.dom.Ol")
        li.convention("org.jetbrains.compose.web.dom.Li")
        code.convention("org.jetbrains.compose.web.dom.Code")
        inlineCode.convention("org.jetbrains.compose.web.dom.Code")
        table.convention("org.jetbrains.compose.web.dom.Table")
        thead.convention("org.jetbrains.compose.web.dom.Thead")
        tbody.convention("org.jetbrains.compose.web.dom.Tbody")
        tr.convention("org.jetbrains.compose.web.dom.Tr")
        td.convention("org.jetbrains.compose.web.dom.Td")
        th.convention("org.jetbrains.compose.web.dom.Th")
    }
}