SUMMARY = "A recipe to execute a custom command"
DESCRIPTION = "This recipe executes a specified Ubuntu command during the build process"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Define a custom task
do_execute_cmd() {
    # Replace 'your-command' with the actual Ubuntu command you want to execute
    echo " THIS SI HACJJJJJJJ"    
}

# Specify when to run the custom task
addtask execute_cmd after do_compile before do_install

