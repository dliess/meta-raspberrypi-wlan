SUMMARY = "core-image-base-wlan"

include recipes-core/images/core-image-base.bb

IMAGE_INSTALL_append = "\
    openssl \
    openssh-sftp-server \
    linux-firmware-rpidistro-bcm43430 \
"

