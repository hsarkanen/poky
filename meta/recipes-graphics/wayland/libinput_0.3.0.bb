SUMMARY = "Library to handle input devices in Wayland compositors"
HOMEPAGE = "http://www.freedesktop.org/wiki/Software/libinput/"
SECTION = "libs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=673e626420c7f859fbe2be3a9c13632d"

DEPENDS = "libevdev udev mtdev"

SRC_URI = "http://www.freedesktop.org/software/${BPN}/${BP}.tar.xz"
SRC_URI[md5sum] = "1ab74403a69538c35ed99c55b796a9dd"
SRC_URI[sha256sum] = "5859dfc30d5a1a8c0141be0880b5e84c842230c621b8b0d45610ff3c1366b913"

inherit autotools pkgconfig
