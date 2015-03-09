Copyright (c) 1992-2012 The FreeBSD Project.
Copyright (c) 1979, 1980, 1983, 1986, 1988, 1989, 1991, 1992, 1993, 1994
	The Regents of the University of California. All rights reserved.
FreeBSD is a registered trademark of The FreeBSD Foundation.
FreeBSD 8.3-RELEASE-p16 #0: Mon Aug 25 08:27:11 EDT 2014
    root@pf2_1_1_amd64.pfsense.org:/usr/obj.amd64/usr/pfSensesrc/src/sys/pfSense_SMP.8 amd64
Timecounter "i8254" frequency 1193182 Hz quality 0
CPU: AMD Phenom(tm) II X4 965 Processor (3378.91-MHz K8-class CPU)
  Origin = "AuthenticAMD"  Id = 0x100f43  Family = 10  Model = 4  Stepping = 3
  Features=0x783fbff<FPU,VME,DE,PSE,TSC,MSR,PAE,MCE,CX8,APIC,SEP,MTRR,PGE,MCA,CMOV,PAT,PSE36,MMX,FXSR,SSE,SSE2>
  Features2=0x9<SSE3,MON>
  AMD Features=0xea100800<SYSCALL,NX,FFXSR,RDTSCP,LM,3DNow!+,3DNow!>
  AMD Features2=0x11<LAHF,CR8>
  TSC: P-state invariant
real memory  = 268369920 (255 MB)
avail memory = 232529920 (221 MB)
ACPI APIC Table: <VBOX   VBOXAPIC>
ioapic0 <Version 1.1> irqs 0-23 on motherboard
wlan: mac acl policy registered
ipw_bss: You need to read the LICENSE file in /usr/share/doc/legal/intel_ipw/.
ipw_bss: If you agree with the license, set legal.intel_ipw.license_ack=1 in /boot/loader.conf.
module_register_init: MOD_LOAD (ipw_bss_fw, 0xffffffff804abaf0, 0) error 1
ipw_ibss: You need to read the LICENSE file in /usr/share/doc/legal/intel_ipw/.
ipw_ibss: If you agree with the license, set legal.intel_ipw.license_ack=1 in /boot/loader.conf.
module_register_init: MOD_LOAD (ipw_ibss_fw, 0xffffffff804abb90, 0) error 1
ipw_monitor: You need to read the LICENSE file in /usr/share/doc/legal/intel_ipw/.
ipw_monitor: If you agree with the license, set legal.intel_ipw.license_ack=1 in /boot/loader.conf.
module_register_init: MOD_LOAD (ipw_monitor_fw, 0xffffffff804abc30, 0) error 1
kbd1 at kbdmux0
cryptosoft0: <software crypto> on motherboard
padlock0: No ACE support.
acpi0: <VBOX VBOXXSDT> on motherboard
acpi0: [ITHREAD]
acpi0: Power Button (fixed)
acpi0: Sleep Button (fixed)
Timecounter "ACPI-safe" frequency 3579545 Hz quality 850
acpi_timer0: <32-bit timer at 3.579545MHz> port 0x4008-0x400b on acpi0
cpu0: <ACPI CPU> on acpi0
pcib0: <ACPI Host-PCI bridge> port 0xcf8-0xcff on acpi0
pci0: <ACPI PCI bus> on pcib0
isab0: <PCI-ISA bridge> at device 1.0 on pci0
isa0: <ISA bus> on isab0
atapci0: <Intel PIIX4 UDMA33 controller> port 0x1f0-0x1f7,0x3f6,0x170-0x177,0x376,0xd000-0xd00f at device 1.1 on pci0
ata0: <ATA channel> at channel 0 on atapci0
ata0: [ITHREAD]
ata1: <ATA channel> at channel 1 on atapci0
ata1: [ITHREAD]
vgapci0: <VGA-compatible display> mem 0xe0000000-0xe0ffffff irq 18 at device 2.0 on pci0
em0: <Intel(R) PRO/1000 Legacy Network Connection 1.0.6> port 0xd010-0xd017 mem 0xf0000000-0xf001ffff irq 19 at device 3.0 on pci0
em0: [FILTER]
pci0: <base peripheral> at device 4.0 (no driver attached)
pci0: <bridge> at device 7.0 (no driver attached)
em1: <Intel(R) PRO/1000 Legacy Network Connection 1.0.6> port 0xd040-0xd047 mem 0xf0820000-0xf083ffff irq 16 at device 8.0 on pci0
em1: [FILTER]
em2: <Intel(R) PRO/1000 Legacy Network Connection 1.0.6> port 0xd048-0xd04f mem 0xf0840000-0xf085ffff irq 17 at device 9.0 on pci0
em2: [FILTER]
acpi_acad0: <AC Adapter> on acpi0
atkbdc0: <Keyboard controller (i8042)> port 0x60,0x64 irq 1 on acpi0
atkbd0: <AT Keyboard> irq 1 on atkbdc0
kbd0 at atkbd0
atkbd0: [GIANT-LOCKED]
atkbd0: [ITHREAD]
psm0: <PS/2 Mouse> irq 12 on atkbdc0
psm0: [GIANT-LOCKED]
psm0: [ITHREAD]
psm0: model IntelliMouse Explorer, device ID 4
orm0: <ISA Option ROMs> at iomem 0xc0000-0xc7fff,0xe2000-0xeefff on isa0
sc0: <System console> at flags 0x100 on isa0
sc0: VGA <16 virtual consoles, flags=0x300>
vga0: <Generic ISA VGA> at port 0x3c0-0x3df iomem 0xa0000-0xbffff on isa0
atrtc0: <AT Real Time Clock> at port 0x70 irq 8 on isa0
ppc0: cannot reserve I/O port range
Timecounter "TSC" frequency 3378907615 Hz quality 800
Timecounters tick every 10.000 msec
IPsec: Initialized Security Association Processing.
ad0: 2048MB <VBOX HARDDISK 1.0> at ata0-master UDMA33
acd0: DVDROM <VBOX CD-ROM/1.0> at ata1-master UDMA33
Trying to mount root from ufs:/dev/ad0s1a
WARNING: / was not properly dismounted
ZFS NOTICE: Prefetch is disabled by default if less than 4GB of RAM is present;
            to enable, add "vfs.zfs.prefetch_disable=0" to /boot/loader.conf.
ZFS WARNING: Recommended minimum RAM size is 512MB; expect unstable behavior.
ZFS WARNING: Recommended minimum kmem_size is 512MB; expect unstable behavior.
             Consider tuning vm.kmem_size and vm.kmem_size_max
             in /boot/loader.conf.
ZFS filesystem version 5
ZFS storage pool version 28
