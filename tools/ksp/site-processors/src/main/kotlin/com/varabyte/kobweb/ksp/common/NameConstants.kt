package com.varabyte.kobweb.ksp.common

private const val KOBWEB_FQN_PREFIX = "com.varabyte.kobweb."
private const val KOBWEB_CORE_FQN_PREFIX = "${KOBWEB_FQN_PREFIX}core."
private const val KOBWEB_SILK_FQN_PREFIX = "${KOBWEB_FQN_PREFIX}silk."
private const val KOBWEB_API_FQN_PREFIX = "${KOBWEB_FQN_PREFIX}api."

const val RESPONSE_FQN = "${KOBWEB_API_FQN_PREFIX}http.Response"

const val INIT_API_FQN = "${KOBWEB_API_FQN_PREFIX}init.InitApi"
const val API_INTERCEPTOR_FQN = "${KOBWEB_API_FQN_PREFIX}intercept.ApiInterceptor"
const val PACKAGE_MAPPING_API_FQN = "${KOBWEB_API_FQN_PREFIX}PackageMapping"
const val API_FQN = "${KOBWEB_API_FQN_PREFIX}Api"
const val API_STREAM_SIMPLE_NAME = "ApiStream"
const val API_STREAM_FQN = "${KOBWEB_API_FQN_PREFIX}stream.$API_STREAM_SIMPLE_NAME"

const val APP_FQN = "${KOBWEB_CORE_FQN_PREFIX}App"
const val INIT_KOBWEB_FQN = "${KOBWEB_CORE_FQN_PREFIX}init.InitKobweb"
const val INIT_SILK_FQN = "${KOBWEB_SILK_FQN_PREFIX}init.InitSilk"
const val PACKAGE_MAPPING_PAGE_FQN = "${KOBWEB_CORE_FQN_PREFIX}PackageMapping"
const val PAGE_FQN = "${KOBWEB_CORE_FQN_PREFIX}Page"
const val CSS_NAME_FQN = "${KOBWEB_SILK_FQN_PREFIX}style.CssName"
const val CSS_PREFIX_FQN = "${KOBWEB_SILK_FQN_PREFIX}style.CssPrefix"
const val CSS_LAYER_FQN = "${KOBWEB_SILK_FQN_PREFIX}style.CssLayer"

const val KEYFRAMES_FQN = "${KOBWEB_SILK_FQN_PREFIX}style.animation.Keyframes"
const val CSS_STYLE_FQN = "${KOBWEB_SILK_FQN_PREFIX}style.CssStyle"
const val CSS_STYLE_VARIANT_FQN = "${KOBWEB_SILK_FQN_PREFIX}style.CssStyleVariant"
const val CSS_KIND_COMPONENT_FQN = "${KOBWEB_SILK_FQN_PREFIX}style.ComponentKind"
const val CSS_KIND_RESTRICTED_FQN = "${KOBWEB_SILK_FQN_PREFIX}style.RestrictedKind"
const val CSS_KIND_GENERAL_FQN = "${KOBWEB_SILK_FQN_PREFIX}style.GeneralKind"
