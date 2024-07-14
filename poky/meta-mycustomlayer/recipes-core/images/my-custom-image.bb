
DESCRIPTION = "My Custom Debian Image"
LICENSE = "MIT"
inherit core-image

IMAGE_INSTALL += " \
    packagegroup-core-ssh-openssh \
    packagegroup-core-tools \
    "

