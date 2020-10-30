SUMMARY = "core-image-base-wlan"

include recipes-core/images/core-image-base.bb

MACHINE_FEATURES += "wifi"

DISTRO_FEATURES_append = "\
    systemd \
    wifi \
"

IMAGE_FEATURES += "ssh-server-dropbear"

VIRTUAL-RUNTIME_init_manager = "systemd"
VIRTUAL-RUNTIME_initscripts = ""
DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"

IMAGE_INSTALL_append = "\
    openssl \
    openssh-sftp-server \
    linux-firmware-rpidistro-bcm43430 \
"

