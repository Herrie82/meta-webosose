# Copyright (c) 2020 LG Electronics, Inc.

DESCRIPTION = "location framework which provides location based services implementing location handlers, plugins, and Luna location service"
AUTHOR = "vibhanshu.dhote <vibhanshu.dhote@lge.com>"
SECTION = "webos/location"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "glib-2.0 libpbnjson libxml2 pmloglib luna-service2 luna-prefs loc-utils boost"

WEBOS_VERSION = "1.0.0-74_0cb7961921d8eec1969a26111798ea01c744cab2"
PR = "r0"

inherit webos_component
inherit webos_public_repo
inherit webos_enhanced_submissions
inherit webos_cmake
inherit webos_library
inherit webos_program
inherit webos_system_bus
inherit webos_machine_impl_dep

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/location/plugins/lib*.so"
FILES_${PN}-dbg += "${libdir}/location/plugins/.debug"
SECURITY_STRINGFORMAT = ""
