DESCRIPTION = "Recipe to sign the kernel image for Secure Boot"

SRC_URI = "file://signing-script.sh"
S = "${WORKDIR}"

LIC_FILES_CHKSUM = "file://signing-script.sh;md5=5cbfa2805669fd483ba11b5de02ccf6b"
LICENSE = "MIT"

DEPENDS = "virtual/kernel"


inherit kernel-fitimage


do_sign_kernel() {
    echo "JACKWANG do_sign_kernel() Signing the kernel image... )))))"
    echo "JACKWANG do_sign_kernel() KERNEL_FIT_SIGNING_KEY = ${KERNEL_FIT_SIGNING_KEY}"
    echo "JACKWANG do_sign_kernel() KERNEL_FIT_SIGNING_CERT= ${KERNEL_FIT_SIGNING_CERT}" 
    echo "JACKWANG do_sign_kernel() DEPLOY_DIR_IMAGE= ${DEPLOY_DIR_IMAGE}"
    echo "JACKWANG do_sign_kernel() MACHINE= ${MACHINE}"
    sleep 10
    /usr/bin/sbsign --key ${KERNEL_FIT_SIGNING_KEY} --cert ${KERNEL_FIT_SIGNING_CERT} --output ${DEPLOY_DIR_IMAGE}/bzImage-${MACHINE}.signed ${DEPLOY_DIR_IMAGE}/bzImage-${MACHINE}.bin
}

do_custom_task[depends] += "virtual/kernel:do_compile_kernel"

addtask do_sign_kernel after do_compile before do_install

