SUMMARY = "Library to handle input devices in Wayland compositors"
HOMEPAGE = "http://www.freedesktop.org/wiki/Software/libinput/"
SECTION = "libs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=673e626420c7f859fbe2be3a9c13632d"

DEPENDS = "libevdev udev mtdev"

SRC_URI = "http://www.freedesktop.org/software/${BPN}/${BP}.tar.xz"
SRC_URI[md5sum] = "9ac28ca42670d38d8f785e96506c9227"
SRC_URI[sha256sum] = "57747436ac6a2ed9fe7745093acdd96fdce699bad6074c6e89450367d74192c7"

inherit autotools pkgconfig
